public class Main {
    public static void main(String[] args) {
        Encryption encryption = new Encryption();
        Decryption decryption = new Decryption();
        System.out.println(encryption.encrypt("Привет Мир",2));
        System.out.println(decryption.decrypt("сткджфбокт",2));
}
}