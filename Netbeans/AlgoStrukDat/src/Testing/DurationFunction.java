/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Aikacchii
 */
public class DurationFunction {

    public static void main(String[] args) throws ParseException {
        String time1 = "16:00:00";
        String time2 = "19:00:00";

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date1 = format.parse(time1);
        Date date2 = format.parse(time2);
        long difference = date2.getTime() - date1.getTime();
        System.out.println("Diff " + (difference / 6000));

//        //your code
//        Instant end = Instant.now();
//        Duration timeElapsed = Duration.between(start, end);
//        System.out.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");
    }
}
