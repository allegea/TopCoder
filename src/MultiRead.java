import java.util.*;

public class MultiRead {
    public int minCycles(String trace, int procs) {
        int res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(MultiRead.class, "test.*");
    }

	public void test0() {
		RETester.eq(minCycles("RWWRRR", 3), 4);
	}

	public void test1() {
		RETester.eq(minCycles("RWWRRRR", 3), 5);
	}

	public void test2() {
		RETester.eq(minCycles("WWWWW", 5), 5);
	}

	public void test3() {
		RETester.eq(minCycles("RRRRRRRRRR", 4), 3);
	}

	public void test4() {
		RETester.eq(minCycles("RWRRWWRWRWRRRWWRRRRWRRWRRWRRRRRRRRRWRWRWRRRRWRRRRR", 4), 30);
	}

// END CUT HERE
}
