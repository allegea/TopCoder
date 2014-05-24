import java.util.*;

public class CountExpressions {
    public int calcExpressions(int x, int y, int val) {
        int res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(CountExpressions.class, "test.*");
    }

	public void test0() {
		RETester.eq(calcExpressions(7, 8, 16), 9);
	}

	public void test1() {
		RETester.eq(calcExpressions(3, 5, 7), 5);
	}

	public void test2() {
		RETester.eq(calcExpressions(99, 100, 98010000), 6);
	}

	public void test3() {
		RETester.eq(calcExpressions(-99, 42, -1764), 2);
	}

	public void test4() {
		RETester.eq(calcExpressions(100, -100, -100000000), 0);
	}

	public void test5() {
		RETester.eq(calcExpressions(1, 2, 5), 17);
	}

// END CUT HERE
}
