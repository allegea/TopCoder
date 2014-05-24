
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allegea
 */
public class StringCoding {
     public static void main(String[] args) throws FileNotFoundException 
     {
             
             
            //Scanner in = new Scanner(new File("in.txt"));
            Scanner in = new Scanner(System.in);
            
            while(in.hasNext())
            {
                boolean answer = true;
                String base = in.next();
                String code = in.next();

                for(int j=0;j<base.length();j++)
                {
                    //System.out.println(code);
                    int index = code.indexOf(base.charAt(j));
                    //System.out.println(code+" - "+index+" - "+code.length());
                    if(index==-1){
                        answer = false;
                        break;
                    }
                    else{
                        code = code.substring(index+1, code.length());
                    }
                }
                if(answer)
                System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }

}
