import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WorkingWithFiles {

    public List<String> readingFromFile(String url){
        Path path = Path.of(url);
        List<String> list;
        try {
            list = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void WritingToFile(List<String> list,String url){
        Path path = Path.of(url);
        try {
            Files.write(path,list);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
