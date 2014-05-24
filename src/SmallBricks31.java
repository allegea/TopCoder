import java.util.*;

public class SmallBricks31 {
    public int countWays(int w, int h) {
        int res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(SmallBricks31.class, "test.*");
    }

	public void test0() {
		RETester.eq(countWays(1, 3), 4);
	}

	public void test1() {
		RETester.eq(countWays(3, 1), 13);
	}

	public void test2() {
		RETester.eq(countWays(3, 2), 84);
	}

	public void test3() {
		RETester.eq(countWays(4, 9), 132976888);
	}

	public void test4() {
		RETester.eq(countWays(5, 5), 11676046);
	}

// END CUT HERE
}
