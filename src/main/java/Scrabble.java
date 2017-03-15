public class Scrabble {
  public Integer calculateScore(String input) {
    String[] letters = {"aeioulnrst", "dg", "bcmp", "fhvwy", "k", "jx", "qz"};
    Integer score = 0;
    String[] inputChars = input.toLowerCase().split("");
    for (String eachChar : inputChars) {
      for (int i = 0; i < letters.length; i++) {
        if (letters[i].contains(eachChar)) {
          if (i == 5) {
            score += i+3;
          } else if (i == 6) {
            score += i+4;
          } else {
            score += i+1;
          }
        }
      }
    }
    return score;
  }
}
