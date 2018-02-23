import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringTask implements Runnable {

    private double length;

    @Override
    public void run() {
        String alice = readFileToString("src\\Alice-in-Wonderland.txt");
        length = alice.length();
    }

    @Override
    public String toString(){
    return String.format("Read file %.0f-char at a time to String          |",length);
    }

    public static String readFileToString(String filename) {
        String data = new String();
        try {
            InputStream in = new FileInputStream(filename);
            InputStreamReader reader = new InputStreamReader(in);
            int c;
            while (true) {
                c = reader.read();
                if (c < 0) break;
                data = data + (char) c;
            }
            in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return data.toString();
    }
}
