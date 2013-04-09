import java.text.BreakIterator;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 02/04/13
 * Time: 23:02
 * To change this template use File | Settings | File Templates.
 */
public class Iterate {

    public static List<String> SplitOnComma(String FormattedText){
      List<String> Items = Arrays.asList(FormattedText.split("\\s*,\\s*"));
      return Items;
    }

    public static void IterateThroughList(List<String> Items, String FileName){
        String[] ByteCode = null;
        String Value;
        for(String S : Items){
            ByteCode = S.split(":");
            ByteCode[0] = ByteCode[0].substring(0, Math.min(ByteCode[0].length(), 3));
            System.out.println("Length: " + ByteCode[0].length() + ":" + ByteCode[0] + ":");
            OpCodes OP = new OpCodes(); //pan gangnam style
            FileWrite FW = new FileWrite();

            if(ByteCode[0].equals("ADD")){
               Value = OP.ADD(ByteCode[1]);
               FW.WriteLine(FileName, Value);
            } else if (ByteCode[0].equals("SUB")){
                Value = OP.SUB(ByteCode[1]);
                FW.WriteLine(FileName, Value);
            } else if (ByteCode[0].equals("MUL")){
                Value = OP.MUL(ByteCode[1]);
                FW.WriteLine(FileName, Value);
            } else if (ByteCode[0].equals("STP")) {
                Value = OP.STP();
                FW.WriteLine(FileName, Value);
            } else if (ByteCode[0].equals("STD")){
                Value = OP.STD(ByteCode[1]);
                FW.WriteLine(FileName, Value);
            } else if (ByteCode[0].equals("LDI")){
                Value = OP.LDI(ByteCode[1]);
                FW.WriteLine(FileName, Value);
            } else if(ByteCode[0].equals("LDD")){
                Value =  OP.LDD(ByteCode[0]);
                FW.WriteLine(FileName, Value);
            } else if(ByteCode[0].equals("SQR")){
                Value =  OP.SQR(ByteCode[0]);
                FW.WriteLine(FileName, Value);
            } else{
                FW.WriteLine(FileName, "Things went a bit Pete Tong. Check your source code and try again");
                FW.WriteLine(FileName, "The offending line is: " + ByteCode[0] + " " + ByteCode[1]);
                System.out.println("Things went wrong. Have a look at the output, fix things and try again");
                System.out.println("Your output is located at: " + FileName);
                System.exit(1);

            }

        }
    }
}
