package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {
    public static void main(String[] args) {

        SimpleDateFormat formatcomp  = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(2016,05,19);
        Date date = cal.getTime();
        SimpleDateFormat SDFormat  = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(SDFormat.format(date));

        Date dayto = new  Date();

        SimpleDateFormat format2 = new SimpleDateFormat("EEEE dd-MMMM-yyyy HH:mm:ss", Locale.FRANCE);
        System.out.println(format2.format(dayto));
        SimpleDateFormat format3 = new SimpleDateFormat("EEEE dd-MMMM-yyyy HH:mm:ss", Locale.CHINA);
        System.out.println(format3.format(dayto));

        SimpleDateFormat format4 = new SimpleDateFormat("EEEE dd-MMMM-yyyy HH:mm:ss",  new Locale("ru", "RU"));
        System.out.println(format4.format(dayto));







    }
}
