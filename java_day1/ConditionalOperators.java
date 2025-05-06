public class ConditionalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int day = 3; 

        int max = (a > b) ? a : b;
        System.out.println("The maximum value is: " + max);

        if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is not less than " + b);
        }

        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + day + " is: " + dayName);
s
        boolean condition1 = (a < b); 
        boolean condition2 = (a > 0);  

        if (condition1 && condition2) {
            System.out.println(a + " is less than " + b + " and " + a + " is positive.");
        }

        if (condition1 || condition2) {
            System.out.println("At least one of the conditions is true.");
        }

        if (!condition1) {
            System.out.println(a + " is not less than " + b);
        }
    }
}
