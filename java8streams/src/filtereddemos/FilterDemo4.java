package filtereddemos;

import java.util.*;

class Product
{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class FilterDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List <Product> productsList = new ArrayList<Product>();
       productsList.add(new Product(1,"HP",25000));
       productsList.add(new Product(2,"Lenovo",65000));
       productsList.add(new Product(3,"Dell",35000));
       productsList.add(new Product(4,"Asus",45000));
       productsList.stream().filter(n->n.price>25000).forEach(pr->System.out.println(pr.price));
	}

}
