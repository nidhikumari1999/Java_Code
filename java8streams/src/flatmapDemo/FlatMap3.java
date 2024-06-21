package flatmapDemo;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String sname;
	int sid;
	char grade;
	public Student(String sname, int sid, char grade) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.grade = grade;
	}
	
}

public class FlatMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Student> stud1 = Arrays.asList(new Student("Scott",1,'A'),new Student("Vishnu",2,'B'),new Student("Rahul",3,'C'));
		 List<Student> stud2 = Arrays.asList(new Student("Smith",104,'A'),new Student("Keendy",102,'B'),new Student("Jackson",103,'C')); 
	     List<List<Student>> merge =Arrays.asList(stud1,stud2) ;
	     List<String> namesList =   merge.stream().
	    		 flatMap(x->x.stream()).
	    		 map(s->s.sname).
	    		 collect(Collectors.toList());
	    System.out.println(namesList);
	}

}
