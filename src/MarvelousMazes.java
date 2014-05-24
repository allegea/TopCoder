
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allegeaimport java.util.*;

public class MarvelousMaze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String maze = in.nextLine();
            if (maze.isEmpty()) {
                System.out.println();
                continue;
            }

            int cnt = 0;
            for (int i = 0; i < maze.length(); ++i) {
                char c = maze.charAt(i);
                if (Character.isDigit(c)) cnt += c - '0';
                if (c == 'b') c = ' ';
                if(Character.isLetter(c) || c == ' ' || c == '*') {
                    for (int j = 0; j < cnt; ++j)
                        System.out.print(c);
                    cnt = 0;
                }
                if (c == '!') System.out.println();
            }
            System.out.println();
        }
    }
}

 */
public class MarvelousMazes {

    public static void main(String[] args) throws  FileNotFoundException {



        Scanner in = new Scanner(new File("in.txt"));
        int dato =0;
        while(in.hasNextLine())
        {
            String line= in.nextLine();
            //System.out.println(line);
            while(line.length()==0)
            {
                System.out.println();
                line = in.nextLine();
            }
            
            for(int i=0;i<line.length();i++)
            {
                dato = 0;
                while(Character.isDigit(line.charAt(i)))
                {
                    dato+= ((line.charAt(i)) - 48);
                    //System.out.println(dato);
                    i++;
                }
                //System.out.println(line.substring(i,i+1));

                if(line.substring(i,i+1).equals("b"))
                        for(int j = 0;j<dato;j++)
                            System.out.print(" ");
                    else if(Character.isLetter(line.charAt(i)))
                        for(int j = 0;j<dato;j++)
                            System.out.print(line.charAt(i));
                    
                                         
                    if(line.substring(i,i+1).equals("*"))
                        for(int j = 0;j<dato;j++)
                            System.out.print("*");


                   if(line.substring(i,i+1).equals("!"))
                    System.out.println("");
            }
            System.out.println("");

        }
        }

}
