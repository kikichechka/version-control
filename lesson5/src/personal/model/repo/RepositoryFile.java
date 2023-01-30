package personal.model.repo;
import java.util.ArrayList;
import java.util.List;

import personal.model.User;
import personal.model.fileoperation.FileOperation;
import personal.model.mapper.UserMapperTwo;
import personal.model.mapper.UserMapperable;

public class RepositoryFile implements Repository {
    private UserMapperable mapper = new UserMapperTwo();
    private FileOperation fileOperation;

    public RepositoryFile(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public String createUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id){
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        List<String> lines = new ArrayList<>();
        for (User item: users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
        return id;
    }

    @Override
    public void updateUser(List<User> user) {
        List<String> lines = new ArrayList<>();
        for (User item: user) {
            lines.add(mapper.map(item));
        }
        fileOperation.updateUser(lines);
    }

    @Override
    public void deleteUser(List<User> list) {
        List<String> lines = new ArrayList<>();
        for (User item: list) {
            lines.add(mapper.map(item));
        }
        fileOperation.deleteUser(lines);
    }
}
