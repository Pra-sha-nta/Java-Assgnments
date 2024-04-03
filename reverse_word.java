import java.util.Scanner;

class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String reversedStr = "";
        for (int i = 0; i < inputString.length(); i++) {
            reversedStr = inputString.charAt(i) + reversedStr;
        }
        System.out.println("reversed String:" + reversedStr);
    }
}