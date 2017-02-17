package com.mike;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mike on 17-2-16.
 */
public class pdfLogger extends MikeLogger {
    public pdfLogger(String filename){
        MikeLogger(filename);
    }

    private String getTime(){
        SimpleDateFormat df = new SimpleDateFormat("[yyyy-MM-dd hh:mm:ss]");
        return df.format(new Date());
    }

    public void logRename(String cotent){
        mikeLogger.info(cotent);
    }
}
