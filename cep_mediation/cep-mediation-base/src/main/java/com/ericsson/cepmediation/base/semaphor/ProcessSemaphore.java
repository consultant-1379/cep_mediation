package com.ericsson.cepmediation.base.semaphor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * This class provides means for blocking one process until any number of other processes have finished.
 * 
 * @author emicned
 */
public class ProcessSemaphore {
    private static final ProcessSemaphore instance = new ProcessSemaphore();

    private Map<String, ProcessState> label2state = new HashMap<String, ProcessState>();

    private ReentrantLock lock = new ReentrantLock();

    private ProcessSemaphore() {
    }

    public static ProcessSemaphore getInstance() {
        return instance;
    }

    /** 
     * Blocks the currently executing thread until some other thread(s) signals that execution can continue.
     * 
     * Before doing anything, this method checks that certain time has elapsed
     * since producerFinished was invoked and waits if necessary.
     */
    public void await(String label) {
        getState(label).await();
    }

    /**
     * Indicates to the waiting thread that it should wait until consumerFinished is invoked.
     * 
     * Multiple threads can invoke consumerStarted and producer thread should wait
     * for all started threads to signal their end.
     * 
     * This method should be used in try/finally manner with consumerFinished.
     */
    public void consumerStarted(String label) {
        if (label2state.containsKey(label)) {
            getState(label).consumerStarted();
        }
    }

    /** 
     * Indicates that invoking thread has finished
     */
    public void consumerFinished(String label) {
        if (label2state.containsKey(label)) {
            getState(label).consumerFinished();
        }
    }

    private ProcessState getState(String label) {
        lock.lock();
        try {
            ProcessState state = label2state.get(label);
            if (state == null) {
                state = new ProcessState(label);
                label2state.put(label, state);
            }
            return state;
        } finally {
            lock.unlock();
        }
    }
}
