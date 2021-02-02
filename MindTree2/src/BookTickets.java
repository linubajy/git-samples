
// IA-1
//incomplete

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

class Ticket
{
	int CusID;
	String CusName;
	int Age;
	String Mob;
	String DOB;
	String Address;
	
	Ticket(int CusID,String CusName,int Age,String Mob,String DOB,String Address)
	{
		
		this.CusID=CusID;
		this.CusName=CusName;
		this.Age=Age;
		this.Mob=Mob;
		this.DOB=DOB;
		this.Address=Address;
	}
	
	
	
}

public class BookTickets {

	static int c=0;
	public static void sortCity(Ticket t[])
	{
		Ticket temp;
		for(int i=0;i<c;i++)
		{
			for(int j=i+1;j<c;j++)
			{
				if(t[j].Address.compareTo(t[i].Address)<0)
				{
					temp=t[i];
					t[i]=t[j];
					t[j]=temp;
				}
			}
		}
		System.out.println("\nNAMES OF CUSTOMERS IN SORTED IN ORDER OF CITY NAMES\n----------------------------\n");
		System.out.println("CustID"+'\t'+"Name"+'\t'+"Address");
		for(int i=0;i<c;i++)
		{
			System.out.println(t[i].CusID+"\t"+t[i].CusName+"\t"+t[i].Address);
			
		}
	
	}
	
	public static void sortID(Ticket t[])
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the ID:");
		int id=s.nextInt();
		
		System.out.println("\nNAMES SORTED ON ID\n-------------------------------\n");
		System.out.println("CustID"+"\t"+"Name");
		for(int i=0;i<c;i++)
		{
				if(t[i].CusID==id)
				{
					System.out.println(t[i].CusID+"\t"+t[i].CusName);
				}
				
		}
		
		
		
	}
	
	public static void sortNames(Ticket t[])
	{
		
		
		
		Ticket temp;
		for(int i=0;i<c;i++)
		{
			for(int j=i+1;j<c;j++)
			{
				if(t[j].CusName.compareTo(t[i].CusName)<0)
				{
					temp=t[i];
					t[i]=t[j];
					t[j]=temp;
				}
			}
		}
		System.out.println("\nNAMES OF CUSTOMERS IN SORTED ORDER\n----------------------------\n");
		System.out.println("CustID"+"\t"+"Name");
		for(int i=0;i<c;i++)
		{
			System.out.println(t[i].CusID+"\t"+t[i].CusName);
			
		}
	
	}
	
	
	
	public static void addCustomer(Ticket t[])
	{
		
		Scanner s= new Scanner(System.in);
		System.out.println("\nEnter Customer ID:");
		int CusID=s.nextInt();
		System.out.println("\nEnter Customer Name:");
		String Cusname=s.next();
		System.out.println("\nEnter Customer Age:");
		int Age=s.nextInt();
		System.out.println("\nEnter Customer Mobile number:");
		String Mob=s.next();
		while(Mob.length()!=10)
		{
			System.out.println("\nEnter a 10 digit number!");
			Mob=s.next();
			
		}
		System.out.println("\nEnter Customer Date of Birth(DD-MM-YYYY):");
		String DOB=s.next();
		System.out.println("\nEnter Customer Address:");
		String Address=s.next();
		int flag=0;
		
		for(int i=0;i<c;i++)
		{
				if(t[i].CusID==CusID )			
				flag=1;
		}
				
	
		if(flag==1)
			System.out.println("Customer already exists!!");
		else if(flag==0)
		{
				t[c]=new Ticket(CusID,Cusname,Age,Mob,DOB,Address);
				c=c+1;
				System.out.println("Customer Added!!");
		}
		
		
		
		
	}
	
	
	
	public static void bookTicket(Ticket t[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("\nEnter Customer ID:");
		int id=s.nextInt();
		System.out.println("\nEnter Customer Name:");
		String CusName=s.next();
	
		System.out.println("\nEnter Customer Mobile number:");
		String ph=s.next();
		while(ph.length()!=10)
		{
			System.out.println("\nEnter a 10 digit number!");
			ph=s.next();
			
		}
		System.out.println("\nEnter Starting Point:");
		String start=s.next();
		System.out.println("\nEnter Destination Point:");
		String dest=s.next();
	
		//to get present date
		Date date1=new Date();
		SimpleDateFormat formatter= new SimpleDateFormat("MM/dd/yyyy");
		String date=formatter.format(date1);
		
		char pm[]=new char[2];
		char pd[]=new char[2];
		char py[]=new char[4];
		
		pd[0]=date.charAt(3);
		pd[1]=date.charAt(4);
		int pdi=0;
		for(int i=0;i<2;i++)
		{
			 pdi= pdi*10 +((int)pd[i] -48);
		}
		
		pm[0]=date.charAt(0);
		pm[1]=date.charAt(1);
		int pmi=0;
		for(int i=0;i<2;i++)
		{
			 pmi= pmi*10 +((int)pm[i] -48);
		}
		
		int pyi=0;
		py[0]=date.charAt(6);
		py[1]=date.charAt(7);
		py[2]=date.charAt(8);
		py[3]=date.charAt(9);
		for(int i=0;i<4;i++)
		{
			 pyi= pyi*10 +((int)py[i] -48);
		}
		
		System.out.println(pmi+" "+pdi+" "+pyi);
		
		System.out.print("Enter the travel Date(MM/dd/yyyy):");
		String tdate=s.next();
		
		char tm[]=new char[2];
		char td[]=new char[2];
		char ty[]=new char[4];
		
		td[0]=tdate.charAt(3);
		td[1]=tdate.charAt(4);
		int tdi=0;
		for(int i=0;i<2;i++)
		{
			 tdi= tdi*10 +((int)td[i] -48);
			 System.out.println("tdi"+tdi);
		}
		
		tm[0]=tdate.charAt(0);
		tm[1]=tdate.charAt(1);
		int tmi=0;
		for(int i=0;i<2;i++)
		{
			System.out.println("tm[i]"+ tm[i]);
			 tmi= tmi*10 +((int)tm[i] -48);
		}
		
		int tyi=0;
		ty[0]=tdate.charAt(6);
		ty[1]=tdate.charAt(7);
		ty[2]=tdate.charAt(8);
		ty[3]=tdate.charAt(9);
		for(int i=0;i<4;i++)
		{
			 tyi= tyi*10 +((int)ty[i] -48);
		}
		
		System.out.println(tmi+" "+tdi+" "+tyi);
		
		//input date
		date dt= new  date();
		int diff=dt.getDifference(pdi,pmi,pyi,tdi,tmi,tyi);
		
		int flag=0;
		for(int i=0;i<c;i++)
		{
			if(t[i].CusID==id && t[i].Mob.equals(ph) && diff<=30)
			{	

				System.out.println("Ticket booked for "+t[i].CusName+" on "+tdate+"!!");
				flag=1;
				break;
			}
		}

		
		if(flag==0 || diff>30)
		{
			System.out.println("Unable to book!!! ");
		}
	}
		
		
		
		
	
	
	public static void displayCustomer(Ticket t[])
	{
		Scanner s = new Scanner(System.in);
		int flag=0;
		System.out.println("MENU \n1.DISPLAY CUSTOMERS BASED ON CITY\n2.DISPLAY CUSTOMERS BASED ON ID\n3.DISPLAY CUSTOMERS BASED ON NAMES\n4.EXIT\nEnter choice :");
		int ch=s.nextInt();
		do 
		{
			if(ch==1)
			{
				sortCity(t);
				flag=1;
			}
			else if(ch==2)
			{
				sortID(t);
				flag=1;
			}	
			else if(ch==3)
			{
				sortNames(t);
				flag=1;
			}
			else if(ch==4)
			{
				System.out.println("Exiting");
				System.exit(0);
				flag=1;
			}
			else
			{
				System.out.println("Wrong choice,try again!");
				continue;
			}
		}while(flag!=1);	
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket t[]=new Ticket[100];
		Scanner s = new Scanner(System.in);
		int ch=0;
		int flag=0;
		do
		{
			System.out.println("\nBUS TICKET BOOKING \n------------------------------------------------");
			System.out.println("\n1.ADD CUSTOMER DETAILS\n2.BOOK A TICKET\n3.DISPLAY CUSTOMERS \n4.EXIT");
			System.out.println("\nEnter the choice:");
			ch=s.nextInt();
			if(ch==1)
				addCustomer(t);
			else if(ch==2)
				bookTicket(t);
			else if(ch==3)
				displayCustomer(t);
			else if(ch==4)
			{
				System.out.println("Exiting");
				flag=1;
				System.exit(0);
			}
			else
			{
				System.out.println("Wrong choice!Try again");
				System.out.println("*************************");
				continue;
			}
			 
		}while(flag!=1);
		
		
		
	}

}
class date
{ 

	 
	static int monthDays[] = {31, 28, 31, 30, 31, 30, 
							31, 31, 30, 31, 30, 31}; 

	
	static int countLeapYears(int y,int m) 
	{ 
		int years = y; 

		
		if (m <= 2) 
		{ 
			years--; 
		} 

		
		return years / 4 - years / 100 + years / 400; 
	} 

	
	static int getDifference(int pd,int pm,int py,int td,int tm,int ty) 
	{ 
		
			int flag=0;
			int s=0;
			int n1=0,n2=0;
			if( py==ty && pm==tm)
			{
				if(td==pd ||td<pd )		//present day== travel date
					flag=1;
				
			}
			
			else
			{	
			n1=py*365+pd;

			for (int i = 0; i < pm - 1; i++) 
			{ 
				n1 += monthDays[i]; 
			} 
 
			n1 += countLeapYears(py,pm); 
 
			n2=ty*365+td;
			for (int i = 0; i < tm - 1; i++) 
			{ 
				n2 += monthDays[i]; 
			} 
			n2 += countLeapYears(ty,tm); 
			
			}
			
			if(n1-n2<0)
				 s= (n1-n2)*(-1);
			else
				s=(n1-n2);
			if(flag==0)
				return s; 
			else
				return 1000;
		
	} 

	
} 


