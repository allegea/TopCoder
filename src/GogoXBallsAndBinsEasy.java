import java.util.*;
//SMR 530 Div2 250
public class GogoXBallsAndBinsEasy {
    public int solve(int[] T) {
        int res=0;
        int n=T.length;
        for(int i=0;i<T.length;i++)
        res+=Math.abs(T[i]-T[n-i-1]);
        
        return res/2;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(GogoXBallsAndBinsEasy.class, "test.*");
    }

	public void test0() {
		RETester.eq(solve(new int[] {0, 2, 5}), 5);
	}

	public void test1() {
		RETester.eq(solve(new int[] {5, 6, 7, 8}), 4);
	}

	public void test2() {
		RETester.eq(solve(new int[] {0, 1, 2, 10}), 11);
	}

	public void test3() {
		RETester.eq(solve(new int[] {1, 2, 3, 4, 5, 6, 7, 8}), 16);
	}

// END CUT HERE
}
