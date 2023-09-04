import java.util.Scanner;

public class UserName {

    private String name;

    private Scanner user_input = new Scanner(System.in);

    public void setNameFromInput() {
        System.out.println("what is your name?");
        this.name = user_input.next();
    }
}
