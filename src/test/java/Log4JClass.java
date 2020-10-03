import org.apache.log4j.Logger;

public class Log4JClass {

	public static void main(String[] args) {
		
		Logger l=Logger.getLogger(Log4JClass.class);
		
		l.info("Hi this is mahesh");
		
		//types of URL.
		
		
		l.info("entering application URL");
		l.warn("Hey this just a warning message");
		l.fatal("hey this is just fatal error message");
		l.debug("this is debug message");
	}

}
