public class FirstLastDigitSum {

  public static int sumFirstAndLastDigit(int number){
    if(number < 0 ){
      return -1;
    }

    String convertedNumberToString = Integer.toString(number);

    char[] ch = convertedNumberToString.toCharArray();

    int sum = 0;
    

    int lastDigit = Character.getNumericValue(ch[ch.length - 1]);
    int firstDigit = Character.getNumericValue(ch[0]);

    sum = (lastDigit + firstDigit);


    
    return sum;
  }
}
