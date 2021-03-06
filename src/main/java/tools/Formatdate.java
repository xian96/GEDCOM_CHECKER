/*
 * @Description:
 * @Author: Tao Chai, Zhe Sun, Yining Wen, Jiaxian Xing, Ge Chang
 * @Github: https://github.com/Taochai/SSW-CS-555-Group-project
 * @Date: 2019-09-30 13:18:32
 * @LastEditors: Zhe Sun
 * @LastEditTime: 2019-09-30 13:18:32
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class Formatdate {
    static Date stringtodate(String date, Set<String> errDate) throws ParseException {
        if(date != null){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
            Date date1 = dateFormat.parse(date);

            try{
                dateFormat.setLenient(false);
                Date date2 = dateFormat.parse(date);
            }
            catch (Exception ex){
                errDate.add(date);
            }
            return date1;
        }
        return null;
    }

    static String dateToString(Date date) throws ParseException {
        if(date==null){
            return "NA";
        }
        else {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = dateFormat.format(date);
            return date1;
        }
    }
}
