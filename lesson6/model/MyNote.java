package lesson6.model;

public class MyNote {
    private int id;
    private String headingOfTheNote;
    private String textOfTheNote;

    public MyNote(int id, String headingOfTheNote, String textOfTheNote) {
        this.id = id;
        this.headingOfTheNote = headingOfTheNote;
        this.textOfTheNote = textOfTheNote;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return headingOfTheNote;
    }

    public String getText() {
        return textOfTheNote;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHeadingOfTheNote(String headingOfTheNote) {
        this.headingOfTheNote = headingOfTheNote;
    }

    public void setTextOfTheNote(String textOfTheNote) {
        this.textOfTheNote = textOfTheNote;
    }

    @Override
    public String toString() {
        return String.format(" Заметка №%s\n **%s**\n %s\n -----------------", getId(), getTitle(), getText());
    }
}
