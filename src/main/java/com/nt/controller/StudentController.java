package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.binding.Student;
import com.nt.entity.StudentEntity;

@Controller
public class StudentController {
	
	//method to load student form
	//Method  to save student data
@GetMapping("/")
	public String loadForm(Model model) {
	List<String> courses=new ArrayList<>();
	courses.add("java");
	courses.add("AWS");
	courses.add("python");
	model.addAttribute("coursesList",courses);
	
	Student student1=new Student();
	model.addAttribute("st1",student1);
	model.addAttribute("course",courses);
	return "index";
		
	}
}
