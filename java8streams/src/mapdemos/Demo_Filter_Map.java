package mapdemos;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}


public class Demo_Filter_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Employee> empDetail =  Arrays.asList(new Employee(101,"Alex",10000),
    		 new Employee(102,"Brian",33000),new Employee(103,"Charles",24000) ,new Employee(104,"Pummy",65000));
     List<Integer> empDetailList =  empDetail.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
	System.out.println(empDetailList);
	}

}
