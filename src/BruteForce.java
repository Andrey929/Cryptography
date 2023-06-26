import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class BruteForce extends Decryption {
    public static boolean checkPunctuation(String text) {
        // Проверка наличия пробелов после знаков пунктуации
        if (text.matches(".*[.,?!:]\\S+.*")) {
            return true;
        }
        // Проверка наличия только одного пробела между словами
        if (text.matches("^\\w+(\\s\\w+)*$") && !text.matches("^.*\s{2,}.*$")) {
            return true;
        }
        return false;
    }
    public int bruteForce(String str){
        int res;
        res = 0;
        Path path = Path.of(str);
        List<String> list;
        try {
            list = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String tmpStr;
        for (int i = 0; i < sizeArray; i++) {
            for (String line:list) {
                tmpStr = decrypt(line,i);
                if (!checkPunctuation(tmpStr)){
                    System.out.println(tmpStr);
                    res = i;
                }
            }
        }
        return res;
    }

}
