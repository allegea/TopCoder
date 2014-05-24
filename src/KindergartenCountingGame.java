
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
 *import java.util.*;

public class Kindergarten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            int cnt = 0;
            int i = 0;
            while (i < line.length()) {
                if (Character.isLetter(line.charAt(i))) {
                    ++cnt;
                    while (Character.isLetter(line.charAt(i))) ++i;
                }
                ++i;
            }
            System.out.println(cnt);
        }
    }
}

 */
public class KindergartenCountingGame {
     public static void main(String[] args) throws FileNotFoundException {
try{
         Scanner in = new Scanner(System.in);
        while(in.hasNextLine())
        {
            String n[]= in.nextLine().split(" ");
            int cantidad = 0;
            for(int i=0;i<n.length;i++)
            {
                for(int j=0;j<n[i].length();j++)
                {
                    while(Character.isLetter(n[i].charAt(0)))
                    cantidad++;
                }
                
            }
            System.out.println(cantidad);
        }
        }
      catch(Exception e) {
System.exit(0);
}
     }
}
