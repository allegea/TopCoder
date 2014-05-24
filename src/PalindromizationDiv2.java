import java.util.*;

public class PalindromizationDiv2 {
    public int getMinimumCost(int X) {
        int res;
        int arriba = X;
        int abajo = X;
        if(palindromo(X)) res = 0;
        else
        {
            while(abajo-->0)
            {
                if(palindromo(abajo))break;
            }
            while(true)
            {
                arriba++;
                if(palindromo(arriba))break;
            }

            res=Math.min(X-abajo, arriba-X);
        }

        return res;
    }

    public boolean palindromo(int y)
    {
        String start = String.valueOf(y);
        String end = "";
        for(int i=0;i<start.length();i++)
            end=start.charAt(i)+end;

        if(start.equals(end))
            return true;
        else return false;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(PalindromizationDiv2.class, "test.*");
    }

	public void test0() {
		RETester.eq(getMinimumCost(25), 3);
	}

	public void test1() {
		RETester.eq(getMinimumCost(12321), 0);
	}

	public void test2() {
		RETester.eq(getMinimumCost(40), 4);
	}

	public void test3() {
		RETester.eq(getMinimumCost(2011), 9);
	}

	public void test4() {
		RETester.eq(getMinimumCost(0), 0);
	}

// END CUT HERE
}
