import java.util.*;

public class TheNumbersWithLuckyLastDigit {
    public long find(long n) {
        long res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(TheNumbersWithLuckyLastDigit.class, "test.*");
    }

	public void test0() {
		RETester.eq(find(99), 4);
	}

	public void test1() {
		RETester.eq(find(11), 2);
	}

	public void test2() {
		RETester.eq(find(13), -1);
	}

	public void test3() {
		RETester.eq(find(1234567), 1);
	}

// END CUT HERE
}
