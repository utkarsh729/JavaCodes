import java.time.*;
public class Date_2 {
    public static void main(String[] args) {
        
        // the classes in time package don't have any constructor or default constructor
        // we have to call method 

        LocalDate date=LocalDate.now();
        System.out.println(date);

        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year=date.getYear();

        System.out.println(day + "/" + month + "/" + year);

        System.out.println(LocalTime.now());

        LocalTime time=LocalTime.now();
        
        int hour=time.getHour();
        int min=time.getMinute();
        int sec=time.getSecond();
        int nsec=time.getNano();

        System.out.println(hour+":"+min+":"+sec+":"+nsec);
    }
}
