import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    Scrabble userScrabble = new Scrabble();
    String userWord = console.readLine("Enter a word\n");
    System.out.println(userScrabble.calculateScore(userWord));
  }
}
