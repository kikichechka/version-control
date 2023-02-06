package lesson6.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperationImpl implements FileOperation {
    private String fileName;

    public FileOperationImpl(String fileName) {
        this.fileName = fileName;
        // try (FileWriter writer = new FileWriter(fileName, true)) {
        // writer.flush();
        // } catch (IOException ex) {
        // System.out.println(ex.getMessage());
        // }
    }

    @Override
    public List<String> readAllLines() {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            if (line != null) {
                list.add(line);
            }
            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    list.add(line);
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void saveAllLines(List<String> lines) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            for (String line : lines) {
                writer.write(line);
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void readNote(List<String> lines) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteNote(List<String> lines) {
        // TODO Auto-generated method stub

    }

}
