import java.util.*;
class datefromdaynumber
{
    static boolean isLeap (int y)
    {
        return (y % 400==0) || (y % 4==0 && y% 100 != 0);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println(" Enter daynumber (between 1 and 366):");
        int daynumber=sc.nextInt();
        
        System.out.println(" Enter year (yyyy): ");
        int year=sc.nextInt();
        
        System.out.println(" Enter days after (n): ");
        int n=sc.nextInt();
        
        int daysInMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        String months[]= {"January", "February", "March", "April","May","June","July","August","September","October","November","December"};
        
        if(isLeap(year))
        {
            daysInMonth[1]=29;
        }
        
        int month=0;
        
        while(daynumber>daysInMonth[month])
        {
            daynumber= daynumber-daysInMonth[month];
            month++;
        }
         
        int day=daynumber; //remaining days
        System.out.println("ENTERED DATE:" + months[month] + ""+ day + ","+ year ); //current date
        
        day=day+n;
        while(day>daysInMonth[month])
        {
            day= day-daysInMonth[month];
            month++;
            
            if(month==12)
            {
                month=0;
                year++;
                daysInMonth[1]=isLeap(year)?29:28;
            }
        }
        
        System.out.println("\n" + n + "" + "DAYS LATER: " + months[month] +""+ day +","+ +year+ "");
    }
}
