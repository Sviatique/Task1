import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by Oleg on 25.01.2016.
 */
public class Parser {
    String[] keysArray;

    Parser(String[] inputArray){
        keysArray = inputArray;
    }
    public boolean parse(String toParse) throws IOException {
        for(String word : keysArray) {
            if (toParse.toLowerCase().contains(word.toLowerCase()))
                return true;
        }

        Pattern p = Pattern.compile(keysArray[0]);
        Matcher m = p.matcher(toParse);
        return m.matches();

    }
}
