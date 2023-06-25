import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputUrl = "D:\\Java\\Курсы\\Cryptography\\src\\A.txt";
        String outputUrl = "D:\\Java\\Курсы\\Cryptography\\src\\B.txt";
        Encryption encryption = new Encryption(inputUrl,outputUrl);
        Decryption decryption = new Decryption(inputUrl,outputUrl);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что хотите сделать если Зашифровать то напишите 1 если расшифровать то 2");
        String pos = scanner.nextLine();
        switch (pos){
            case "1" -> encryption.encryptFile();
            case "2" -> decryption.decryptFile();
            default -> System.out.println("Введена неверная позиция");
        }




}
}