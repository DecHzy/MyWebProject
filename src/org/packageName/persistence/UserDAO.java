package org.packageName.persistence;

import org.packageName.domain.User;

import java.util.List;

public interface UserDAO {
    /**
     * description TODO
     * @param username: 用户名
	 * @param password: 用户密码
     * @return User
     * @author huangzhangyan
     * @date 2021/10/9 13:31
     */
    User Login(String username, String password);

    /**
     * description TODO
     * @param id:
     * @return User
     * @author huangzhangyan
     * @date 2021/10/9 13:29
     */
    User getUserById(int id);

    List<User> getUserList();

    boolean updateUserInfo(User user);

    int deleteUser();


}
