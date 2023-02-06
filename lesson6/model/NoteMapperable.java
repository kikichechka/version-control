package lesson6.model;

public interface NoteMapperable {
    public String mapToString(Note note);
    public Note mapToNote(String line);
}
