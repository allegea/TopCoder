import java.util.*;

public class EqualTowers {
    public int height(int[] bricks) {
        int res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(EqualTowers.class, "test.*");
    }

	public void test0() {
		RETester.eq(height(new int[] { 2, 3, 5 }), 5);
	}

	public void test1() {
		RETester.eq(height(new int[] { 10, 9, 2 }), -1);
	}

	public void test2() {
		RETester.eq(height(new int[] { 11, 11 }), 11);
	}

	public void test3() {
		RETester.eq(height(new int[] { 14, 3, 20, 15, 15, 14, 24, 23, 15 }), 64);
	}

// END CUT HERE
}
