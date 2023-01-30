package personal.model.fileoperation;
import java.util.List;

public interface FileOperation {
    List<String> readAllLines();
    void saveAllLines(List<String> lines);
    void updateUser(List<String> lines);
    void deleteUser(List<String> lines);
}
