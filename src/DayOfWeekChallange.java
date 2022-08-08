public class DayOfWeekChallange {

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void printDayOfTheWeek2(int day){
        String[] values = new String[7];
        values[0] = "Sunday";
        values[1] = "Monday";
        values[2] = "Tuesday";
        values[3] = "Wednesday";
        values[4] = "Thursday";
        values[5] = "Friday";
        values[6] = "Saturday";


        if (day < 7 && day >= 0){
            System.out.println(values[day]);
        } else {
            System.out.println("Invalid day");
        }
    }
}
