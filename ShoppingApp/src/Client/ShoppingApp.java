package Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entity.Customer;
import Entity.Shop;
import SQL.SQLConnection;
import Service.Operations;


public class ShoppingApp
{
	public static void main(String[] args) 
	{
		int ch=0;
		int exit=0;
		
		List<Shop> shop=new ArrayList<Shop>();
		List<Customer> cust=new ArrayList<Customer>();
		
		Operations o=new Operations();
		SQLConnection sql=new SQLConnection();
		
		Scanner s=new Scanner(System.in);
		
		do
		{
			System.out.println("****************************\nSHOPPING APP\n****************************");
			System.out.println("1.SIGN UP ");
			System.out.println("2.SHOPPING ");
			System.out.println("3.GENERATE SHOPPING REPORT");
			System.out.println("4.ADD ITEM  ");
			System.out.println("5.UPDATE QUANTITY");
			System.out.println("6.DELETE ITEM");
			System.out.println("7.GET ALL ITEMS IN SORTED ORDER(PRICE)");
			System.out.println("8.EXIT");
			System.out.println("Enter the choice:");
			ch=s.nextInt();
			
			if(ch==1)
			{
				o.signUp(cust);
			}
			else if(ch==2)
			{
				o.bill(shop, cust);
			}
			else if(ch==3)
			{
				o.report(shop);
			}
			else if(ch==4)
			{
				o.add(shop);
			}
			else if(ch==5)
			{
				o.update(shop);
			}
			else if(ch==6)
			{
				o.delete(shop);
			}
			else if(ch==7)
			{
				o.display(shop);
			}
			else if(ch==8)
			{
				
				System.out.println("Exiting");
				exit=1;
			}
				
			
			
		}while(exit!=1);
	}

}
