package com.cg.cls;

public class Maincls {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Department d=new Department(1003,1232,1023);
		Student s=new Student("dhava",d,"kavi");
		Student s1=null;
		s1= (Student) s.clone();
          s1.dept.dep1 = 1007;
        System.out.println(s.dept.dep1);
        s.firstname="sree";
        System.out.println(s1.firstname);
	}

}
