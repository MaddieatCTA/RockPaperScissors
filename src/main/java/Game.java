import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Game {

    public void playTheGame() {

        String userOpt = UserName.getOption();
        String compOpt = ComputerUser.setComputerOption();
        System.out.println("you chose " + userOpt + ". let's see if you win:");
        System.out.println(" ");
        System.out.println("The computer has chosen " + compOpt + ".");


        if (Objects.equals(userOpt, "rock") && Objects.equals(compOpt, "rock")) {
            System.out.println("you drew. Play again:");
            UserName user2 = new UserName();
            user2.setOption();
            Game game2 = new Game();
            game2.playTheGame();
        } else if (Objects.equals(userOpt, "paper") && Objects.equals(compOpt, "paper")) {
            System.out.println("you drew. Play again:");
            UserName user2 = new UserName();
            user2.setOption();
            Game game2 = new Game();
            game2.playTheGame();
        } else if (Objects.equals(userOpt, "scissors") && Objects.equals(compOpt, "scissors")) {
            System.out.println("you drew. Play again:");
            UserName user2 = new UserName();
            user2.setOption();
            Game game2 = new Game();
            game2.playTheGame();
        } else if (Objects.equals(userOpt, "rock") && Objects.equals(compOpt, "scissors")) {
            System.out.println("Congratulations, you win!");
        } else if (Objects.equals(userOpt, "scissors") && Objects.equals(compOpt, "paper")) {
            System.out.println("Congratulations, you win!");
        } else if (Objects.equals(userOpt, "paper") && Objects.equals(compOpt, "rock")) {
            System.out.println("Congratulations, you win!");
        } else if (Objects.equals(userOpt, "rock") && Objects.equals(compOpt, "paper")) {
            System.out.println("I'm sorry, you have lost :(");
        } else if (Objects.equals(userOpt, "paper") && Objects.equals(compOpt, "scissors")) {
            System.out.println("I'm sorry, you have lost :(");
        } else if (Objects.equals(userOpt, "scissors") && Objects.equals(compOpt, "rock")) {
            System.out.println("I'm sorry, you have lost :(");

        }

    }

}




