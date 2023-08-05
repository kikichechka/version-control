package lesson6.repo;
import java.util.ArrayList;
import java.util.List;
import lesson6.model.FileNoteOperable;
import lesson6.model.MyNote;
import lesson6.model.NoteMapper;
import lesson6.model.NoteMapperable;

public class RepoMyNoteImpl implements RepoMyNote {
    private NoteMapperable noteMapper;
    private FileNoteOperable fileOperation;

    public RepoMyNoteImpl(FileNoteOperable fileOperation) {
        this.fileOperation = fileOperation;
        noteMapper = new NoteMapper();
    }

    @Override
    public List<MyNote> getAllNotes() {
        List<MyNote> listNotes = new ArrayList<>();
        List<String> listStrings = fileOperation.readAllLines();
        for (String string : listStrings) {
            listNotes.add(noteMapper.mapToNote(string));
        }
        return listNotes;
    }

    @Override
    public void allChangeNote(List<MyNote> list) {
        List<String> listString = new ArrayList<>();
        for (MyNote note : list) {
            listString.add(noteMapper.mapToString(note));
        }
        fileOperation.saveAllLines(listString);
    }
}
