import java.util.*;

public class EllysTSP {
    public int getMax(String places) {
        int res;
        int C=0;
        int V=0;
        for(int i=0;i<places.length();i++)
            if(places.charAt(i)=='C')C++;
            else V++;
        res=Math.min(V, C)*2+1;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(EllysTSP.class, "test.*");
    }

	public void test0() {
		RETester.eq(getMax("CVVVC"), 5);
	}

	public void test1() {
		RETester.eq(getMax("VVV"), 1);
	}

	public void test2() {
		RETester.eq(getMax("VVVVCVV"), 3);
	}

	public void test3() {
		RETester.eq(getMax("CVCVCVC"), 7);
	}

	public void test4() {
		RETester.eq(getMax("V"), 1);
	}

// END CUT HERE
}
