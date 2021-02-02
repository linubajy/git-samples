package Entity;

import java.sql.Date;

public class Customer 
{
	
	private int custId;
	private String custName;
	private String phone;
	private Date date;
	private float billAmount;
	
	public Customer() 
	{
		super();
	}

	public Customer(int custId, String custName, String phone, Date date)
	{
		super();
		this.custId = custId;
		this.custName = custName;
		this.phone = phone;
		this.date = date;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	
	
	
	
	
}
