import java.util.*;
class AgeCalculator
{
    // Function to check leap year
    static boolean isLeap(int year)
    {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    
    // Function to return days in a month
    static int daysInMonth(int month, int year)
    {
        if(month == 1 || month == 3 || month == 5 || month == 7 ||
           month == 8 || month == 10 || month == 12)
            return 31;
        
        if(month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        
        if(month == 2)
            return isLeap(year) ? 29 : 28;
        
        return 0; // not needed but safe
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Date of Birth (dd mm yyyy): ");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        System.out.print("Enter Current Date (dd mm yyyy): ");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int years = y2 - y1;
        int months = m2 - m1;
        int days = d2 - d1;
        
        // Borrow days if needed
        if(days < 0)
        {
            months -= 1;
            
            // borrow days from previous month of current date
            int prevMonth = (m2 - 1 == 0) ? 12 : m2 - 1;
            int prevYear = (prevMonth == 12) ? y2 - 1 : y2;
            
            days += daysInMonth(prevMonth, prevYear);
        }
        
        // Borrow months if needed
        if(months < 0)
        {
            years -= 1;
            months += 12;
        }
        
        System.out.println("Age = " + years + " years " + months + 
                           " months " + days + " days");
    }
}
