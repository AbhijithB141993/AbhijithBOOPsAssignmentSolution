package com.greatlearning.service;
import com.greatlearning.model.SuperDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.TechDepartment;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SuperDepartment superDepartment =new SuperDepartment();

System.out.println ("welcome to "+ superDepartment.departmentName());
System.out.println ( superDepartment.getTodaysWork());
System.out.println ( superDepartment.getWorkDeadline());
System.out.println ( superDepartment.isTodayHoliday());
	
HrDepartment hr = new HrDepartment();{
	System.out.println ("welcome to "+ hr.departmentName());
	System.out.println ( hr.getTodaysWork());
	System.out.println (hr.getWorkDeadline());
	System.out.println ( hr.isTodayHoliday());
}
AdminDepartment admin = new AdminDepartment();{
	System.out.println ("welcome to "+ admin.departmentName());
	System.out.println ( admin.getTodaysWork());
	System.out.println (admin.getWorkDeadline());
	System.out.println ( admin.isTodayHoliday());
}
TechDepartment tech = new TechDepartment();{
	System.out.println ("welcome to "+ tech.departmentName());
	System.out.println ( tech.getTodaysWork());
	System.out.println (tech.getWorkDeadline());
	System.out.println ( tech.isTodayHoliday());
}
	}
}
