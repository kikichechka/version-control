package lesson6.model;

public class NoteMapper implements NoteMapperable {

    @Override
    public String mapToString(MyNote note) {
        return String.format("%s|%s|%s", note.getId(), note.getTitle(), note.getText());
    }

    @Override
    public MyNote mapToNote(String line) {
        String[] lines = line.split("\\|");
        return new MyNote(Integer.parseInt(lines[0]), lines[1], lines[2]);
    }
}
