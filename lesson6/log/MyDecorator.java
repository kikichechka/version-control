package lesson6.log;

public interface MyDecorator {
    public void changeNote(String note);
    public void createNote(String note);
    public void deleteNote (String note);
    public void readAllNotes ();
}
