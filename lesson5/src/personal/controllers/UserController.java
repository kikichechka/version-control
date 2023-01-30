package personal.controllers;

import personal.model.User;
import personal.model.repo.Repository;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.createUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("");
    }

    public List<User> readAllUsers() {
        return repository.getAllUsers();
    }

    public String delete(String userId) {
        List<User> users = repository.getAllUsers();
        String name = "";
        boolean flag = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(userId)) {
                name = users.get(i).getFirstName();
                users.remove(i);
                flag = true;
                break;
            }
        }

        if (flag) {
            repository.deleteUser(users);
            return String.format("Пользователь %s удален!", name);
        }
        return "Пользователь не найден!";
    }

    public void updateUser(String userId, int updateCommand, String newData) {
        List<User> users = repository.getAllUsers();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(userId)) {
                switch (updateCommand) {
                    case 1:
                        users.get(i).setFirstName(newData);
                        break;
                    case 2:
                        users.get(i).setLastName(newData);
                        break;
                    case 3:
                        users.get(i).setPhone(newData);
                        break;
                }
                break;
            }
        }
        repository.updateUser(users);
    }

    public boolean checkName(String name) {
        if (name.contains(" ") || name.length() < 1)
            return false;
        return true;
    }

    public boolean checkPhone(String phone) {
        if (phone == "" || phone.contains(" ") || phone.length() < 7) {
            return false;
        }

        try {
            Integer.parseInt(phone);
            return true;
        } catch (NumberFormatException e) {}
        return false;
    }
}
