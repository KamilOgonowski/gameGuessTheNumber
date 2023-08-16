public class Game {
    private final int numberToBeGueseed;
    public Game() {
        GenerateNumber num = new GenerateNumber();
        this.numberToBeGueseed = num.generateNumber();
    }
    public void play() {
        int yourGuess;
        do {
            yourGuess = Console.giveANumber();
        } while (yourGuess != numberToBeGueseed);
        System.out.println("Wprowadzona liczba " + yourGuess + " jest rowna poszuiwanej liczbie. Brawo");
    }
    public int getNumberToBeGueseed() {
        return numberToBeGueseed;
    }
}

