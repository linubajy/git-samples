
//29

public class BankBalance
{

	int custId;
	String custName;
	String custAddress;
	String accType;
	double custBalance;
	
	BankBalance()//default constructor
	{
		 custId = 0000 ;
		 custName="Default name";
		 custAddress="Default Address";
		 accType="Default Account type";
		 custBalance=15000.00;
		// System.out.println("Default constructor executed!");
		
	}
	
	void getters(){}
	void setters() {}
	
	BankBalance(int id,String name ,String address)
	{
		this();
		this.custId = id;
		this.custName=name;
		this.custAddress=address;
		
	}
	
	BankBalance(int id,String name)
	{
		this();
		custId=id;
		custName=name;
		
		
	}
	
	BankBalance(int id,String name,String address,String type, int bal)
	{
		
		this();
		this.custId = id;
		this.custName=name;
		this.custAddress=address;
		this.accType=type;
		this.custBalance=bal;
		
	}
	
	void display()
	{
		
		System.out.println("ID:"+ custId);
		System.out.println("Name:"+ custName);
		System.out.println("Address:"+ custAddress);
		System.out.println("Account Type:"+accType);
		System.out.println("Balance:"+custBalance);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//set2_4 se = new set2_4();
		//se.display();
		
		BankBalance se2= new BankBalance(900,"bilu");
		se2.display();

	
	}

	
}
