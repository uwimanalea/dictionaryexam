package takehome;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictonaryIterateExample {
	 public static void main(String[] args) {
	
			  Dictionary<String, String> dictionary = new Hashtable<>();
				
				 dictionary.put("apple", "a fruit a tech firm"); 
				
				 dictionary.put("orange", "fruite contains rows and columns when used in contect of computers");
				
				 dictionary.put("table", "it is object"); 

System.out.println("Getting values");
Enumeration<String> values = dictionary.elements();
while (values.hasMoreElements()) {
    System.out.println("apple : " );
   System.out.println (values.nextElement()); 
    System.out.println("orange :");
    System.out.println ( values.nextElement());
    System.out.println("table : " );
    System.out.println ( values.nextElement());
} 
			
	    }
	}