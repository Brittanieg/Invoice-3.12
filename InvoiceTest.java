public class InvoiceTest {

	public static void main(String[] args) {

	Invoice first= new Invoice();
	Invoice second= new Invoice("hju789j","shower",7,39.88);
	first.setPartNumber("hj7768yuj");
	first.setPartDiscription("sink");
	first.setQuantity(4);
	first.setPrizePerItem(45.99);
	

	System.out.println("firstpart number is "+first.getPartNumber());
	System.out.println("firstpart Discription is "+first.getPartDiscription());
	System.out.println("firstpart Quantity is "+first.getQuantity());
	System.out.println("firstpart prizeperitem is "+first.getPrizePerItem());
	System.out.println("firstpart total amount paid "+first.getInvoiceAmount());
	
	System.out.println("Secondpart number is "+second.getPartNumber());
	System.out.println("Secondpart Discription is "+second.getPartDiscription());
	System.out.println("Secondpart Quantity is "+second.getQuantity());
	System.out.println("Secondpart prizeperitem is "+second.getPrizePerItem());
	System.out.println("Secondpart total amount paid "+second.getInvoiceAmount());
	
	}	
}
