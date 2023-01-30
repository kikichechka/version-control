package personal.model.mapper;

import personal.model.User;

public interface UserMapperable {
    public String map(User user);
    public User map(String line);
}
