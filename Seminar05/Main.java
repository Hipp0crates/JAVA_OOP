package JAVA_OOP.Seminar05;

import JAVA_OOP.Seminar05.controllers.UserController;
import JAVA_OOP.Seminar05.model.FileOperation;
import JAVA_OOP.Seminar05.model.FileOperationImpl;
import JAVA_OOP.Seminar05.model.Repository;
import JAVA_OOP.Seminar05.model.RepositoryFile;
import JAVA_OOP.Seminar05.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}