package Synchronization;
/*synchronized is : method level/block level access restriction modifier. 
 * It will make sure that one thread owns the lock for critical section. 
 * Only the thread,which own a lock can enter synchronized block.
 *  If other threads are trying to access this critical section, they have to wait till current owner releases the lock.

volatile is variable access modifier
 *this forces all threads to get latest value of the variable from main memory.
 * No locking is required to access volatile variables. All threads can access volatile variable value at same time.

 A good example to use volatile variable : Date variable.

Assume that you have made Date variable volatile.
 All the threads, which access this variable always get latest data from main memory 
 so that all threads show real (actual) Date value. 
 You don't need different threads showing different time for same variable.
 All threads should show right Date value. 
 */

public class VolatileSynchronizationDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
