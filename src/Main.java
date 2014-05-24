
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
   
// BEGIN CUT HERE
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        //while(in.hasNext())
    String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String res = "";
    int n, b;
    n=13;
    b=2;
    while (n != 0) {
        res = digits.charAt(n % b) + res;
        n /= b;
    }

    System.out.println(res);

        
    }


	
}
