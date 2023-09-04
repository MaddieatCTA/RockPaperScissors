import java.util.Scanner;

public class UserName {

    private static String name;
    private static String option;

    private static String playAgain;


    private static Scanner user_input = new Scanner(System.in);


    public void setNameFromInput() {
        System.out.println("what is your name?");
        this.name = user_input.next();
    }

    public void setOption() {
        System.out.println("Please pick rock, paper, or scissors.");
        this.option = user_input.next();
    }

    public void setPlayAgain(){
        System.out.println("Do you want to play again?");
        this.playAgain = user_input.next();


    }

    public static String getPlayAgain(){
        return playAgain;
    }


    public static String getName() {
        return name;
    }


    static String getOption() {
        return option;
    }

}
