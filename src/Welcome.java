/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 02/04/13
 * Time: 16:50
 * To change this template use File | Settings | File Templates.
 */
public class Welcome {
    public static void Welcome(){
        System.out.println("Hello and welcome to the Java!Java!JSON Compiler");
        System.out.println("Correct usage is JJJC <Filename> <Outputname>");
    }

    public static void CheckArguments(String[] args){
        if(args.length == 0){
            System.out.println("No arguments provided.");
            System.out.println("Correct usage is JJJC <Filename> <Outputname>");
            System.exit(1);
        }
        if(args.length == 1){
            System.out.println("Too few arguments.");
            System.out.println("Correct usage is JJJC <Filename> <Outputname>");
            System.exit(1);
        }
        if(args.length > 2){
            System.out.println("Too many arguments");
            System.out.println("Correct usage is JJJC <Filename> <Outputname>");
            System.exit(1);
        }
    }
}
