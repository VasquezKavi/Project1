
/**
 * Write a description of class ReadFile here.
 * 
 * @author Kavi Vasquez 
 * @version 8/30/2013
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ReadFile
{
    // instance variables - replace the example below with your own
    public void reader(Scanner inFile)
    {
        while (inFile.hasNext())
        {
            String words = inFile.next();
            System.out.println("WORDS:" + words);
        }
    }
    public static void main(String []args)
    {
        if (args.length < 1){
            System.out.println("Yeah... I don't think I can do that. I need a file name to read");
        }
        else{
            File fileToRead = new File(args[0]);
            try{
                Scanner in = new Scanner(fileToRead);
                ReadFile mainObject = new ReadFile();
                mainObject.reader(in);
            }
            catch(IOException e) {
                System.out.println("Yeah, you have got a problem. I need that file." + e);
            }
    }

}
}