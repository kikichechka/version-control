package lesson6;

import lesson6.controller.Controller;
import lesson6.model.FileOperation;
import lesson6.model.FileOperationImpl;
import lesson6.repo.Repo;
import lesson6.repo.RepoImpl;
import lesson6.view.View;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("note.txt");
        Repo repo = new RepoImpl(fileOperation);
        Controller controller = new Controller(repo);
        View view = new View(controller);
        view.run();
    }
}
