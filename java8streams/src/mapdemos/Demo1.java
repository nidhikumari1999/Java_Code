package mapdemos;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Demo1 {
//distinct()  limit()  count()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//distinct
		List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train","car","bus","car");
		 List<String> distinctvehicles2 = vehicles.stream().distinct().collect(Collectors.toList());
	     System.out.println(distinctvehicles2);
	//count
	     long count=   vehicles.stream().distinct().count(); //4
	     System.out.println(count);
	  //limit
	     vehicles.stream().limit(3).forEach(System.out::println);
	}

}
