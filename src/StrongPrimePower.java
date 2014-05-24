import java.util.*;
//SRM 400 DIV 1
public class StrongPrimePower {
    ***
    public boolean primo(long x){
        
        if(x==1 || x == 2 ) return true;
        if(x%2==0)return false;
        for(int i=3;i*i<=x;i+=2)
            if(x%i==0)return false;
        
        return true;
    }
    
    /*
    long num = Long.parseLong(n);
        for (int q = 2; q <= 64; ++q) {
     //si tengo n=p^q, entonces Ln(n) = q*Ln(p) -> p = E(Ln(n)/q), entonces como cabe en un long, la q puede ser maximo 64
         double pd = Math.exp(Math.log((double)num) / (double)q);
         int p = (int)Math.round(pd);
        
         if (!primo(p))
         continue;
        
         long pow = 1;
         for (int i = 1; i <= q; ++i)
         pow *= p;
        
         if (pow == num)
         return new int[]{p, q};
        }
        return new int[]{};
    
     * */
     
    public int[] baseAndExponent(String n) {
        int[] res = null;
        long number = Long.parseLong(n);
        long left = 1, right = 1000000000;
        while(left<right)
        {
            long mid = (left+right)/2;
            if( (mid*mid) >= number)
                right = mid;
            else left = mid+1;
            
        }
        
        if(right*right==number && primo(right))
        {
            return new int[]{(int)right,2};
        }
        
        
  boolean first = true;
        long factor = -1;
        long count = 1;
         for(int p=2;p*p<=number && count !=-1 ;p++)
                   {
                       while(number%p==0 && count !=-1)
                       {
                           if(first){
                               factor=p;
                               first=false;
                               
                           }
                           else{
                               if(factor!=p)
                                   count=-1;
                               else
                                   count++;
                           }
           
                           number/=p;
                       }
                   }
         
                 if(number>1)
                   {
                       if(factor!=number)
                                   count=-1;
                               else
                                   count++;
                           
                   }
                  
    if(count!=-1)
    res = new int[]{(int)factor,(int)count};
    else
     res = new int[0];
    //System.out.println(factor+" - "+count);
        return res;
    }

}


// Powered by FileEdit
// Powered by RETester [based on ExampleBuilder]
// Powered by CodeProcessor
