package lesson6.model;
import java.io.FileWriter;
import java.io.IOException;

public class FileLoggOperationImpl implements FileLoggOperable {
    private String fileName;

    public FileLoggOperationImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void saveLogg(String text) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            // writer.write(text);
            writer.append(text);
            writer.append('\n');
            writer.flush();

            // FileWriter writer = new FileWriter(filePath, true);
            // BufferedWriter bufferWriter = new BufferedWriter(writer);
            // bufferWriter.write(text);
            // bufferWriter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
