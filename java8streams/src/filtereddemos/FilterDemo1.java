package filtereddemos;

import java.util.*;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*//		ArrayList<Integer> numberList = new ArrayList<Integer>();
//		numberList.add(30);
//		numberList.add(40);
//		numberList.add(50);
//		numberList.add(60);
//		numberList.add(70);*/
		List<Integer> numberList = Arrays.asList(10,15,20,25,30);
		List<Integer> evenNumberList = new ArrayList<Integer>();
		//without using Stream
          /*for(int a :numberList ) {
        	  if(a%2==0) {
        		  evenNumberList.add(a) ;
        	  }
        	  System.out.println(evenNumberList);
	}*/
		
		//with stream
		
		/* evenNumberList = numberList.stream().filter(n -> n%2==0).collect(Collectors.toList());
		 System.out.println(evenNumberList);*/
//		numberList.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
		numberList.stream().filter(n -> n%2==0).forEach(System.out::println);
	}

}
