package Service;

import java.util.List;

import Entity.Customer;
import Entity.Shop;

public interface ShoppingInterface
{
	List<Customer> signUp(List <Customer> customer);
	List<Shop> bill(List <Shop> shop,List <Customer> customer);
	List<Shop> report(List<Shop> shop);
	List<Shop> add(List<Shop> shop);
	List<Shop> update(List<Shop> shop);
	List<Shop> delete(List<Shop> shop);
	List<Shop> display(List<Shop> shop);
	
	
	
	
}
