import java.util.Scanner;
public class VowelOrConsonant {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a character:");
char ch = scanner.next().charAt(0);
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
System.out.println(ch + " is a vowel.");
     } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
System.out.println(ch + " is a consonant.");
} else {
System.out.println(ch + " is not a letter.");
        }
    }
}