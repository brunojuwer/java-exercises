
public class LastDigitChecker {
  public static boolean isValid(int number){
    if(number < 10 || number > 1000){
      return false;
    }
    return true;
  }

  public static boolean hasSameLastDigit(int num1, int num2, int num3){
    int[] newArray = {num1, num2, num3};

    for (int i = 0; i < newArray.length; i++) {
        if(!isValid(newArray[i])){
          return false;
        }
    }
    
    
      
      String convertedNumberToString1 = Integer.toString(newArray[0]);
      String convertedNumberToString2 = Integer.toString(newArray[1]);
      String convertedNumberToString3 = Integer.toString(newArray[2]);

      char[] ch1 = convertedNumberToString1.toCharArray();
      char[] ch2 = convertedNumberToString2.toCharArray();
      char[] ch3 = convertedNumberToString3.toCharArray();

    if(ch1[ch1.length - 1] == ch2[ch2.length - 1]){
      return true;
    } else if(ch1[ch1.length - 1] == ch3[ch3.length - 1]){
      return true;
    } else if(ch2[ch2.length - 1] == ch3[ch3.length - 1]){
      return true;
    }

    return false;
  }
}
