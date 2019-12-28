package com.imag;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	ImagaeSave save=new ImagaeSave();
	
	@RequestMapping("/upload")
	public String uplaod(@RequestParam("name") String name,
            @RequestParam("file") MultipartFile file)
	{
		byte[] img;
		Student student=new Student();
		if(!file.isEmpty())
		{
			try{
				img = file.getBytes();
				student.setImag(img);
			
			System.out.println(img.length);
			}catch(Exception e){}
		}
		student.setName("same");
	    save.save(student);
	    
		return "index.jsp";
	}
	
	@RequestMapping("getstudent")
	public ModelAndView getStudent(HttpServletRequest request,HttpServletResponse respon)
	{
		
		List<Student> student=save.get();
		
		  ModelAndView m=new ModelAndView("view");
		  m.addObject("student",student); 
		return m;
	}
	@RequestMapping("getstudentimag")
	public void getStudentImag(@RequestParam("id") Integer id,HttpServletRequest request,HttpServletResponse response)
	{
		
		Student student=save.get(id);
		System.out.println(student.getName());
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		try{
	    response.getOutputStream().write(student.getImag());
	    response.getOutputStream().close();
		}catch(IOException i){}
		
	}

}
