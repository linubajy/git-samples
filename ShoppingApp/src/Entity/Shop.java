package Entity;

//pre insrted
public class Shop 
{

	private int itemId;
	private String itemName;
	private float pricePerItem;
	private int itemQuantity;
	
	public Shop() 
	{
		super();
		
	}
	
	public Shop(int itemId, String itemName, float pricePerItem, int itemQuantity)
	{
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.pricePerItem = pricePerItem;
		this.itemQuantity = itemQuantity;
	}
	
	public int getItemId()
	{
		return itemId;
	}
	
	public void setItemId(int itemId) 
	{
		this.itemId = itemId;
	}
	
	public String getItemName()
	{
		return itemName;
	}
	
	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}
	
	public float getPricePerItem()
	{
		return pricePerItem;
	}
	
	public void setPricePerItem(float pricePerItem) 
	{
		this.pricePerItem = pricePerItem;
	}
	
	public int getItemQuantity() 
	{
		return itemQuantity;
	}
	
	public void setItemQuantity(int itemQuantity)
	{
		this.itemQuantity = itemQuantity;
	}
	
	
	

	

}
