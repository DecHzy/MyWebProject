package org.packageName.persistence;

import org.packageName.domain.User;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public User Login(String username, String password) {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public boolean updateUserInfo(User user) {
        return false;
    }

    @Override
    public int deleteUser() {
        return 0;
    }

    public static void main(String[] args) {
        UserDAO tmp=new UserDAOImpl();
        tmp.getUserById(123);
        Math.abs(123);
    }
}
