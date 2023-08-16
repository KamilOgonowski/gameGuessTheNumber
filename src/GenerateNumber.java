import java.util.Random;

public class GenerateNumber {

    Random NumberToGuess = new Random();
    int min = 1;
    int max = 10;

    public int generateNumber(){
        int num = NumberToGuess.nextInt(min + max) + min;
        return num;
    }
}
