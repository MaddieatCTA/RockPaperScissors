import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        UserName user1 = new UserName();
        Game game1 = new Game();
        user1.setNameFromInput();


        System.out.println("Welcome to rock paper scissors, " + UserName.getName() + ".");
        System.out.println(" ");

        boolean playAgain = false;
        do {
            user1.setOption();
            game1.playTheGame();


            user1.setPlayAgain();

            if (Objects.equals(UserName.getPlayAgain(), "yes")) {
                playAgain = true;

            } else {
                System.out.println("Okay, thanks for playing.");
                playAgain = false;
            }
        } while (playAgain);
    }

}