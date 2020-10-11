package businessLogic;

import java.util.Date;

import configuration.ConfigXML;
import dataAccess.DataAccessTest;
import domain.Event;


public class BLFacadeImplementationTest {
	DataAccessTest dbManagerTest;
 	
    
	   public BLFacadeImplementationTest()  {
			
			System.out.println("Creating TestFacadeImplementation instance");
			ConfigXML c=ConfigXML.getInstance();
			dbManagerTest=new DataAccessTest(); 
			dbManagerTest.close();
		}
		
		 
		public boolean removeEvent(Event ev) {
			dbManagerTest.open();
			boolean b=dbManagerTest.removeEvent(ev);
			dbManagerTest.close();
			return b;

		}
		
		public Event addEvent(String desc, Date d) {
			dbManagerTest.open();
			Event o=dbManagerTest.addEvent(desc,d);
			dbManagerTest.close();
			return o;

		}

}
