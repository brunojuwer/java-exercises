
public class NumberPalindrome {
  

public static boolean isPalindrome(int number){

  String copy = Integer.toString(number);
  String newString;
  if(number < 0) {
     newString = copy.substring(1); 
  } else {
    newString = copy;
  }

  char[] ch = newString.toCharArray();

  char[] newArray = new char[newString.length()];

  int index = 0;
  for (char c : ch) {
    newArray[index] = c;
    System.out.println(c);
    index++;
  }
  
  char[] revertedArray = new char[newArray.length];
  int index2 = 0;

  for (int i = newArray.length - 1; i >= 0; i--) {
      
      revertedArray[i] = newArray[index2];
      index2 ++;
  }



  boolean verification = true;
  
  for (int i = 0; i < revertedArray.length; i++) {

    if (revertedArray[i] == newArray[i] && verification){
      verification = revertedArray[i] == newArray[i];
    } else {
      return false;
    }
  }

  
  return verification;
}
}

