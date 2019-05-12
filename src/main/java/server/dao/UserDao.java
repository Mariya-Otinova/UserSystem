package server.dao;

import server.model.User;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao {
    public List<User> users = Arrays.asList(new User("admin", "admin"),
            new User("user1", "user1"));

    public List<User> getAllUsers() {
        return users;
    }
}
