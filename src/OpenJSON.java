import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 02/04/13
 * Time: 17:08
 * To change this template use File | Settings | File Templates.
 */
public class OpenJSON {
    public static String GetDirectory() {
        return System.getProperty("user.dir");
    }

    public static String OpenFileAndConvertToString(String Directory, String FileName){
       String Path = Directory + File.separator + FileName;
       System.out.println(Path);
       String ContentsOfFile = null;
        try {
            // Full disclosure. This one-liner was borrowed from Stack Overflow.
            // http://stackoverflow.com/questions/326390/how-to-create-a-java-string-from-the-contents-of-a-file
            // It's not plagiarism if I fess up to it, right?
            ContentsOfFile = new Scanner(new File(Path), "UTF-8").useDelimiter("\\A").next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found.");
            System.out.println("Remember that file names are case sensitive.");
            System.out.println("Exiting Now");
            System.exit(1);
        }
        return ContentsOfFile;
    }
}
