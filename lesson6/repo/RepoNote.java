package lesson6.repo;

import java.util.List;

import lesson6.model.MyNote;

public interface RepoNote {
    List<MyNote> getAllNotes();
    void allChangeNote(List<MyNote> list);
}
