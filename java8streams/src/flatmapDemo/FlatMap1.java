package flatmapDemo;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> list1 = Arrays.asList(1,2);
    List<Integer> list2 = Arrays.asList(3,4);
    List<Integer> list3 = Arrays.asList(5,6);
    
    List<List<Integer>> finallist = Arrays.asList(list1,list2,list3);
    List<Integer> finalResult =  finallist.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
    System.out.println(finalResult);
	}

}
