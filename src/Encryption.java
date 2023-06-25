import static java.lang.Math.abs;

public class Encryption extends Alphabet {
    public String encrypt(String str,int key){
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
                if (index + key < sizeArray) {
                    newIndex = index + key;
                } else {
                    newIndex = abs(sizeArray - (index + key));
                }
                resArray[i] = searchByIndex(newIndex);
            }
        }
        res = String.valueOf(resArray);
        return res;
    }

}
