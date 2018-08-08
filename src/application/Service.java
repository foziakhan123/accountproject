package application;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



		public class Service {
		private int newid=0;
		private HashMap<Integer, Account> accountmap = new HashMap<>();
		
		
		public HashMap<Integer, Account> getAccountmap() {
			return accountmap;
		}

		public void setAccountmap(HashMap<Integer, Account> accountmap) {
			this.accountmap = accountmap;
		}
		

		public void addanaccount(String firstname, String lastname, String accountnumber) {
			
			Account accountobject;
			accountobject = new Account(firstname, lastname, accountnumber);
						
			
			accountmap.put(newid, accountobject);
			
			
			newid++;
		
		}
		
		public void retrieveaccount (int id) {
			
		
			
		//	System.out.println(accountmap.get(id).getFirstname());
			//System.out.println(accountmap.get(id).getLastname());
			//System.out.println(accountmap.get(id).getAccountnumber());
			
			
			
		}
		
		
		
			
		}
		
		
		
	


	


