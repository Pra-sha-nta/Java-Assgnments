import java.util.Scanner;

class VoCOCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a letter: ");
     String letter = scanner.next().toLowerCase();

        if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u") {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }


        scanner.close();
    }
}
