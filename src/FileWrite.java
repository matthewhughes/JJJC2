import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 09/04/13
 * Time: 17:48
 * To change this template use File | Settings | File Templates.
 */
public class FileWrite {
    public static void WriteLine(String FileName, String Line){
        try{
            BufferedWriter dout = new BufferedWriter(new FileWriter(FileName, true));
            dout.write(Line);
            dout.newLine();
            dout.close();
        }   catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }

    }
}
