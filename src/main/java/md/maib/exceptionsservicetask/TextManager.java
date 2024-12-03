package md.maib.exceptionsservicetask;

import java.util.logging.Logger;

public class TextManager {

    static Logger logger = Logger.getLogger(TextManager.class.getName());

    public static int getTheTextLength(String inputString) {
        return inputString.length();
    }

    public static int getTheTextLengthTryCatch(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException capturedExceptionInTryCatch) {
            logger.info("Am exception has been captured with the following message: " + capturedExceptionInTryCatch.getMessage());
            return 0;
        } finally {
            logger.info("The block is executed no matter what.");
        }
    }

    public static int getTheTextLengthFile(String inputString) {
        if (inputString == null) {
            throw new IllegalArgumentException("The input string cannot be null.");
        } else {
            return inputString.length();
        }
    }
}
