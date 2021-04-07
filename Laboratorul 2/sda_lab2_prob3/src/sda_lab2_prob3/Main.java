package sda_lab2_prob3;

public class Main {
	
	public static void main(String[] args) {
		
		Adress address=new Adress("Brasov","Octavian Goga",19);
		PaymentMethod pm= new PaymentMethod("Cash");
		Customer c = new Customer(address, pm, "Theodor", "Patratanu", 21);
		
		System.out.println(c.getCompleteName());
		System.out.println(c.getAdress().getFullAdress());
		System.out.println(c.getPaymentMethod().getType());
	}
}
