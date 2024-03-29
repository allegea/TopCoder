import java.util.*;
//SRM 530 Div II 500
public class GogoXCake {
    public String solve(String[] cake, String[] cutter) {
        String res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(GogoXCake.class, "test.*");
    }

	public void test0() {
		RETester.eq(solve(new String[] {
			"X.X"
			,"..."
			,"..."
			,"X.X"},
			new String[] {
			".X"
			,".."
			,"X."}),
			"YES");
	}

	public void test1() {
		RETester.eq(solve(new String[] {
			"..XX"
			,"...X"
			,"X..."
			,"XX.."},
			new String[] {
			".."
			,".."}),
			"NO");
	}

	public void test2() {
		RETester.eq(solve(new String[] {"...X..."}, new String[] {"..."}), "YES");
	}

	public void test3() {
		RETester.eq(solve(new String[] {
			".X."
			,"X.X"
			,".X."},
			new String[] {"."}), "YES");
	}

	public void test4() {
		RETester.eq(solve(new String[] {
			"XXXXXXX"
			,"X.....X"
			,"X.....X"
			,"X.....X"
			,"XXXXXXX"},
			new String[] {
			".X."
			,"XXX"
			,".X."}),
			"NO");
	}

	public void test5() {
		RETester.eq(solve(new String[] {
			".."
			,"X."
			,".X"},
			new String[] {
			".."
			,".X"
			,"X."}),
			"NO");
	}

	public void test6() {
		RETester.eq(solve(new String[] {
			"X.."
			,".XX"
			,".XX"},
			new String[] {
			".XX"
			,".XX"
			,"X.."}),
			"NO");
	}

// END CUT HERE
}
