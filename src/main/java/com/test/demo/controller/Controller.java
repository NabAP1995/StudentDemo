package com.test.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.data.StudentDATA;
import com.test.demo.entity.Student;

@RestController
public class Controller {
	
	StudentDATA studnet = new StudentDATA();
	
	@GetMapping
	public String greet()
	{
		return "hello world";
	}
	
	
	@GetMapping
	@RequestMapping("/student")
	public List<Student> getAllStudnet()
	{
		return studnet.students();
	}
	
	@GetMapping
	@RequestMapping("/student/{id}")
	public Student getStudentbyID(@PathVariable int id)
	{
		List<Student> stud = studnet.students();
		
		for(Student st: stud)
		{
			if(st.getId()==id)
			{
				return st;
			}
		}
		return null;
	}
	
	@DeleteMapping
	@RequestMapping("/studnet/{id}")
	public String studnetDeletedbyID(@PathVariable int id)
	{
		List<Student> stlist = studnet.students();
		
		for(Student st :stlist)
		{
			if(st.getId()==id)
			{
				stlist.remove(st);
				return "Studnet of id: "+id+" is deleted";
			}
			
		}
		return "Student of id: "+id+" is not found in the list";
		
	}
	
	@PutMapping("/student/{id}")
	public String updatestudentbyID(@PathVariable int id)
	{
		for(Student st:studnet.students())
		{
			if(st.getId()==id)
			{
				st.setName("nabin mahato");
				st.setEmail("nabin.dev@gmail.com");
				return "student detail is updated";
			}
		}
		return "student of id: "+id+" is not found";
	}
	
	@PostMapping("student")
	public Student addStudnet(@RequestBody Student stud)
	{
		 studnet.students().add(stud);
		
		return stud;
	}
	
	
	
	
	
	

}
