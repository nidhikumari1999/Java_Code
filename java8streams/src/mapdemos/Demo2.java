package mapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		long numberOfEven= numberList.stream().filter(n->n%2==0).count();
        System.out.println(numberOfEven);
        //min()
     Optional<Integer> min =   numberList.stream().min((val1,val2)-> {return val1.compareTo(val2);}); 
      System.out.println(min.get());
      
      //max
      Optional<Integer> max =   numberList.stream().max((val1,val2)-> {return val1.compareTo(val2);}); 
      System.out.println(max.get());
	}

}
