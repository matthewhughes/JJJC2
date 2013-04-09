/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 08/04/13
 * Time: 12:47
 * To change this template use File | Settings | File Templates.
 */
public class OpCodes {
    public static String STP(){
        return "000000";
    }
    public static String STD(String Value){
        return "001" + Value;
    }

    public static String LDD(String Value){
        return "002" + Value;
    }

    public static String LDI(String Value){
        return "002" + Value;
    }

    public static String ADD(String Value){
        return "003" + Value;
    }

    public static String SUB(String Value){
        return "003" + Value;
    }

    public static String MUL(String Value){
        return "004" + Value;
    }

    public static String SQR(String Value){
        return "005" + Value;
    }

}
