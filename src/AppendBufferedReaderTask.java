import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppendBufferedReaderTask implements Runnable {
    private double length;

    @Override
    public void run() {
        String alice = readFileBuffer("src\\Alice-in-Wonderland.txt");
        length = alice.length();
    }

    @Override
    public String toString() {
        return String.format("Read file %.0f-char at a time to BufferedReader  |", length);
    }

    public static String readFileBuffer(String filename) {
        String data = "";
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader reader = new BufferedReader(fileReader);
            String readLine = reader.readLine();
            while (readLine != null) {
                data = data + readLine + "\n";
                readLine = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return data;

    }
}
