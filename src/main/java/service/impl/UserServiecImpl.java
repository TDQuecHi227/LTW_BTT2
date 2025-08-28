package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import model.User;
import service.UserServiec;

public class UserServiecImpl implements UserServiec {
    UserDao userDao = new UserDaoImpl();

    @Override
    public User login(String username, String password){
        User user = this.get(username);
        if (user != null && password.equals(user.getPassWord())) {
            return user;
        }
        return null;
    }
    @Override
    public User get(String username) {
        return userDao.get(username);
    }
}
