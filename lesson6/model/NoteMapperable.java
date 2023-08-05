package lesson6.model;

public interface NoteMapperable {
    public String mapToString(MyNote note);
    public MyNote mapToNote(String line);
}
