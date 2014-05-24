import java.util.*;

//SRM 438 DIV 1
public class UnluckyIntervals {
    public int[] getLuckiest(int[] luckySet, int n) {
        int[] res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(UnluckyIntervals.class, "test.*");
    }

	public void test0() {
		RETester.eq(getLuckiest(new int[] {3}, 6), new int[] {3, 1, 2, 4, 5, 6 });
	}

	public void test1() {
		RETester.eq(getLuckiest(new int[] {5, 11, 18}, 9), new int[] {5, 11, 18, 1, 4, 6, 10, 2, 3 });
	}

	public void test2() {
		RETester.eq(getLuckiest(new int[] {7, 13, 18}, 9), new int[] {7, 13, 18, 14, 17, 8, 12, 1, 6 });
	}

	public void test3() {
		RETester.eq(getLuckiest(new int[] {1000, 1004, 4000, 4003, 5000}, 19), new int[] {1000, 1004, 4000, 4003, 5000, 4001, 4002, 1001, 1003, 1002, 4004, 4999, 1, 999, 4005, 4998, 2, 998, 4006 });
	}

	public void test4() {
		RETester.eq(getLuckiest(new int[] {1000000000}, 8), new int[] {1000000000, 1, 999999999, 2, 999999998, 3, 999999997, 4 });
	}

// END CUT HERE
}
