package com.pratyush.spring_jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pratyush.spring_jdbc.Entity.Student;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		student.setPhoneno(rs.getInt(4));
		return student;
	}

}
