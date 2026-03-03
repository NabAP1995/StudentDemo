package com.test.demo.data;

import java.util.ArrayList;
import java.util.List;

import com.test.demo.entity.Student;

public class StudentDATA {
	
	
	List<Student> stud = new ArrayList();
	
	
	public StudentDATA()
	{
		stud.add(new Student(1,"nabin","n@gmail.com"));
		stud.add(new Student(2,"sushil","s@gmail.com"));
		stud.add(new Student(3,"ranjit","r@gmail.com"));
		stud.add(new Student(4,"amit","a@gmail.com"));
		stud.add(new Student(5,"birendra","b@gmail.com"));
		stud.add(new Student(6,"prince","p@gmail.com"));
		stud.add(new Student(7,"rakesh","r@gmail.com"));
		
	}
	
	public List<Student> students()
	{
		return stud;
	}

}
