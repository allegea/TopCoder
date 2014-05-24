import java.lang.String;
import java.util.*;

public class CubeStickers {
    public String isPossible(String[] sticker) {
        String res="";

        ArrayList<String> cantidad = new ArrayList<String>();
        cantidad.add(sticker[0]);
        for(int i=1;i<sticker.length;i++)
        {
            if(!cantidad.contains(sticker[i]))cantidad.add(sticker[i]);
        }



        int many = cantidad.size();
        if(many>=6)res="YES";
        else 
        {
            int[] veces=new int[cantidad.size()];
            Arrays.fill(veces, 0);
            for(int j=0;j<cantidad.size();j++)
            {
                for(int i=0;i<sticker.length;i++)
                {
                    if(cantidad.get(j).equals(sticker[i]))veces[j]++;;
                }
            }
            Arrays.sort(veces);

            
            int suma=0;
            int i;
            for(i=veces.length-1;i>=0;i--)
            {
                if(veces[i]>2)suma+=2;
                else
                suma+=veces[i];
                
                if(suma>=6)break;
            }
            if(suma<6)res="NO";
            else
            res="YES";
            
        }

        return res;
    }


// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(CubeStickers.class, "test.*");
    }

	public void test0() {
		RETester.eq(isPossible(new String[] {"cyan","magenta","yellow","purple","black","white","purple"}), "YES");
	}

	public void test1() {
		RETester.eq(isPossible(new String[] {"blue","blue","blue","blue","blue","blue","blue","blue","blue","blue"}), "NO");
	}

	public void test2() {
		RETester.eq(isPossible(new String[] {"red","yellow","blue","red","yellow","blue","red","yellow","blue"}), "YES");
	}

	public void test3() {
		RETester.eq(isPossible(new String[] {"purple","orange","orange","purple","black","orange","purple"}), "NO");
	}

	public void test4() {
		RETester.eq(isPossible(new String[] {"white","gray","green","blue","yellow","red","target","admin"}), "YES");
	}

// END CUT HERE
}
