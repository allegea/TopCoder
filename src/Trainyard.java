import java.util.*;

public class Trainyard {
    public int reachableSquares(String[] layout, int fuel) {
        int res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(Trainyard.class, "test.*");
    }

	public void test0() {
		RETester.eq(reachableSquares(new String[] {
			".-....",
			"-S---.",
			"......"},
			2), 4);
	}

	public void test1() {
		RETester.eq(reachableSquares(new String[] {
			"..+-+.",
			"..|.|.",
			"S-+-+."},
			10), 10);
	}

	public void test2() {
		RETester.eq(reachableSquares(new String[] {
			"-....-",
			"|....+",
			"+-S++|",
			"|.|..|",
			"..+-++"},
			8), 15);
	}

	public void test3() {
		RETester.eq(reachableSquares(new String[] {
			".|...",
			"-+S+|",
			".|..."},
			5), 6);
	}

// END CUT HERE
}
