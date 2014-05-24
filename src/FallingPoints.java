import java.util.*;
//SRM 431 DIV 2 - 500 
public class FallingPoints {
    public double[] getHeights(int[] X, int R) {
        double[] res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(FallingPoints.class, "test.*");
    }

	public void test0() {
		RETester.eq(getHeights(new int[] {0}, 10), new double[] {0.0 });
	}

	public void test1() {
		RETester.eq(getHeights(new int[] {1,100}, 10), new double[] {0.0, 0.0 });
	}

	public void test2() {
		RETester.eq(getHeights(new int[] {0,9}, 10), new double[] {0.0, 4.358898943540674 });
	}

	public void test3() {
		RETester.eq(getHeights(new int[] {0,9,19}, 10), new double[] {0.0, 4.358898943540674, 4.358898943540674 });
	}

// END CUT HERE
}
