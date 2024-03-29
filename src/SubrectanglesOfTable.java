import java.util.*;
//SRM 429 DIV1
public class SubrectanglesOfTable {
    public long[] getQuantity(String[] table) {
        long[] res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(SubrectanglesOfTable.class, "test.*");
    }

	public void test0() {
		RETester.eq(getQuantity(new String[] {"OK"}), new long[] {0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 40L, 0L, 0L, 0L, 40L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L });
	}

	public void test1() {
		RETester.eq(getQuantity(new String[] {"GOOD", "LUCK"}), new long[] {0L, 0L, 320L, 280L, 0L, 0L, 280L, 0L, 0L, 0L, 280L, 280L, 0L, 0L, 640L, 0L, 0L, 0L, 0L, 0L, 320L, 0L, 0L, 0L, 0L, 0L });
	}

	public void test2() {
		RETester.eq(getQuantity(new String[] {
			"TANYA",
			"HAPPY",
			"BIRTH",
			"DAYYY"}),
			new long[] {5168L, 1280L, 0L, 1120L, 0L, 0L, 0L, 2560L, 1472L, 0L, 0L, 0L, 0L, 1344L, 0L, 3008L, 0L, 1536L, 0L, 2592L, 0L, 0L, 0L, 0L, 6320L, 0L });
	}

// END CUT HERE
}
