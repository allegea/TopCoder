import java.util.*;

public class EllysXors {
    public long getXor(long L, long R) {
        long res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(EllysXors.class, "test.*");
    }

	public void test0() {
		RETester.eq(getXor(3L, 10L), 8L);
	}

	public void test1() {
		RETester.eq(getXor(5L, 5L), 5L);
	}

	public void test2() {
		RETester.eq(getXor(13L, 42L), 39L);
	}

	public void test3() {
		RETester.eq(getXor(666L, 1337L), 0L);
	}

	public void test4() {
		RETester.eq(getXor(1234567L, 89101112L), 89998783L);
	}

// END CUT HERE
}
