package dao;

import entity.User;

public interface UserDao {
	/*
	 * 返回值>=代表添加成功 <1添加失败
	 */
    public int addUesr(User user);
}
