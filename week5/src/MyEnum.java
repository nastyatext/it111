import java.util.Scanner;

public class MyEnum {

    enum WhoWins {HOME,VISITOR,NEITHER}
    public static void main (String[] args) {
        WhoWins who;

        int seahawks, broncos;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the final score for the Seahawks");
        seahawks = input.nextInt();

        System.out.println("Please enter the final score for the Broncos");
        broncos = input.nextInt();

        if (seahawks > broncos) {
            who = WhoWins.HOME;
        }


    }
}
