/**
 * Stop watch use to count timer by system nano time and have 2 differrent reader option
 * 1.fileinputsteam
 * 2.bufferreader
 *
 * @author Thnakrit Daorueang
 */
public class StopWatch {

    public static long Start = 0;
    public static long End = 0;
    public boolean isRun = false;

    /**
     *
     */
    public void start() {
        isRun = true;
        Start = System.nanoTime();
    }

    /**
     *
     */
    public void stop() {
        isRun = false;
        End = (System.nanoTime() - 0);
    }

    /**
     * @return
     */
    public boolean isRunning() {
        return isRun;
    }

    /**
     * @return
     */
    public double getElapsed() {
        if (isRun) return (System.nanoTime() - Start) * 1.0E-9;
        return (End - Start) * 1.0E-9;
    }

}
