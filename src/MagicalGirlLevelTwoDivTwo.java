import java.util.*;

public class MagicalGirlLevelTwoDivTwo {
    public String isReachable(int[] jumpTypes, int x, int y) {
        String res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(MagicalGirlLevelTwoDivTwo.class, "test.*");
    }

	public void test0() {
		RETester.eq(isReachable(new int[] {2}, 5, 4), "YES");
	}

	public void test1() {
		RETester.eq(isReachable(new int[] {3}, 5, 4), "NO");
	}

	public void test2() {
		RETester.eq(isReachable(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, -30, 27), "YES");
	}

	public void test3() {
		RETester.eq(isReachable(new int[] {29}, 29, 0), "NO");
	}

// END CUT HERE
}
