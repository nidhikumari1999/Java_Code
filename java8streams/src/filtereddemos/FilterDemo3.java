package filtereddemos;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class FilterDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<String> words = Arrays.asList("cup",null,"forest","sky","book",null,"theatre");
	List<String> words1 = new ArrayList<String>();
	List<String> result = words.stream().filter(n -> n!=null).collect(Collectors.toList());
	System.out.println(result);
	
	}

}
