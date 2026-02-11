import java.util.*;
class PrimeAdam
{ 
    public static boolean isPrime(int num)
    {
        int c=0;
        
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        
        if(c==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean isAdam(int num)
    {
        int rev=0;
        int org=num; 
        
        while(num>0)
        {
            int r= num%10;
            num=num/10;
            rev= rev*10 + r;
        }
        
        int org_sq= org*org;
        int rev_sq= rev*rev; //961
        
        int revv=0;
        while(rev_sq>0)
        {
            int r= rev_sq%10;
            rev_sq= rev_sq/10;
            revv=revv*10+r;
        }
        
        if(org_sq == revv)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of m and n ");
        System.out.println(" m=");
        int m= sc.nextInt();
        System.out.println(" n=");
        int n= sc.nextInt();
        
        if(m>0 && n>0 && m<n)
        {
            int freq=0;
            
            System.out.println(" PRIME ADAM INTEGERS BETWEEN " + m + "and" + n + "are : " );
            for(int i=m; i<=n; i++)
            {
                if(isPrime(i) && isAdam(i))
                {
                    freq++;
                    System.out.print( i + ",");
                }
            }
            System.out.println(" FREQUENCY : " + freq );
        }
        else
        {
            System.out.println(" INVALID INPUT");
        
        }
    }
}
