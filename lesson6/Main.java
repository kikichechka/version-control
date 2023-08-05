package lesson6;
import lesson6.controller.MyController;
import lesson6.log.MyDecorator;
import lesson6.log.MyDecoratorImpl;
import lesson6.model.FileNoteOperable;
import lesson6.model.FileNoteOperationImpl;
import lesson6.repo.RepoLogg;
import lesson6.repo.RepoLoggImpl;
import lesson6.repo.RepoMyNote;
import lesson6.repo.RepoMyNoteImpl;
import lesson6.view.View;

public class Main {
    public static void main(String[] args) {
        FileNoteOperable fileOperation = new FileNoteOperationImpl("note.txt");
        MyDecorator myDecorator = new MyDecoratorImpl("logg.txt");
        RepoMyNote repoNote = new RepoMyNoteImpl(fileOperation);
        RepoLogg repoLogg = new RepoLoggImpl(myDecorator);
        MyController controller = new MyController(repoNote, repoLogg);
        View view = new View(controller);
        view.run();
    }
}
