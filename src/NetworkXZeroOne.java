import java.util.*;

public class NetworkXZeroOne {
    public String reconstruct(String message) {
        String res = "";
        char[] car = message.toCharArray();
        int ind=-1;
        int ind2=-1;
        for(int i=0;i<message.length();i++)
            if(car[i]=='x'){
                ind=i;
                break;
                        }
            else if(car[i]=='o'){
                ind2=i;
                break;
            }
        
        boolean xx=true;
        if(ind==-1)
        {
            if(ind2==0)ind=1;
            else ind=ind2-1; 
                }
        if(ind%2!=0)
        {
             xx=false;
        }
            for(int i=0;i<message.length();i++)
                       {if(xx)res+="x";
                     else res+="o";
             xx=!xx;
             }
            return res;

    }

}


// Powered by FileEdit
// Powered by RETester [based on ExampleBuilder]
// Powered by CodeProcessor


// Powered by FileEdit
// Powered by RETester [based on ExampleBuilder]
// Powered by CodeProcessor
