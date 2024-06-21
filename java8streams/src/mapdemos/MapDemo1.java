package mapdemos;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> vehicles = Arrays.asList("bus","car","bicycle","flight","train");
	   
        List<String> vehicles1 = new ArrayList<String>();
        //before java8
        /* for(String name:vehicles) {
        	vehicles1.add(name.toUpperCase());
        }
        System.out.println(vehicles1);*/
        //stream
        vehicles1 =  vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehicles1);
	}

}
