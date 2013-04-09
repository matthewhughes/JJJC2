/**
 * Created with IntelliJ IDEA.
 * User: matthew
 * Date: 02/04/13
 * Time: 17:18
 * To change this template use File | Settings | File Templates.
 */
public class ProcessFile {

    public String TrimTabs(String UnprocessedData){
        return UnprocessedData.trim();
    }
    public String TrimLeftCurly(String UnprocessedData){
        return UnprocessedData.replace("{", "");
    }
    public String TrimRightCurly(String UnprocessedData){
        return UnprocessedData.replace("}", "");
    }
    public String TrimSpeechMarks(String UnprocessedData){
        return UnprocessedData.replace("\"", "");
    }
}
