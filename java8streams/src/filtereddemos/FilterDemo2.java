package filtereddemos;

import java.util.*;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = Arrays.asList("Melisandre","Samsa","John","Daenerys","Joffery");
        List<String> nameFilterd = new ArrayList<String>();
       /* nameFilterd = name.stream().filter(str ->str.length()>6 && str.length()<8 ).collect(Collectors.toList());*/
//	    System.out.println( nameFilterd);
        name.stream().filter(str ->str.length()>6 && str.length()<8 ).forEach(str->System.out.println(str));
	}

}
