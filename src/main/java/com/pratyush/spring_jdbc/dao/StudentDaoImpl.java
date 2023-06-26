package com.pratyush.spring_jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pratyush.spring_jdbc.Entity.Student;

public class StudentDaoImpl implements StudentDao {

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		// TODO Auto-generated method stub
		//insert query
        String query = "insert into student values(?,?,?,?)";
       int result = this.jdbcTemplate.update(query , student.getId() , student.getName() , student.getCity() , student.getPhoneno());
		return result;
	}

	public int change(Student student) {
		// TODO Auto-generated method stub
		//update data
		String query = "update student set name=? , city=? ,phoneno =? where id=?";
		int result = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getPhoneno(),student.getId());
		
		return result;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		//delete operation
		String query = "delete from student where id=?";
		int result = this.jdbcTemplate.update(query,id);
		
		return result;
	}

	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		//selecting single student data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		//selecting all students
		String query = "select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> student = this.jdbcTemplate.query(query, rowMapper);
		return student;
		
	}

}
