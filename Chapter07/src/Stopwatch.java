
public class Stopwatch {
    private long startTime;
    private long stopTime;
    private boolean running;
    
    public Stopwatch() {
        running = false;
    }
    
    public void start() {
        if (!running) {
            running = true;
            startTime = System.currentTimeMillis();
        }
    }
    
    public void stop() {
        if (running) {
            stopTime = System.currentTimeMillis();
            running = false;
        }
    }
    
    public double elapsed() {
        return (stopTime - startTime)/1000.0;
    }

}
