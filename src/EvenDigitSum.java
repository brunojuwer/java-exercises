public class EvenDigitSum {
  
  public static int getEvenDigitSum(int number) {
    if(number < 0 ){
      return -1;
    }

    String convertedNumberToString = Integer.toString(number);

    char[] ch = convertedNumberToString.toCharArray();

    int sum = 0;
    

    for (int i = 0; i < ch.length; i++) {
      if(ch[i] % 2 == 0){
        sum += Character.getNumericValue(ch[i]);
      }
    }


    return sum;
  }
}
