import java.util.*;

public class NetworkXOneTimePad {
    public int crack(String[] plaintexts, String[] ciphertexts) {

        HashSet<Long> keys = new HashSet<Long>();
        HashSet<Long> ori = new HashSet<Long>();
        HashSet<Long> des = new HashSet<Long>();
        
        for(int i=0;i<plaintexts.length;i++)
            ori.add(Long.parseLong(plaintexts[i], 2));

        
        for(int i=0;i<ciphertexts.length;i++)
            des.add(Long.parseLong(ciphertexts[i], 2));

        
        for (Long x : ori) {
            for (Long y : des) {
                long xor = x ^ y;

                boolean in = true;
                for (Long z : des) {
                    if (!ori.contains(z ^ xor)) {
                        in = false;
                        break;
                    }
                }

                if (in) {
                    keys.add(xor);
                    // System.out.println(xor);
                }

            }
        }
      // System.out.println(keys.size());
        return keys.size();
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(NetworkXOneTimePad.class, "test.*");
    }

	public void test0() {
		RETester.eq(crack(new String[] {"110", "001"}, new String[] {"101", "010"}), 2);
	}

	public void test1() {
		RETester.eq(crack(new String[] {"00", "01", "10", "11"}, new String[] {"00", "01", "10", "11"}), 4);
	}

	public void test2() {
		RETester.eq(crack(new String[] {"01", "10"}, new String[] {"00"}), 2);
	}

	public void test3() {
		RETester.eq(crack(new String[] {"000", "111", "010", "101", "110", "001"}, new String[] {"011", "100"}), 6);
	}

// END CUT HERE
}
