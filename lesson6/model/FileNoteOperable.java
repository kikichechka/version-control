package lesson6.model;

import java.util.List;

public interface FileNoteOperable {
    List<String> readAllLines();
    void saveAllLines(List<String> lines);
}
