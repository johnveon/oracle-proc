package com.ctg.test.orc.proc.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ctg.test.orc.proc.entity.Student;
import com.ctg.test.orc.proc.utils.IdCardGenerator;
import com.ctg.test.orc.proc.utils.StudentGen;


/**
 * 
 * by zhoufe 2016年11月4日 上午10:50:22
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-service.xml","classpath*:spring/spring-dao.xml"})
public class StudentServiceTest
{
	@Autowired
	private StudentService studentService;
	
	@Test
	public void test_add()
	{
		Student student = new Student(StudentGen.idGenNext(),
				StudentGen.noGenNext(), 
				StudentGen.nameGenNext(5),
				StudentGen.genderNext(), 
				IdCardGenerator.next());
		studentService.add(student);
	}
}
