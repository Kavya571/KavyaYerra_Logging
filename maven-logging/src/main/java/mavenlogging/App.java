package mavenlogging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	public static void main(String args[]){
		//LOGGER.error("Hello World");
		LOGGER.debug("this is a debug logger");
		LOGGER.info("this is a info logger");
		LOGGER.warn("this is a warn logger");
		LOGGER.error("this is a error logger");
		LOGGER.fatal("this is a fatal logger");
	}
}