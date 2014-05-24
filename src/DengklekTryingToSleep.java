import java.util.*;
//SRM 532 Div II 250
public class DengklekTryingToSleep {
    public int minDucks(int[] ducks) {
        int res;
        Arrays.sort(ducks);
        int n= ducks.length;
        res = ((ducks[n-1]-ducks[0])-n+1);
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(DengklekTryingToSleep.class, "test.*");
    }

	public void test0() {
		RETester.eq(minDucks(new int[] {1, 3, 2}), 0);
	}

	public void test1() {
		RETester.eq(minDucks(new int[] {58}), 0);
	}

	public void test2() {
		RETester.eq(minDucks(new int[] {9, 3, 6, 4}), 3);
	}

	public void test3() {
		RETester.eq(minDucks(new int[] {7, 4, 77, 47, 74, 44}), 68);
	}

	public void test4() {
		RETester.eq(minDucks(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), 0);
	}

// END CUT HERE
}
