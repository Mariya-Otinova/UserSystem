package server.service;

import server.dao.UserDao;
import server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
