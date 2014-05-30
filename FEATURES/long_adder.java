// LongAdder() is a new Java8 class that provides an atomic way to add up a large number of values. 
// It is faster than AtomicLong & is equivalent to this simplified version:

static class LongAdderThread implements Runnable{
    public StressTest stressTest;
 
    @Override
    public void run() {
        stressTest.cyclicBarrier.await();
        for (int i = 0; i < 1000000; i++) {
            stressTest.longAdder.increment();
        }
        stressTest.cyclicBarrier.await();
    }
}

// Just instantiate a new LongAdder and use its add() and intValue() methods to increase and sample the counter
