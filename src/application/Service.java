package application;

import java.util.HashMap;
import java.util.Map;



		public class Service {
		private int newid=0;
		private HashMap<Integer, Account> accountmap = new HashMap<>();
		
		
		public void addanaccount(String firstname, String lastname, String accountnumber) {
			
			Account accountobject;
			accountobject = new Account(firstname, lastname, accountnumber);
						
			
			accountmap.put(newid, accountobject);
			
			newid++;
			
			
			
			}
		
		public void retrieveaccount (int id) {
			
		
			
			System.out.println(accountmap.get(id).getFirstname());
			System.out.println(accountmap.get(id).getLastname());
			System.out.println(accountmap.get(id).getAccountnumber());
			
			
			
		}
		
		
		
			
		}
		
		
		
	


	


