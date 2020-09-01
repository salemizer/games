package com.demoproject.games;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author  Ahmed Salem
 */

public class Utils {

    public static String convertEpochToReadableStr(String epoch){

        Date date = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String readableStr = "";

        if(null != epoch && epoch.length() > 0){
                long l = Long.parseLong(epoch);
                date = new Date(l * 1000);
                readableStr = dateFormat.format(date);
        }
        return readableStr;
    }
}
