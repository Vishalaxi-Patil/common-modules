package com.xworkz.loggers.demo;
import org.apache.log4j.Logger;


public class Loggers {
	static Logger logger;
	static {
		logger = logger.getLogger(Loggers.class);
		// logger=logger.getLogger("Mailsender");
	}

	public static void main(String[] args) {
		logger.debug("Hello");
		logger.debug("World");
		demo();
	}

	public static void demo() {
		logger.trace("Trace");
		logger.debug("Debug");
		logger.fatal("Fatal");
		logger.error("Error");
		logger.info("Info");
		logger.warn("Warning");
		logger.hashCode();
	}

}
