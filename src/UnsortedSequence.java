import java.util.*;

public class UnsortedSequence {
    public int[] getUnsorted(int[] s) {
        int[] res = new int[0];
        Arrays.sort(s);
        int i=0;
        boolean change = false;
        for(i=s.length-1;i>=0;i--){
            if((i-1)>=0 && s[i]!=s[i-1]){
                int aux = s[i];
                s[i]=s[i-1];
                s[i-1]=aux;
                change = true;
                break;
            }
            
            
        }
        //System.out.println(Arrays.toString(s));
        
        if(change==false)
             return res;
        else return s;
    }

}


// Powered by FileEdit
// Powered by RETester [based on ExampleBuilder]
// Powered by CodeProcessor
