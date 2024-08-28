package com.ericsson.cepmediation.base.semaphor;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessSemaphoreTest {
    private static final Logger logger = LoggerFactory.getLogger(ProcessSemaphoreTest.class);

    private static final String label = "lab";

    @Test
    public void processShouldWait() throws InterruptedException {
        StringBuffer digits = new StringBuffer();

        Producer producer = new Producer(digits, 10 * 1000);
        logger.debug("starting producer");
        producer.start();

        Thread.sleep(5000);
        logger.debug("digits: " + digits.toString());
        assertThat(Integer.parseInt(digits.toString()), is(1));

        logger.debug("starting consumer");
        ProcessSemaphore.getInstance().consumerStarted(label);
        Thread.sleep(10000);

        logger.debug("digits: " + digits.toString());
        assertThat(Integer.parseInt(digits.toString()), is(1));

        logger.debug("consumer finished");
        ProcessSemaphore.getInstance().consumerFinished(label);
        Thread.sleep(5000);

        logger.debug("digits: " + digits.toString());
        assertThat(Integer.parseInt(digits.toString()), is(12));

        logger.debug("starting 3 consumers");
        ProcessSemaphore.getInstance().consumerStarted(label);
        ProcessSemaphore.getInstance().consumerStarted(label);
        ProcessSemaphore.getInstance().consumerStarted(label);
        Thread.sleep(10000);

        logger.debug("digits: " + digits.toString());
        assertThat(Integer.parseInt(digits.toString()), is(12));

        logger.debug("consumer 1 finished");
        ProcessSemaphore.getInstance().consumerFinished(label);
        Thread.sleep(1000);
        logger.debug("digits: " + digits.toString());
        assertThat(Integer.parseInt(digits.toString()), is(12));

        logger.debug("consumer 2 finished");
        ProcessSemaphore.getInstance().consumerFinished(label);
        Thread.sleep(1000);
        logger.debug("digits: " + digits.toString());
        assertThat(Integer.parseInt(digits.toString()), is(12));

        logger.debug("consumer 3 finished");
        ProcessSemaphore.getInstance().consumerFinished(label);
        Thread.sleep(5000);

        logger.debug("digits: " + digits.toString());
        assertThat(Integer.parseInt(digits.toString()), is(123));

        producer.interrupt();
    }

    class Producer extends Thread {
        private StringBuffer digits;
        private long timeout;
        
        Producer(StringBuffer digits, long timeout) {
            this.digits = digits;
            this.timeout = timeout;
        }

        @Override
        public void run() {
            int i = 1;
            while (!interrupted()) {
                ProcessSemaphore.getInstance().await(label);
                logger.info(digits.toString());
                digits.append(i++);
                try {
                    Thread.sleep(timeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ProcessSemaphore.getInstance().await(label);
            }
        }
    }
}
