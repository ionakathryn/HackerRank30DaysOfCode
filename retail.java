
class Customer{
	private int customerId;
	public void setCustomerId(int customerId){
	this.customerId = customerId;
	}

	public int getCustomerId(){
	return customerId;
	}
}

class Retail{
	public static void main (String args[]){
	Customer john = new Customer();
	john.setCustomerId(100);
	System.out.println("Customer Id: " + john.getCustomerId());
	}
}