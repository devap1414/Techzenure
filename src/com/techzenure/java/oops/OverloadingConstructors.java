package com.techzenure.java.oops;

class Employees  {
	int empno;
	String name;
	float sal;
	
	Employees(){	}

	Employees(int empno, String name){	
		this.empno = empno;
		this.name = name;
	}

	Employees(int a, String b, float c){	
		this(a, b);  //constructor chaining
		/*
		empno = a;
		name = b;
		*/
		sal = c;
	}

	void getDetails(){
		System.out.println(this.empno + " | " + this.name + " | " + this.sal);
	}	
} 

public class OverloadingConstructors {
	public static void main(String[] args) 	{
		Employees emp1 = new Employees();
		Employees emp2 = new Employees(101, "Sanjay");
		Employees emp3 = new Employees(102, "Praveen", 2500f);

		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}
}

