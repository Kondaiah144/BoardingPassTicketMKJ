import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println("Current date is " + d1);
        //Date d2 = new Date(2323223232L);
        //System.out.println("Date represented is "+ d2 );

        Date d3 = new Date(2022,01, 01);
        System.out.println(d3);

        String sDate1="31/12/1998";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        System.out.println(sDate1+"\t"+date1);

        
    }
}
