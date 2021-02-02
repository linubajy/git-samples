import java.util.Scanner;

//IA-2
class  Customer
{
	long accNo;
	String name;
	String type;
	String DOB;
	String address;
	float bal;
	
	Customer(long accNo, String name,String type,String DOB,String address,float bal)
	{
		this.accNo=accNo; 				
		this.name=name;
		this.type=type;
		this.DOB=DOB;
		this.address=address;
		this.bal=bal;
	}
	void getter()
	{
		System.out.println(name+" "+address+" ");
	}
	
	
}



public class Bank 
{
	static int m = 0;
	
	public static void sortId(Customer c[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Account number :");
		long ac =s.nextInt();
		//long AC[]=new long[m];
		
		for(int i=0;i<m;i++)
		{
			if(c[i].accNo==ac)
			{
				//AC[i]=c[i].accNo;
				System.out.println("Account no:"+c[i].accNo);
				System.out.println("Name:"+c[i].name);
				System.out.println("DOB:"+c[i].DOB);
				System.out.println("Adress:"+c[i].address);
				System.out.println("Account Type:"+c[i].type);
				System.out.println("Balance:"+c[i].bal);
				
				
				//System.out.println(AC[i]);
			}
		}
		
	}
	public static void name(Customer c[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Name :");
		String na =s.nextLine();
		
		
		for(int i=0;i<m;i++)
		{
			if(c[i].name.equals(na))
			{
				System.out.println("Account no:"+c[i].accNo);
				System.out.println("Name:"+c[i].name);
				System.out.println("DOB:"+c[i].DOB);
				System.out.println("Adress:"+c[i].address);
				System.out.println("Account Type:"+c[i].type);
				System.out.println("Balance:"+c[i].bal);
			}
		}
	}
	public static void nonZero(Customer c[])
	{
		
		
		for(int i=0;i<m;i++)
		{
			if(c[i].bal>0)
			{
				System.out.println("Account no:"+c[i].accNo);
				System.out.println("Name:"+c[i].name);
				System.out.println("DOB:"+c[i].DOB);
				System.out.println("Adress:"+c[i].address);
				System.out.println("Account Type:"+c[i].type);
				System.out.println("Balance:"+c[i].bal);
			}
		}
	}
	public static void add(Customer c[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Address :");
		String ad =s.nextLine();
		//String add[]=new String[m];
		
		for(int i=0;i<m;i++)
		{
			if(c[i].address.equals(ad))
			{
				System.out.println("Account no:"+c[i].accNo);
				System.out.println("Name:"+c[i].name);
				System.out.println("DOB:"+c[i].DOB);
				System.out.println("Adress:"+c[i].address);
				System.out.println("Account Type:"+c[i].type);
				System.out.println("Balance:"+c[i].bal);
			}
		}
	}
	public static void sort(Customer c[])
	{
		
		Customer temp;
		for(int i=0;i<m-1;i++)
		{
			for(int j=i+1;j<m;j++)
			if(c[i].accNo>c[j].accNo)
			{
				
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}
		}
		for(int i=0;i<m;i++)
		{
			System.out.println("Account no:"+c[i].accNo);
			System.out.println("Name:"+c[i].name);
			System.out.println("DOB:"+c[i].DOB);
			System.out.println("Adress:"+c[i].address);
			System.out.println("Account Type:"+c[i].type);
			System.out.println("Balance:"+c[i].bal);
			System.out.println("\n\n");
		}
	}
	public static void addUser(Customer c[])
	{
		String sa="savings",l="loan",cu="current";
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Account number:");
		long accNo=s.nextInt();
		System.out.println("Enter the Name:");
		String name=s.next();
		System.out.println("Enter the Account type (savings/loan/current):");
		String type=s.next();
		do 
		{
			if((type.compareTo(sa)==0)||(type.compareTo(l)==0)||(type.compareTo(cu)==0))
			{
				flag=1;
				break;
			}
			else
			{
					System.out.println("Enter appropriate account type");
					type=s.next();
					continue;
			}	
		}while(flag!=1);
		
		
		System.out.println("Enter the DOB:");
		String DOB=s.next();
		System.out.println("Enter the Adress:");
		String address=s.next();
		System.out.println("Enter the Account balance :");
		float bal=s.nextFloat();
		c[m] = new Customer( accNo, name, type, DOB,address,bal);
		m=m+1;	
		
	}

	public static void updateUser(Customer c[])
	{
		
		Scanner s=new Scanner(System.in);
		int g=0;
		do 
		{
			
		
		System.out.println("Enter the account number to update:");
		int up=s.nextInt();
		System.out.println("\n1.UPDATE NAME \n2.UPDATE ADDRESS \nEnter choice:");
		int ch=s.nextInt();
		
		if(ch==1)
		{
			System.out.println("Enter the current name:");
			String name=s.next();
			System.out.println("Enter the new name:");
			String newName=s.next();
	
		
			for(int i=0;i<m;i++)
			{
				if( c[i].name.equals(name)&& c[i].accNo ==up)
					c[i].name=newName;
			}	
			g=1;
		}
		else if(ch==2)
		{
			System.out.println("Enter the current Addess:");
			String address=s.next();
			System.out.println("Enter the new Address:");
			String newAddress=s.next();
			
			for(int i=0;i<m;i++)
			{
				if(c[i].address.equals(address)&& c[i].accNo ==up)
					c[i].address=newAddress;
			}	
			g=1;
		
		}
		else
		{
			System.out.println("Wrong choice.Try again.\n");
			continue;
		}
		}while(g!=1);
	}	
	
	public static void delUser(Customer c[])
	{
		System.out.println("Enter the customer account number to delete:");
		Scanner s =new Scanner(System.in);
		
		int de =s.nextInt();
		for(int i=0;i<m;i++)
		{
			if(c[i].accNo==(de))
			{
				c[i].accNo='\0';
				c[i].name=" ";
				c[i].DOB=" ";
				c[i].address=" ";
				c[i].type=" ";
				c[i].bal='\0';
			}
			//sort(c);
		}
		
	}
	public static void display(Customer c[])
	{
		Scanner s = new Scanner(System.in);
		int flag=0;
		System.out.println("MENU \n1.DISPLAY CUSTOMERS BASED ON ID\n2.DISPLAY CUSTOMERS BASED ON NAME\n3.DISPLAY CUSTOMERS BASED ON NON-ZERO\n4.DISPLAY CUSTOMERS BASED ON ADDRESS\n5.DISPLAY USERS SORTED BASED ON ID\nEnter choice :");
		int ch=s.nextInt();
		do 
		{
			if(ch==1)
			{
				sortId(c);
				flag=1;
			}
			else if(ch==2)
			{
				name(c);
				flag=1;
			}	
			else if(ch==3)
			{
				nonZero(c);
				flag=1;
			}
			else if(ch==4)
			{
				add(c);
				flag=1;
			}
			else if(ch==5)
			{
				sort(c);
				flag=1;
			}
			else
			{
				System.out.println("Wrong choice,try again!");
				continue;
			}
		}while(flag!=1);		
	}
	
	public static void main(String[] args) 
	{
		int flag=0;
		int ch=0;
		Customer c[]=new Customer[20];
		do
		{
			
			
			Scanner s= new Scanner(System.in);
			System.out.println("\nBANKING\n***************************************\n");
			System.out.println("\n1.ADD USER\n2.UPDATE USER DETAILS\n3.DELETE USER\n4.DISPLAY USER DETAILS\n5.EXIT\nEnter choice:");
			ch=s.nextInt();
			if(ch==1)
				addUser(c);
			else if(ch==2)
				updateUser(c);
			else if(ch==3)
				delUser(c);
			else if(ch==4)
				display(c);
			else if(ch==5)
			{
				System.out.println("Exiting!");
				System.exit(0);	
				flag=1;
			}
			else
			{
				System.out.println("Wrong choice.Please enter again!");
				continue;
			}
			
			
		}while(flag!=1);
		
	}

}
