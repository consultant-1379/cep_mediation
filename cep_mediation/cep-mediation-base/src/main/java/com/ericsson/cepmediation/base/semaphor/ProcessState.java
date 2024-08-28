package com.ericsson.cepmediation.base.semaphor;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class provides means for one process to wait until it receives a signal to continue from other processes.
 * 
 * @author emicned
 *
 */
class ProcessState {
    private static final Logger logger = LoggerFactory.getLogger(ProcessState.class);

    private final ReentrantLock lock = new ReentrantLock();

    private final Condition await = lock.newCondition();

    private AtomicInteger startedCnt = new AtomicInteger(0);

    private String label;

    ProcessState(String label) {
        this.label = label;
    }

    void await() {
        lock.lock();
        try {
            logger.debug("ProcessState.await: Started processes cnt " + startedCnt.get() + " for threadId " + getThreadId());
            if (startedCnt.get() != 0) {
                logger.debug("ProcessState.await: threadId " + getThreadId() + " waiting for consumer to finish");
                await.await();
                logger.debug("ProcessState.await: threadId " + getThreadId() + " is awake.");
            }
        } catch (InterruptedException e) {
            logger.error("Thread sleep interrupted: " + e + " threadId: " + getThreadId());
        } finally {
            lock.unlock();
        }

    }

    void consumerStarted() {
        startedCnt.incrementAndGet();
        logger.debug("Consumers started for threadId " + getThreadId() + ". Started count: " + startedCnt.get());
    }

    void consumerFinished() {
        lock.lock();
        try {
            if (startedCnt.get() == 0) {
                logger.error("consumerFinished count is bigger than consumerStarted count for label: " + label);
                assert false;
                return;
            }

            if (startedCnt.decrementAndGet() == 0) {
                await.signal();
            }
            logger.debug("Consumers finished for threadId " + getThreadId() + ". Started count: " + startedCnt.get());
        } finally {
            lock.unlock();
        }
    }

    private String getThreadId() {
        String threadId = Thread.currentThread().getId() + "_" + label;
        return threadId;
    }
}
