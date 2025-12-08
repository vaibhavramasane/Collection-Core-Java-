//listIterator
import java.util.*;

class Listiterator{
	
	public static void main(String x[]){
		
		Vector V = new Vector();
		V.add(new Product("ABC",1,10000));
		V.add(new Product("DBC",2,20000));
		V.add(new Product("ABD",3,30000));
		V.add(new Product("PBN",4,40000));
		V.add(new Product("PBP",5,50000));
		
		for(Object obj:V){
			Product p = (Product)obj;
			System.out.println(p.getId() +"\t" +p.getName() +"\t"+p.getPrice());
		)
	}
}

class Product{
	private int id;
	private String name;
	private int price;
	
	public Product(){
		
	}
	
	public Product(String name,int id,int price){
		
		this.name = name;
		this.id = id;
		this.price = price;
		
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		
		return id;
		
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	public String getName(){
		return name;
		
	}
	public void setPrice(int price){
		
		this.price = price;
		
	}
	public int getPrice(){
		return price;
	}
	
}
	
