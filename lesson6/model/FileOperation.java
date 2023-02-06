package lesson6.model;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();
    void saveAllLines(List<String> lines);
    void readNote(List<String> lines);
    void deleteNote(List<String> lines);
}
