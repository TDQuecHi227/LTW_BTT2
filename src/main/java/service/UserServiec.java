package service;

import model.User;

public interface UserServiec {
    User login(String username, String password);
    User get(String username);
}
