import java.util.*;

public class Cryptography {
    public long encrypt(int[] numbers) {
        long res = 1;
        
        Arrays.sort(numbers);
        numbers[0]++;
        
        for(int i=0;i<numbers.length;i++) res*=numbers[i];
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(Cryptography.class, "test.*");
    }

	public void test0() {
		RETester.eq(encrypt(new int[] {1,2,3}), 12L);
	}

	public void test1() {
		RETester.eq(encrypt(new int[] {1,3,2,1,1,3}), 36L);
	}

	public void test2() {
		RETester.eq(encrypt(new int[] {1000,999,998,997,996,995}), 986074810223904000L);
	}

	public void test3() {
		RETester.eq(encrypt(new int[] {1,1,1,1}), 2L);
	}

// END CUT HERE
}
