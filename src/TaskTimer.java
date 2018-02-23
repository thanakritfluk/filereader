public class TaskTimer {

    public static void runTask(Runnable runnable){
        StopWatch s = new StopWatch();
        s.start();
        runnable.run();
        s.stop();
        System.out.print(runnable.toString());
        System.out.printf("  %.4f sec\n",s.getElapsed());
    }
}
