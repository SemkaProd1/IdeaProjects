import java.util.Calendar;

public class MyCalendar {

    public static void main(String args[]){
        Calendar calendarObject  = Calendar.getInstance();
        int hour = calendarObject.getTime().getHours();
        System.out.println("Now is "+ hour);
        if (hour < 18) {
            System.out.println("good day");}
        else {
            System.out.println("Good evening");
        }

    }
}

