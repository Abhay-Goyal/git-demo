package PracticeTest.Restart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Alpha {


	private static Logger log=LogManager.getLogger(Alpha.class.getName());
	
	public static void main(String[] args) {
		log.info("Test is passed");
		log.debug("This is a debug");
		log.error("This is an error");
		
	}
	
}