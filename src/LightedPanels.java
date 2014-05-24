import java.util.*;

public class LightedPanels {
    public int minTouch(String[] board) {
        int res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(LightedPanels.class, "test.*");
    }

	public void test0() {
		RETester.eq(minTouch(new String[] {
			"*****",
			"*...*",
			"*...*",
			"*...*",
			"*****"}),
			1);
	}

	public void test1() {
		RETester.eq(minTouch(new String[] {".*"}), -1);
	}

	public void test2() {
		RETester.eq(minTouch(new String[] {
			"**.",
			"**.",
			"..."}),
			2);
	}

	public void test3() {
		RETester.eq(minTouch(new String[] {
			"*...",
			"**..",
			"..**",
			"...*"}),
			10);
	}

// END CUT HERE
}
