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

    public static void IterateThroughList(List<String> Items){
        String[] ByteCode = null;
        for(String S : Items){
            ByteCode = S.split(":");


            if(ByteCode[0] == "ADD"){

            } else if (ByteCode[0] == "SUB"){

            } else if (ByteCode[0] == "ADD"){

            } else {

        }
    }
}
