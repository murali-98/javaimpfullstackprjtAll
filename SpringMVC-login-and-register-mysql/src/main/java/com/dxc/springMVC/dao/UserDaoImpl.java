package com.dxc.springMVC.dao;


import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dxc.springMVC.model.Login;
import com.dxc.springMVC.model.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void register(User user) {
		String sql = "insert into user values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { user.getUsername(),user.getPassword(),user.getFirstname(),user.getLastname(),user.getEmail(),user.getAddress() });
		
	
	}
	
	public User validateUser(Login login) {
		String sql = "select * from users where username='" + login.getUsername() + "' and  and password='"
				+ login.getPassword() + "'";
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) :null;
	}
	
	 class UserMapper implements RowMapper<User>{
		 public User mapRow(ResultSet rs,int arg)throws SQLException{
			 User user = new User();
			 user.setUsername(rs.getString("username"));
			 user.setPassword(rs.getString("password"));
			 user.setFirstname(rs.getString("firstname"));
			 user.setLastname(rs.getString("lastname"));
			 user.setEmail(rs.getString("email"));
			 user.setAddress(rs.getString("address"));
			 return user;
		 }
	 }

}
