import java.util.*;
//SRM 432 DIV 2 500
public class LampsGrid {fds
    public int mostLit(String[] initial, int K) {
        int res=0;
        for(int i=0;i<initial.length;i++){
            int count = 0;
            for(int j=0;j<initial[i].length();j++)
                if(initial[i].charAt(j)=='0')
                    count++;
            
            if(count%2==K%2 && count<=K){
                int same = 0;
                for(int j=0;j<initial.length;j++){
                    if(initial[j]==initial[i])same++;
                }
                res = Math.max(res,same);
                
            }
        }
        return res;
        
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(LampsGrid.class, "test.*");
    }

	public void test0() {
		RETester.eq(mostLit(new String[] {
			"01",
			"10",
			"10"},
			1), 2);
	}

	public void test1() {
		RETester.eq(mostLit(new String[] {"101010"}, 2), 0);
	}

	public void test2() {
		RETester.eq(mostLit(new String[] {"00", "11"}, 999), 0);
	}

	public void test3() {
		RETester.eq(mostLit(new String[] {
			"0", "1", "0", "1", "0"}
			,
			1000), 2);
	}

	public void test4() {
		RETester.eq(mostLit(new String[] {"001", "101", "001", "000", "111", "001", "101", "111", "110", "000", "111", "010", "110", "001"}, 6), 4);
	}

	public void test5() {
		RETester.eq(mostLit(new String[] {"01", "10", "01", "01", "10"}, 1), 3);
	}

// END CUT HERE
}
