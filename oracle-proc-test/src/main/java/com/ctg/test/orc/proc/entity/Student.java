package com.ctg.test.orc.proc.entity;

/**
 * 
 * by zhoufe 2016年11月4日 上午10:36:11
 **/

public class Student
{

	private String studentId;
	private Integer studentNo;
	private String studentName;
	private String gender;
	private String idNum;
	
	public Student(){}
	
	public Student(String studentId, Integer studentNo, String studentName, String gender, String idNum)
	{
		super();
		this.studentId = studentId;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.gender = gender;
		this.idNum = idNum;
	}
	public String getStudentId()
	{
		return studentId;
	}
	public void setStudentId(String studentId)
	{
		this.studentId = studentId;
	}
	public Integer getStudentNo()
	{
		return studentNo;
	}
	public void setStudentNo(Integer studentNo)
	{
		this.studentNo = studentNo;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getIdNum()
	{
		return idNum;
	}
	public void setIdNum(String idNum)
	{
		this.idNum = idNum;
	}
	
	@Override
	public String toString()
	{
		return "Student [studentId=" + studentId + ", studentNo=" + studentNo + ", studentName=" + studentName
				+ ", gender=" + gender + ", idNum=" + idNum + "]";
	}
	
}
