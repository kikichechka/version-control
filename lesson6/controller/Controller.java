package lesson6.controller;

import java.util.List;
import lesson6.model.Note;
import lesson6.repo.Repo;

public class Controller {
    private final Repo repo;

    public Controller(Repo repo) {
        this.repo = repo;
    }

    public List<Note> listNotes() {
        return repo.getAllNotes();
    }

    public void createNewNote(String heading, String text) {
        List<Note> list = repo.getAllNotes();
        int id = 1;
        for (Note note : list) {
            id = note.getId() + 1;
        }
        list.add(new Note(id, heading, text));
        repo.allChangeNote(list);
    }

    public void changeHeadingNote(int id, String newHeading) {
        List<Note> list = listNotes();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.get(i).setHeadingOfTheNote(newHeading);
            }
        }
        repo.allChangeNote(list);
    }

    public void changeTextNote(int id, String newText) {
        List<Note> list = listNotes();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.get(i).setTextOfTheNote(newText);
            }
        }
        repo.allChangeNote(list);
    }

    public boolean checkNoteOnId(int id) {
        List<Note> list = listNotes();
        for (Note note : list) {
            if (note.getId() == id)
                return true;
        }
        return false;
    }

    public void deleteNote(int id) {
        List<Note> list = listNotes();
        int defaultId = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i).setId(defaultId++);
        }

        repo.allChangeNote(list);

    }
}
