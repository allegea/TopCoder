import java.util.*;

public class NetworkXMessageRecovery {
    public String recover(String[] messages) {
        String res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(NetworkXMessageRecovery.class, "test.*");
    }

	public void test0() {
		RETester.eq(recover(new String[] {"acd", "bce"}), "abcde");
	}

	public void test1() {
		RETester.eq(recover(new String[] {"ed", "dc", "cb", "ba"}), "edcba");
	}

	public void test2() {
		RETester.eq(recover(new String[] {"Fox", "Ciel", "FoxCiel"}), "FoxCiel");
	}

	public void test3() {
		RETester.eq(recover(new String[] {"a", "A"}), "Aa");
	}

// END CUT HERE
}
