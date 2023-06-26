import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputUrl;
        String outputUrl;

        BruteForce bruteForce = new BruteForce();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что хотите сделать если Зашифровать то напишите 1 если расшифровать то 2\n" +
                "Если хотите использовать метод brute force нажмите 3");
        String pos = scanner.nextLine();
        switch (pos){
            case "1" -> {
                System.out.println("Введите файл источник");
                inputUrl = scanner.nextLine();
                System.out.println("Введите файл для записи");
                outputUrl = scanner.nextLine();
                Encryption encryption = new Encryption(inputUrl,outputUrl);
                encryption.encryptFile();}
            case "2" -> {
                System.out.println("Введите файл источник");
                outputUrl = scanner.nextLine();
                System.out.println("Введите файл для записи");
                inputUrl = scanner.nextLine();
                Decryption decryption = new Decryption(inputUrl,outputUrl);
                decryption.decryptFile();
            }
            case "3" -> {
                System.out.println("Введите файл источник");
                outputUrl = scanner.nextLine();
                bruteForce.bruteForce(outputUrl);
            }
            default -> System.out.println("Введена неверная позиция");
        }


}
}