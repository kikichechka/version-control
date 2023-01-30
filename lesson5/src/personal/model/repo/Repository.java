package personal.model.repo;

import java.util.List;

import personal.model.User;

public interface Repository {
    List<User> getAllUsers();
    String createUser(User user);
    void deleteUser(List<User> list);
    void updateUser(List<User> list);
}
