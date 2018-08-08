package application;

import java.util.HashMap;
import java.util.Map;



		public class Service {
	
		
		private HashMap<Integer, Account> hashmap = new HashMap<>();
		private int nextid=0;
		
		public void addanaccount(String firstname, String lastname, String accountnumber) {
			
			Account accountoject = new Account(firstname, lastname, accountnumber);
			
			hashmap.put(nextid, accountoject);
			
			nextid++;
			
			
			
			}
		
		public void retrieveaccount (String id) {
			
			System.out.println(hashmap.get(id));
			
			
			
		}
		
		
		
			
		}
		
		
		
	


	


