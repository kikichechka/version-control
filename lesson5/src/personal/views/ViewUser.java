package personal.views;

import personal.controllers.UserController;
import personal.model.User;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;
    Scanner in = new Scanner(System.in);

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;
        while (true) {
            try {
                String command = scannerString("Введите команду (NONE, READ, CREATE, UPDATE, LIST, DELETE, EXIT): ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) {
                    in.close();
                    break;
                }
                switch (com) {
                    case CREATE:
                        create();
                        break;
                    case READ:
                        read();
                        break;
                    case LIST:
                        list();
                        break;
                    case UPDATE:
                        update();
                        break;
                    case DELETE:
                        delete();
                        break;
                    default:
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Не верная команда!");
            }
        }
    }

    private void delete() {
        String idUpdate = scannerString("Введите идентификатор пользователя: ");
        try {
            Integer.parseInt(idUpdate);
            System.out.println(userController.delete(idUpdate));
        } catch (Exception e) {
            System.out.println("Введен некорректный идентификатор!");
        }

    }

    private void update() {
        String idUpdate = scannerString("Введите идентификатор пользователя: ");
        try {
            User user = userController.readUser(idUpdate);
            System.out.println(user);
            updateUser(idUpdate);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            run();
        }
    }

    private void updateUser(String idUpdate) {
        while (true) {
            int updateCommand = scannerInt(
                    "Что хотите изменить (Имя - введите 1, Фамилия - введите 2, телефон - введите 3, выйти из режима редактирования - введите 4): ");
            if (updateCommand == 4)
                break;
            try {
                switch (updateCommand) {
                    case 1:
                        String newName = scannerString("Введите новое имя: ");
                        if (!userController.checkName(newName)) {
                            messageWrongFirstName();
                            continue;
                        }
                        userController.updateUser(idUpdate, updateCommand, newName);
                        messageUpdateContact();
                        break;
                    case 2:
                        String newLastName = scannerString("Введите новую фамилию: ");
                        if (!userController.checkName(newLastName)) {
                            messageWronglastName();
                            continue;
                        }
                        userController.updateUser(idUpdate, updateCommand, newLastName);
                        messageUpdateContact();
                        break;
                    case 3:
                        String newPhone = scannerString("Введите новый номер: ");
                        if (!userController.checkPhone(newPhone)) {
                            messageWrongPhone();
                            continue;
                        }
                        userController.updateUser(idUpdate, updateCommand, newPhone);
                        messageUpdateContact();
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
            }
        }
    }

    private void create() {
        String firstName = "";
        String lastName = "";
        String phone = "";
        while (firstName == "") {
            String data = scannerString("Имя: ");
            if (!userController.checkName(data)) {
                messageWrongFirstName();
                continue;
            }
            firstName = data;
        }
        while (lastName == "") {
            String data = scannerString("Фамилия: ");
            if (!userController.checkName(data)) {
                messageWronglastName();
                continue;
            }
            lastName = data;
        }
        while (phone == "") {
            String data = scannerString("Номер телефона: ");
            if (!userController.checkPhone(data)) {
                messageWrongPhone();
                continue;
            }
            phone = data;
        }
        userController.saveUser(new User(firstName, lastName, phone));
        messageSaveContact();
    }

    private void messageUpdateContact() {
        System.out.println("Контакт изменен.");
    }

    private void messageSaveContact() {
        System.out.println("Контакт сохранен.");
    }

    private void messageWrongFirstName() {
        System.out.println("Имя не должно содержать пробелы или быть пустым.");
    }

    private void messageWronglastName() {
        System.out.println("Фамилия не должна содержать пробелы или быть пустой.");
    }

    private void messageWrongPhone() {
        System.out.println("Номер должен содержать только цифры, не менее 7.");
    }

    private void read() {
        try {
            String id = scannerString("Введите идентификатор пользователя: ");
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException("Пользователь не найден.");
        } finally {
            
            run();
        }
    }

    private void list() {
        List<User> list = userController.readAllUsers();
        for (User user : list) {
            System.out.println(user);
        }
    }

    private String scannerString(String message) {
        System.out.print(message);
        return in.nextLine();
    }

    private int scannerInt(String message) {
        System.out.print(message);
        return in.nextInt();
    }
}
