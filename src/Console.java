import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);
    public static int giveANumber(){
        System.out.println("Insert your guess:  ");
        return scanner.nextInt();
    }
}
