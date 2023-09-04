import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ComputerUser {

    private static String computerOption;

    public static String setComputerOption() {
        String[] theComputersOptions = {"rock", "paper", "scissors"};
        int randIdx = ThreadLocalRandom.current().nextInt(theComputersOptions.length);
        String randOpt = theComputersOptions[randIdx];
        return randOpt;

    }




}
