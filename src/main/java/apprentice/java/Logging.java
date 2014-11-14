package apprentice.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Write an application that uses the slf4j logging library directly (can also choose log4j if you want)
 * <pre>
 * Do the following:
 *   configure the logging using an accepted department log statement format (see Application Logging)
 *   log at different logging levels (error, warn, info, debug), to see the effect of the default logging level setting
 *   turn on DEBUG in the logging config to show DEBUG output
 *   configure logging to go to both the console and a log file
 * </pre>
 */
public class Logging {

  private static final Logger logger = LoggerFactory.getLogger(Logging.class);
  private static final String THE_MESSAGE = "my message";


  public static void main(String... args) {
    logger.debug("debug message: {}", THE_MESSAGE);
    logger.info("info message: {}", THE_MESSAGE);
    logger.warn("warn message: {}", THE_MESSAGE);
    logger.error("error message: {}", THE_MESSAGE);

    MDC.put("mdc_value", "Actual MDC value");
    try {
      // The MDC value should get added to all logged messages
      nestedMethod();
      logger.warn("warn message: {}", THE_MESSAGE);
      logger.error("error message: {}", THE_MESSAGE);
    }
    finally {
      MDC.remove("mdc.value");
    }

  }

  public static void nestedMethod() {
    logger.info("This should have MDC value");
  }

}
