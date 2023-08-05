package lesson6.controller;
import java.util.List;
import lesson6.model.MyNote;
import lesson6.repo.RepoLogg;
import lesson6.repo.RepoNote;

public class MyController {
    private final RepoNote repoNote;
    private final RepoLogg repoLogg;

    public MyController(RepoNote repoNote, RepoLogg repoLogg) {
        this.repoNote = repoNote;
        this.repoLogg = repoLogg;
    }

    public List<MyNote> listNotes() {
        repoLogg.readAllNotes();
        return repoNote.getAllNotes();
    }

    public void createNewNote(String heading, String text) {
        List<MyNote> list = repoNote.getAllNotes();
        int id = 1;
        for (MyNote note : list) {
            id = note.getId() + 1;
        }
        list.add(new MyNote(id, heading, text));
        repoNote.allChangeNote(list);
        repoLogg.createNote(heading);
    }

    public void changeHeadingNote(int id, String newHeading) {
        List<MyNote> list = listNotes();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.get(i).setHeadingOfTheNote(newHeading);
            }
        }
        repoNote.allChangeNote(list);
        repoLogg.changeNote(Integer.toString(id));
    }

    public void changeTextNote(int id, String newText) {
        List<MyNote> list = listNotes();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.get(i).setTextOfTheNote(newText);
            }
        }
        repoNote.allChangeNote(list);
        repoLogg.changeNote(Integer.toString(id));
    }

    public boolean checkNoteOnId(int id) {
        List<MyNote> list = listNotes();
        for (MyNote note : list) {
            if (note.getId() == id)
                return true;
        }
        return false;
    }

    public void deleteNote(int id) {
        repoLogg.deleteNote(Integer.toString(id));
        List<MyNote> list = listNotes();
        int defaultId = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i).setId(defaultId++);
        }

        repoNote.allChangeNote(list);
    }
}
