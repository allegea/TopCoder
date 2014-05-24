import java.util.*;

public class MagicalGirl {
    public double maxExpectation(int M, int[] day, int[] win, int[] gain) {
        double res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(MagicalGirl.class, "test.*");
    }

	public void test0() {
		RETester.eq(maxExpectation(2, new int[] {1}, new int[] {75}, new int[] {1}), 2.5);
	}

	public void test1() {
		RETester.eq(maxExpectation(10, new int[] {5,5,5,5}, new int[] {100,100,100,100}, new int[] {1,1,1,1}), 14.0);
	}

	public void test2() {
		RETester.eq(maxExpectation(10, new int[] {5,5,5,5,5}, new int[] {40,80,60,20,0}, new int[] {10,10,10,10,10}), 13.0);
	}

	public void test3() {
		RETester.eq(maxExpectation(2, new int[] {2}, new int[] {100}, new int[] {2}), 2.0);
	}

	public void test4() {
		RETester.eq(maxExpectation(20, new int[] {2,13,8,7,9,4,6,21}, new int[] {18,83,75,23,45,23,10,98}, new int[] {10,9,8,10,7,16,13,20}), 35.908);
	}

	public void test5() {
		RETester.eq(maxExpectation(11, new int[] {10,20,30,40,50,60,70,80,90}, new int[] {100,100,100,100,100,100,100,100,100}, new int[] {10,10,10,10,10,10,10,10,10}), 101.0);
	}

	public void test6() {
		RETester.eq(maxExpectation(100000, new int[] {1000000}, new int[] {100}, new int[] {100000}), 100000.0);
	}

// END CUT HERE
}
