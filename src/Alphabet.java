import java.util.ArrayList;
import java.util.Arrays;

public class Alphabet {
    //абвгдеёжзийклмнопрстуфхцчшщъыьэюя
    private static final char[] alphabet = new char[]{'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н',
            'о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я',
            '.' ,',','”', ':','-','!','?',' '};
    protected static final int sizeArray = alphabet.length;

    protected int indexSearch(char symbol){
        int resIndex;
        resIndex = -1;
        for (int i = 0; i < alphabet.length; i++) {
            if (symbol == alphabet[i]){
                resIndex = i;
            }
        }
        return resIndex;
    }
    protected char searchByIndex(int index){
        return alphabet[index];
    }



}
