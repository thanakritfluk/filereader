public class Main {
    public static void main(String[] args) {
        TaskTimer Task = new TaskTimer();
        Task.runTask(new AppendStringTask());
        Task.runTask(new AppendStringBuilderTask());
        Task.runTask(new AppendBufferedReaderTask());
    }
}
