public class SharedDigit {
  public static boolean hasSharedDigit(int num1, int num2){
    if(num1 < 10 || num2 < 10){
      return false;
    }
    if(num1 > 99 || num2 > 99){
      return false;
    }

    String convertedNumberToString1 = Integer.toString(num1);
    String convertedNumberToString2 = Integer.toString(num2);

    char[] ch1 = convertedNumberToString1.toCharArray();
    char[] ch2 = convertedNumberToString2.toCharArray();

    for (int i = 0; i < ch1.length; i++) {
      for (int j = 0; j < ch2.length; j++) {
        if (ch1[i] == ch2[j]){
          return true;
        }
      }
    }


    return false;
  }
}
