public class App {
    public static void main(String[] args) {

       //DayOfWeekChallange.printDayOfTheWeek(5);
       //DayOfWeekChallange.printDayOfTheWeek2(7);

        //NumberInWord.printNumberInWord(10);

        //System.out.println(NumberOfDaysInMonth.isLeapYear(1700));

        //System.out.println(SumOddRange.sumOdd(100, 1000));


        //System.out.println(NumberPalindrome.isPalindrome(-12321));  
    //System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(15422223));
    
    //System.out.println(EvenDigitSum.getEvenDigitSum(252525252));  
    //System.out.println(SharedDigit.hasSharedDigit(99, 93));

    //System.out.println(LastDigitChecker.hasSameLastDigit(11, 15, 32));


    // string builder
                StringBuilder builder = new StringBuilder("Hello");

                String result =  builder.reverse().toString();

                System.out.println(result);


        String result2 =  "H,e,l,l,o";

        String[] newString = result2.split(",");


        for (String letter : newString) {
            System.out.println(letter);
        }
    }

    }
