package pojos;

public class NumberGuessGame {

        public int magicNumber = (int) (Math.random() * max) +min;
        public int numGuesses;
        public boolean over;

        public static final int min = 1;
        public static final int max = 100;
        public static int max_guesses = 10;

  public String guess (int number){

      String message = null;
      if (number == magicNumber){
          over = true;
          message = "That is the magic number!";
      }else if (number < magicNumber){
          message = "too low";
      } else if ( number > magicNumber){
          message = "too high";
      } if (numGuesses == max_guesses){
          over = true;
          message = "you have used all of your guesses";
      }
      return message;
  }


}
