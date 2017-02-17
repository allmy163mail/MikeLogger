package com.mike;

/**
 * Created by mike on 17-2-16.
 */

import java.util.logging.*;

public class MikeLogger{
    protected static Logger mikeLogger = null;
    public void MikeLogger(String logFilename){
        if (mikeLogger == null){
            mikeLogger = Logger.getLogger("mikeLogger");
        }
        try {
            Handler handler = new FileHandler(logFilename,true);
//            XMLFormatter fm = new XMLFormatter();
            SimpleFormatter fm = new SimpleFormatter();
//            Formatter fm = new Formatter() {
//                @Override
//                public String format(LogRecord record) {
//                    return record.getMessage() + "\r\n";
//                }
//            };
            handler.setFormatter(fm);
            if(mikeLogger.getHandlers().length == 0){
                mikeLogger.addHandler(handler);
            } else {
                for (Handler h : mikeLogger.getHandlers()) {
                    mikeLogger.removeHandler(h);
                }
//                Handler bufHandeler = mikeLogger.getHandlers()[0];

//                mikeLogger.getHandlers()[0].flush();
//                mikeLogger.getHandlers()[0].close();
//                mikeLogger.getHandlers()[0] = null;
                mikeLogger.addHandler(handler);
            }


        } catch (Exception ex){
            System.err.println(ex.toString());
        }
    }
    public static void main(){
    }
}
