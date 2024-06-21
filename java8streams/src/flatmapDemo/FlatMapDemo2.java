package flatmapDemo;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> teamA = Arrays.asList("Scott","David","John");
       List<String> teamB = Arrays.asList("Sahnu","Danu","Jack");
       List<String> teamC = Arrays.asList("Bittu","Ravi","Pankaj");
       List<List<String>> playersInWorldCup = new ArrayList<List<String>>();
       playersInWorldCup.add(teamA);
       playersInWorldCup.add(teamB);
       playersInWorldCup.add(teamC);
      
//       for(List<String> name: playersInWorldCup) {
//    	   for(String team:name) {
//    		   System.out.println(team);
//    	   }
//       }
       playersInWorldCup.stream().flatMap(x->x.stream()).collect(Collectors.toList()).forEach(System.out::println);
       
	}

}
