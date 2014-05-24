import java.util.*;

public class GirlsAndBoys {
    public int sortThem(String row) {
        int res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(GirlsAndBoys.class, "test.*");
    }

	public void test0() {
		RETester.eq(sortThem("GGBBG"), 2);
	}

	public void test1() {
		RETester.eq(sortThem("BBBBGGGG"), 0);
	}

	public void test2() {
		RETester.eq(sortThem("BGBGBGBGGGBBGBGBGG"), 33);
	}

	public void test3() {
		RETester.eq(sortThem("B"), 0);
	}

// END CUT HERE
}
