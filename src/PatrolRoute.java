import java.util.*;

public class PatrolRoute {
    public int countRoutes(int X, int Y, int minT, int maxT) {
        int res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(PatrolRoute.class, "test.*");
    }

	public void test0() {
		RETester.eq(countRoutes(3, 3, 1, 20000), 6);
	}

	public void test1() {
		RETester.eq(countRoutes(3, 3, 4, 7), 0);
	}

	public void test2() {
		RETester.eq(countRoutes(4, 6, 9, 12), 264);
	}

	public void test3() {
		RETester.eq(countRoutes(7, 5, 13, 18), 1212);
	}

	public void test4() {
		RETester.eq(countRoutes(4000, 4000, 4000, 14000), 859690013);
	}

// END CUT HERE
}
