package lesson6.repo;

import java.util.List;

import lesson6.model.Note;

public interface Repo {
    List<Note> getAllNotes();
    void allChangeNote(List<Note> list);
}
