package mapdemos;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
		 List<String> lenVehicles = new ArrayList<String>();
//	     for(String name:vehicles) {
//	    	System.out.println( name.length());
//	     }
		 
		 vehicles.stream().map(n->n.length()).forEach(length->System.out.println(length));
	}

}
