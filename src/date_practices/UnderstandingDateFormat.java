package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {

    public static void main(String[] args) {

        Date currentDate = new Date();

        System.out.println(currentDate); // Sat Apr 30 10:15:19 CDT 2022

        // MM/dd/yyyy  04.30.2022

        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");
        System.out.println("Today is = " + sdf.format(currentDate));


        // Print date in the format of Sat 10:27 AM
        sdf = new SimpleDateFormat("E hh:mm a");
        System.out.println(sdf.format(currentDate));

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate)); // Saturday
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate)); // 2022
        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(currentDate)); //
    }
}
