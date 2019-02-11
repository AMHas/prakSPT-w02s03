/**
 *
 * @author andre
 */
package itdel.spt.primecounter;

public class ThreadedPrimeCounter extends PrimeCounter implements Runnable
{
    private final Thread thread;
    private long occurence = 0L;
    
    public ThreadedPrimeCounter(long _min, long _max) {
        super(_min, _max);
        thread = new Thread(this);
    }
    
    public void count() {
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException _ie) {
            System.out.println("interrupted.");
        }
    }
    
    public void run() {
        super.count();
    }
}
