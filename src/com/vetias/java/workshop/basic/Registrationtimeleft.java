package src.com.vetias.java.workshop.basic;
import java.time.LocalTime;
public class Registrationtimeleft {
    public static void main(String[] args){
        LocalTime currentTime = LocalTime.now();
        LocalTime registrationEndTime = LocalTime.of(18,59,59);
        long hoursLeft = registrationEndTime.getHour() - currentTime.getHour();
        long minutesLeft = registrationEndTime.getMinute() - currentTime.getMinute();
        long secondsLeft = registrationEndTime.getSecond() - currentTime.getSecond();
        System.out.println("you have" + hoursLeft+"hours" + minutesLeft + "minutes" + secondsLeft + "seconds");
    }
    
}
