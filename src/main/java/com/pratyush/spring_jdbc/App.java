package com.pratyush.spring_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pratyush.spring_jdbc.Entity.Student;
import com.pratyush.spring_jdbc.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/pratyush/spring_jdbc/config.xml");
        JdbcTemplate template = ctx.getBean("jdbcTemplate" , JdbcTemplate.class);
        
        //insert query
        String query = "insert into student values(?,?,?,?)";
        
        //fire query
        int result = template.update(query , 103 , "puja" , "patna " , 162745378 );
        System.out.println(result);
        */
    	 ApplicationContext ctx = new ClassPathXmlApplicationContext("com/pratyush/spring_jdbc/config.xml");
    	 StudentDao studentDao = ctx.getBean("studentDao" , StudentDao.class);
    	 
    	 //INSERT
    	/* Student student = new Student();
    	 student.setId(104);
    	 student.setName("golu");
    	 student.setCity("kerala");
    	 student.setPhoneno(12347790);
    	
    	 int result = studentDao.insert(student);
    	 System.out.println(result);
    	 */
    	 
    	 
    	 //UPDATE
    	/* Student student = new Student();
    	 student.setId(104);
    	 student.setName("monti");
    	 student.setCity("kerala");
    	 student.setPhoneno(12347790);
    	 int result = studentDao.change(student);
    	 System.out.println(result);
    	 */
    	 
    	 //DELETE
    	/* int result = studentDao.delete(101);
    	 System.out.println(result);
    	 */
    	 
    	 //GET SINGLE STUDENT BY ID
    	/* Student student = studentDao.getStudent(102);
    	 System.out.println(student);
    	 */
    	 

    	 //GET ALL STUDENT 
    	 List<Student> student = studentDao.getAllStudents();
    	 System.out.println(student);
    	 
    }
}
