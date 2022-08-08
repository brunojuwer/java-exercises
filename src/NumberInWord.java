public class NumberInWord {
    public static void printNumberInWord(int number){
        String[] numbers = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

        String printNumber = number >= 0 && number < 10 ? numbers[number] : "OTHER";

        System.out.println(printNumber);
    }
}
