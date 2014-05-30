// Fast ReadWrite lock
// issues a stamp returned by each locking operation
// any thread acquiring a write lock while optimistic lock is held will cause the unlock to be invalidated

long stamp = lock.tryOptimisticRead(); // non blocking path - super fast
work(); // we're hoping no writing will go on in the meanwhile
if (lock.validate(stamp)){
       //success! no contention with a writer thread 
}
else {
       //another thread must have acquired a write lock in the meanwhile, changing the stamp. 
       //bummer - let's downgrade to a heavier read lock

            stamp = lock.readLock(); //this is a traditional blocking read lock 
       try {
                 //no writing happening now
                 work();

       }
       finally {
            lock.unlock(stamp); // release using the correlating stamp
       }
}

