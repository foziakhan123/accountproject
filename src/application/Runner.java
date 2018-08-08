package application;

public class Runner {

	
	public static void main(String[] args) {
		
		Service printaccount = new Service();
		
		
		printaccount.addanaccount("fozia", "khan", "1234");
		printaccount.addanaccount("chris", "perrins","1235");
		printaccount.retrieveaccount(1);
	
		

	}

}
