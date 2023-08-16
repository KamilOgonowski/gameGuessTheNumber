public class Game {

    public Console guess;
    public int numberToBeGueseed;

    public Game() {
        GenerateNumber num = new GenerateNumber();

        this.guess = new Console();
        this.numberToBeGueseed = num.generateNumber();
    }
    public void play() {

        System.out.println("Wprowadz liczbe: ");
        int tryNumber = -1;
        while (tryNumber != numberToBeGueseed){
            tryNumber = guess.pobierzLiczbe();
            System.out.println("Wprowadzona liczba " + tryNumber + " nie jest szukana liczba. Sprobuj jeszcze raz. ");

            System.out.println("szukana liczba " + numberToBeGueseed);
            tryNumber = guess.pobierzLiczbe();
            System.out.println("Wprowadzona liczba " + tryNumber);
        }
        System.out.println("Brawo!! odgadles liczbe");

    }
}
