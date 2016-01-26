import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Oleg on 25.01.2016.
 */
public class Main {
    public static void main(String[] args)throws IOException {

        if(args.length == 0){
            System.out.println("Arguments not mentioned");
        }
        Scanner sc = new Scanner(System.in);
        InputStreamReader r = new InputStreamReader(System.in);
        Parser parser = new Parser(args);

        while(sc.hasNext()){
            String input = sc.nextLine();
            if(parser.parse(input))
                System.out.println(input);
        }


    }
}
