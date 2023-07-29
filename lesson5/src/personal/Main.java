package personal;

import personal.controllers.UserController;
import personal.model.fileoperation.FileOperation;
import personal.model.fileoperation.FileOperationImpl;
import personal.model.repo.Repository;
import personal.model.repo.RepositoryFile;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
        
    }
}
