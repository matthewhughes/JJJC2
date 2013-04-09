import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    Welcome welcome = new Welcome();
    welcome.Welcome();
    welcome.CheckArguments(args);
    OpenJSON OJ = new OpenJSON(); // Simpson
    String Directory = OJ.GetDirectory();
    String FileContents = OJ.OpenFileAndConvertToString(Directory, args[0]);
    ProcessFile PF = new ProcessFile(); // Chang
    FileContents = PF.TrimLeftCurly(FileContents);
    FileContents = PF.TrimRightCurly(FileContents);
    FileContents = PF.TrimTabs(FileContents);
    FileContents = PF.TrimSpeechMarks(FileContents);
    System.out.println(FileContents);
    ProcessOutput PO = new ProcessOutput();
    PO.CheckFileExists(args[1]);
    PO.CreateOutputFile(args[1]);
    Iterate Iteration = new Iterate();
    List<String> CommaSeparated = Iteration.SplitOnComma(FileContents);
    Iteration.IterateThroughList(CommaSeparated, Directory + File.separator + args[1] + ".JJJ");
    }
}
