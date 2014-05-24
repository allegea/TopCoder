import java.util.*;

public class TeamSplit {
    public int difference(int[] strengths) {
        int res, first, second;
        first = 0;
        second = 0;
        Arrays.sort(strengths);
        
        for(int i=0;i<strengths.length;i++){
            if(i%2==0)first+=strengths[i];
            else second+=strengths[i];
        }
        
        
        return Math.abs(second-first);
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(TeamSplit.class, "test.*");
    }

	public void test0() {
		RETester.eq(difference(new int[] {5,7,8,4,2}), 4);
	}

	public void test1() {
		RETester.eq(difference(new int[] {100}), 100);
	}

	public void test2() {
		RETester.eq(difference(new int[] {1000,1000}), 0);
	}

	public void test3() {
		RETester.eq(difference(new int[] {9,8,7,6}), 2);
	}

	public void test4() {
		RETester.eq(difference(new int[] {1,5,10,1,5,10}), 0);
	}

	public void test5() {
		RETester.eq(difference(new int[] {
			824, 581,   9, 776, 149, 493, 531, 558, 995, 637,
			394, 526, 986, 548, 344, 509, 319,  37, 790, 491,
			479,  34, 776, 321, 258, 851, 711, 365, 763, 355,
			386, 877, 596,  96, 151, 166, 558, 109, 874, 959,
			845, 181, 976, 335, 930,  22,  78, 120, 907, 584}),
			478);
	}

// END CUT HERE
}
