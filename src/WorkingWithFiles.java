import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WorkingWithFiles {

    public List<String> readingFromFile(String url){
        Path path = Path.of(url);
        List<String> list = null;
        if (Files.exists(path)) {
            try {
                list = Files.readAllLines(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return list;
        }else {
            System.out.println("Неверный путь файла");
            return list;
        }

    }

    public void WritingToFile(List<String> list,String url) {
        Path path = Path.of(url);
        if (Files.exists(path)) {
            try {
                Files.write(path, list);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("Неверный путь файла");
        }
    }


}
