public class Invoice {

	String partNumber,partDiscription;
	int quantity;
	double prizePerItem;
	
	public Invoice(){
		
	}
	public Invoice(	String partNumber,String partDiscription,int quantity,double prizePerItem){
		this.partNumber=partNumber;
		this.partDiscription=partDiscription;
		this.quantity=quantity;
		this.prizePerItem=prizePerItem;
		
		
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDiscription() {
		return partDiscription;
	}

	public void setPartDiscription(String partDiscription) {
		this.partDiscription = partDiscription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrizePerItem() {
		return prizePerItem;
	}

	public void setPrizePerItem(double prizePerItem) {
		this.prizePerItem = prizePerItem;
	}
	
public double getInvoiceAmount(){
	double  total;
	total = (getPrizePerItem()*getPrizePerItem());
	return total;
}


}
