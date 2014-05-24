
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
public class BafanaBafana {
     public static void main(String[] args) throws FileNotFoundException 
     {
             
             int player, n, k, start;
            Scanner in = new Scanner(new File("in.txt"));
            int cantidad = in.nextInt();
            for(int i=0; i<cantidad; i++)
            {
                n = in.nextInt();
                start = in.nextInt();
                k = in.nextInt();

                player = (k+start)%n;

                if(player == 0)
                    player = n;
                System.out.println("Case "+(i+1)+": "+player);
            }
        }

}
