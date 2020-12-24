import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TryItOut {

    public static String order(String words) {
        String result = "";
        HashMap<Integer, String> wordsMap = new HashMap<>();
        String[] splitWords = words.split(" ");

        if(splitWords.length == 0 || splitWords[0] == "")
            return "";

        for (int n = 0; n < splitWords.length; n++ ){
            for(int i = 0; i < splitWords[n].length(); i++){
                int currentCharAsInt = splitWords[n].charAt(i) - '0';
                if(currentCharAsInt < 10)
                    wordsMap.put(currentCharAsInt, splitWords[n]);
            }
        }

        for(int i = 1; i <= splitWords.length; i++) {
            result += wordsMap.get(i);
            if (i < splitWords.length)
                result += " ";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(order(""));
    }
}
