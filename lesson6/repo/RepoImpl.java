package lesson6.repo;
import java.util.ArrayList;
import java.util.List;
import lesson6.model.FileOperation;
import lesson6.model.Note;
import lesson6.model.NoteMapper;
import lesson6.model.NoteMapperable;

public class RepoImpl implements Repo {
    private NoteMapperable noteMapper = new NoteMapper();
    private FileOperation fileOperation;

    public RepoImpl(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<Note> getAllNotes() {
        List<Note> listNotes = new ArrayList<>();
        List<String> listStrings = fileOperation.readAllLines();
        for (String string : listStrings) {
            listNotes.add(noteMapper.mapToNote(string));
        }
        return listNotes;
    }

    @Override
    public void allChangeNote(List<Note> list) {
        List<String> listString = new ArrayList<>();
        for (Note note : list) {
            listString.add(noteMapper.mapToString(note));
        }
        fileOperation.saveAllLines(listString);
    }
}
