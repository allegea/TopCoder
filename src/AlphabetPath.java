import java.util.*;

public class AlphabetPath {
    public String doesItExist(String[] letterMaze) {
        String res = "YES";
        
        char[][] path = new char[letterMaze.length][letterMaze[0].length()];
        
        for(int i=0;i<letterMaze.length;i++)
            path[i] = letterMaze[i].toCharArray();
        
        int cantiRows = letterMaze.length;
        int cantiCol = letterMaze[0].length();
        char letter = 'A';
        int recorrido = 0;
        int row = -1;
        int col = -1;
        boolean find = false;
        //System.out.println((++letter));
        for(int i=0;i<letterMaze.length && !find;i++){
            for(int j=0;j<letterMaze[0].length();j++)
                if(path[i][j]==letter){
                    row=i;
                    col=j;
                    find = true;
                    break;
                }
        }
        
        if(find){
             
            letter++;
            recorrido++;
            
            while(recorrido<26){
            //System.out.println(recorrido+" - "+letter+"  - "+row+" - "+col);
                boolean cambio = false;
                
                if(row-1>=0){
                    if(path[row-1][col]==letter)
                    {
                        recorrido++;
                        letter++;
                        row--;
                        cambio=true;
                        continue;
                    }
                }
                
                if(row+1<cantiRows){
                    if(path[row+1][col]==letter)
                    {
                        recorrido++;
                        letter++;
                        row++;
                        cambio=true;
                        continue;
                    }
                }
               if(col-1>=0){
                    if(path[row][col-1]==letter)
                    {
                        recorrido++;
                        letter++;
                        col--;
                        cambio=true;
                        continue;
                    }
                }
               if(col+1<cantiCol){
                    if(path[row][col+1]==letter)
                    {
                        recorrido++;
                        letter++;
                        col++;
                        cambio=true;
                        continue;
                    }
                }
                if(cambio==false){
                    res="NO";
                    //System.out.println(" NO "+recorrido+" - "+letter+"  - "+row+" - "+col);
                    break;
                }
                //System.out.println(recorrido+" - "+letter+"  - "+row+" - "+col);
            }
            
            
        }
        else res = "NO";
        
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(AlphabetPath.class, "test.*");
    }

	public void test0() {
		RETester.eq(doesItExist(new String[] {"ABCDEFGHIJKLMNOPQRSTUVWXYZ"}), "YES");
	}

	public void test1() {
		RETester.eq(doesItExist(new String[] {
			"ADEHI..Z",
			"BCFGJK.Y",
			".PONML.X",
			".QRSTUVW"}
			),
			"YES");
	}

	public void test2() {
		RETester.eq(doesItExist(new String[] {"ACBDEFGHIJKLMNOPQRSTUVWXYZ"}), "NO");
	}

	public void test3() {
		RETester.eq(doesItExist(new String[] {
			"ABC.......",
			"...DEFGHIJ",
			"TSRQPONMLK",
			"UVWXYZ...."}),
			"NO");
	}

	public void test4() {
		RETester.eq(doesItExist(new String[] {
			"..............",
			"..............",
			"..............",
			"...DEFGHIJK...",
			"...C......L...",
			"...B......M...",
			"...A......N...",
			"..........O...",
			"..ZY..TSRQP...",
			"...XWVU.......",
			".............."}),
			"YES");
	}

// END CUT HERE
}
