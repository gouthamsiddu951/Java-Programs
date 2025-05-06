import java.util.Scanner;
public class NumberGroupChecker {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number:");
int num = scanner.nextInt();
if (num > 50) {
System.out.println(num + " is above 50.");
} else if (num >= 40 && num <= 50) {
System.out.println(num + " is between 40 and 50.");
} else if (num < 19) {
System.out.println(num + " is less than 19.");
} else {
System.out.println(num + " does not belong to any of the above groups.");
}
if (num % 3 == 0 && num % 4 == 0) {
System.out.println("Good Morning");
} else if (num % 4 == 0) {
System.out.println("Good Afternoon");
} else if (num % 3 == 0) {
System.out.println("Good Evening");
} else {
System.out.println("Good Night");
}
}
}
