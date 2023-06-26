import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Decryption extends Alphabet {

    private  String inputUrl;
    private String outputUrl;
    public Decryption(String inputUrl, String outputUrl){
        this.inputUrl = inputUrl;
        this.outputUrl = outputUrl;
    }
    public Decryption(){};

    protected String decrypt(String str,int key){
        String res;
        int index;
        int newIndex;
        char[] arrayStr = str.toLowerCase().toCharArray();
        char[] resArray = new char[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++) {
            index = indexSearch(arrayStr[i]);
            if (index == -1){
                resArray[i] = arrayStr[i];
            }else {
                if (index - key >= 0) {
                    newIndex = index - key;
                } else {
                    newIndex = (sizeArray - abs(index - key));
                }
                resArray[i] = searchByIndex(newIndex);
            }
        }
        res = String.valueOf(resArray);
        return res;
    }

    public void decryptFile(){
        WorkingWithFiles workingWithFiles = new WorkingWithFiles();
        if (workingWithFiles.readingFromFile(outputUrl) != null) {
            List<String> list = workingWithFiles.readingFromFile(outputUrl);
            List<String> resList = new ArrayList<>();
            for (String str:list) {
                resList.add(decrypt(str,2));
            }
            workingWithFiles.WritingToFile(resList,inputUrl);
        }

    }
}
