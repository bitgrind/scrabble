import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnScoreForSingleLetter_int() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnScoreForMultipleLetter_int() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 16;
    assertEquals(expected, testScrabble.calculateScore("aedbfk"));
  }

  @Test
  public void calculateScore_returnScoreCorrectlyForJAndX_int() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 24;
    assertEquals(expected, testScrabble.calculateScore("aedbfkj"));
  }

  @Test
  public void calculateScore_returnScoreCorrectlyForQAndZ_int() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 26;
    assertEquals(expected, testScrabble.calculateScore("aedbfkq"));
  }

  @Test
  public void calculateScore_returnScoreForUppercaseWords_int() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 26;
    assertEquals(expected, testScrabble.calculateScore("AEDBFKQ"));
  }

  @Test
  public void calculateScore_returnScoreWordsWithNumbers_int() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 26;
    assertEquals(expected, testScrabble.calculateScore("AEDBFKQ8"));
  }
}
