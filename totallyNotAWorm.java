import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.security.SecureRandom;
/**
 * A self copying, self compiling, and self running quine. Limited to finite number of runs.
 * @author Dustin Ray
 * @version Summer 2021
 * */
public class totallyNotAWorm {
    /** ascii value for quote symbol. */
    private static final int QUOTE = 34;
    /** ascii value for new line symbol. */
    private static final int NEW_LINE = 10;
    /** loop counter to prevent damage to Tom's computer. */
    private static int runCount = 0;
    /** Source code of this file.  */
    private static final String SOURCE = """ 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.security.SecureRandom;
/**
 * A self copying, self compiling, and self running quine. Limited to finite number of runs.
 * @author Dustin Ray
 * @version Summer 2021
 * */
public class totallyNotAWorm%d {
    /** ascii value for quote symbol. */
    private static final int QUOTE = 34;
    /** ascii value for new line symbol. */
    private static final int NEW_LINE = 10;
    /** loop counter to prevent damage to Tom's computer. */
    private static int runCount = %d;
    /** Source code of this file.  */
    private static final String SOURCE = %c%c%c%c%s%c%c%c;
    /**
     * Main method.
     * @param theArgs command line input. Not used here.
     * @throws IOException if process builder fails to start due to invalid filepaths supplied.
     */
    public static void main(final String[] theArgs) throws IOException {
        int rand = Math.abs(new SecureRandom().nextInt());
        String totallyNotAWorm = String.format(
                SOURCE,
                rand,
                ++runCount,
                QUOTE,
                QUOTE,
                QUOTE,
                NEW_LINE,
                SOURCE,
                QUOTE,
                QUOTE,
                QUOTE
        );
        //randomizes filename to prevent overwriting itself
        String fileName = "./totallyNotAWorm" + rand;
        if (runCount < 5) {
            try {
                new PrintStream(fileName + ".java").print(totallyNotAWorm);
            } catch(final FileNotFoundException e) {
                System.exit(-1);
            }
        } try {
            Thread.sleep(3000);
            new ProcessBuilder("java", fileName).start();
        } catch (final IOException | InterruptedException e) {
            System.exit(-1);
        }
    }
}
""";
    /**
     * Main method.
     * @param theArgs command line input. Not used here.
     * @throws IOException if process builder fails to start due to invalid filepaths supplied.
     */
    public static void main(final String[] theArgs) throws IOException {
        int rand = Math.abs(new SecureRandom().nextInt());
        String totallyNotAWorm = String.format(
                SOURCE,
                rand,
                ++runCount,
                QUOTE,
                QUOTE,
                QUOTE,
                NEW_LINE,
                SOURCE,
                QUOTE,
                QUOTE,
                QUOTE
        );
        //randomizes filename to prevent overwriting itself
        String fileName = "./totallyNotAWorm" + rand;
        if (runCount < 5) {
            try {
                new PrintStream(fileName + ".java").print(totallyNotAWorm);
            } catch(final FileNotFoundException e) {
                System.exit(-1);
            }
        } try {
            Thread.sleep(3000);
            new ProcessBuilder("java", fileName).start();
        } catch (final IOException | InterruptedException e) {
            System.exit(-1);
        }
    }
}
