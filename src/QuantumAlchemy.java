import java.util.*;

public class QuantumAlchemy {
    public int minSteps(String initial, String[] reactions) {
        int res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(QuantumAlchemy.class, "test.*");
    }

	public void test0() {
		RETester.eq(minSteps("ABCDE", new String[] {"ABC->F", "FE->X"}), 2);
	}

	public void test1() {
		RETester.eq(minSteps("AABBB", new String[] {"BZ->Y", "ZY->X", "AB->Z"}), 4);
	}

	public void test2() {
		RETester.eq(minSteps("AAABB", new String[] {"BZ->Y", "ZY->X", "AB->Z"}), -1);
	}

	public void test3() {
		RETester.eq(minSteps("AAXB", new String[] {"BZ->Y", "ZY->X", "AB->Z"}), 0);
	}

	public void test4() {
		RETester.eq(minSteps("ABCDEFGHIJKLMNOPQRSTUVWYZABCDEFGHIJKLMNOPQRSTUVWYZ", new String[] {"ABCE->Z", "RTYUIO->P", "QWER->T", "MN->B"}), -1);
	}

// END CUT HERE
}
