// Main

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename;

        if(args.length == 0) {
            // No command line arguments. Show info:
            System.out.println(" -> Gimme the filname: ");

            Scanner userInput = new Scanner(System.in);
            filename = userInput.next();
        }
        else {
            // The filename was provided in the command line argument list:
            filename = args[0]; // Whatever bullshit is after the first one will be ignored
        }

        try {
            Reader r = new Reader(filename);
        }
        catch (IOException e) { /*Because fuck you*/ }
    }
}
