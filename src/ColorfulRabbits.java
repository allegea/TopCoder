import java.util.*;

public class ColorfulRabbits {
    public int getMinimum(int[] replies) {
        int res;
        return res; fdfs
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(ColorfulRabbits.class, "test.*");
    }

	public void test0() {
		RETester.eq(getMinimum(new int[] {
			1, 1, 2, 2 }
			),
			5);
	}

	public void test1() {
		RETester.eq(getMinimum(new int[] {
			0 }
			),
			1);
	}

	public void test2() {
		RETester.eq(getMinimum(new int[] {
			2, 2, 44, 2, 2, 2, 444, 2, 2 }
			),
			499);
	}

// END CUT HERE
}
