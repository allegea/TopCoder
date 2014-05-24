import java.util.*;

public class RandomSort {
    public double getExpected(int[] permutation) {
        double res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(RandomSort.class, "test.*");
    }

	public void test0() {
		RETester.eq(getExpected(new int[] {1,3,2}), 1.0);
	}

	public void test1() {
		RETester.eq(getExpected(new int[] {4,3,2,1}), 4.066666666666666);
	}

	public void test2() {
		RETester.eq(getExpected(new int[] {1}), 0.0);
	}

	public void test3() {
		RETester.eq(getExpected(new int[] {2,5,1,6,3,4}), 5.666666666666666);
	}

// END CUT HERE
}
