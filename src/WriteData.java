
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class WriteData {

    private BufferedWriter writer;
    private int c1, c2, c3, c4;
    private int arr1Size, arr2Size, arr3Size, arr4Size;

    public WriteData() throws IOException {

        c1 = (int) ((Math.random() * 50) + 50);
        c2 = (int) ((Math.random() * 50) + 50);
        c3 = (int) ((Math.random() * 50) + 50);
        c4 = (int) ((Math.random() * 50) + 50);

        writer = new BufferedWriter(new FileWriter(Paths.get("").toAbsolutePath().resolve("data.txt").toString()));
        init(writer);
        writer.close();
    }

    private void init(BufferedWriter writer) throws IOException {
        writer.write(c1 + " " + c2 + " " + c3 + " " + c4);
        writer.newLine();
        writer.flush();

        for (int i = 0; i < c1; i++) {
            arr1Size = (int) ((Math.random() * 9900) + 100);
            writer.write(arr1Size + " ");
            writer.newLine();
            for (int j = 0; j < arr1Size; j++) {
                writer.write((int) ((Math.random() * 16328) + 1) + " ");
            }
            writer.newLine();
        }
        writer.flush();

        for (int i = 0; i < c2; i++) {
            arr2Size = (int) ((Math.random() * 9900) + 100);
            writer.write(arr2Size + " ");
            writer.newLine();
            for (int j = 0; j < arr2Size; j++) {
                writer.write((char) ((Math.random() * 26) + 65) + " ");
            }
            writer.newLine();
        }
        writer.flush();

        for (int i = 0; i < c3; i++) {
            arr3Size = (int) ((Math.random() * 9900) + 100);
            writer.write(arr3Size + " ");
            writer.newLine();
            for (int j = 0; j < arr3Size; j++) {
                writer.write((int) ((Math.random() * 16328) + 1) + " ");
            }
            writer.newLine();
        }
        writer.flush();

        for (int i = 0; i < c4; i++) {
            arr4Size = (int) ((Math.random() * 9900) + 100);
            writer.write(arr4Size + " ");
            writer.newLine();
            for (int j = 0; j < arr4Size; j++) {
                writer.write((char) ((Math.random() * 26) + 65) + " ");
            }
            writer.newLine();
        }
        writer.flush();
    }
}
