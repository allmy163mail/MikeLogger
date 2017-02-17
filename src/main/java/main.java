import com.mike.*;
import java.util.logging.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class main{
    public static void main(String[] args){

        Logger log = Logger.getLogger("test.logger.mylogger");
        System.out.println(log.getName());
        Logger parent = log.getParent();
        System.out.println("1st getParent: " + parent.getName());

        Logger.getLogger("test.logger");
        parent = log.getParent();
        System.out.println("2nd getParent: " + parent.getName());

        parent = parent.getParent();
        System.out.println("3rd getParent: " + parent.getName());


        SimpleDateFormat df = new SimpleDateFormat("[yyyy-MM-dd hh:mm:ss]");
        String time = df.format(new Date());
        pdfLogger logPdf = new pdfLogger("pdf.log");
        logPdf.logRename("pdf" + time);
        wordLogger logWord = new wordLogger("word.log");
        logWord.logRename("word" + time);
    }
}