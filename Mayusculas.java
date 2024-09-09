package triangulodepascal;
import java.util.Scanner;

public class Mayusculas {

    public static String Pmayuscula(String input) {
        char[] charArray = input.toCharArray();

        if (charArray.length > 0 && charArray[0] >= 'a' && charArray[0] <= 'z') {
            charArray[0] = (char) (charArray[0] - 'a' + 'A');
        }

        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i - 1] == ' ' && charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char) (charArray[i] - 'a' + 'A');
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String input = scanner.nextLine();
        String result = Pmayuscula(input);
        System.out.println(result);
    }
}
//hecho por lalo con ayuda de algunos videos
