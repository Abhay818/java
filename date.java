import java.util.*;

public class date {
    
    public static void main(String[] args){

        int minutes, days, months, year, hours, RemainingMinutes;
        Scanner scn= new Scanner(System.in);

        System.out.print("Enter the time in minutes: ");
        minutes=scn.nextInt();

        year= minutes/525600;
        RemainingMinutes= minutes%525600;
        months= RemainingMinutes/43800;
        RemainingMinutes= RemainingMinutes%43800; 
        days= RemainingMinutes/1440;
        RemainingMinutes= minutes%1440;
        hours= RemainingMinutes/60;
        RemainingMinutes= RemainingMinutes%60;
    


        System.out.println(year + "-" + months + "-" + days + ":" + hours + ":" + RemainingMinutes);
        scn.close();

    }
}


