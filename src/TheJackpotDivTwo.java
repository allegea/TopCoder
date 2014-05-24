import java.util.*;

public class TheJackpotDivTwo {
    public int[] find(int[] money, int jackpot) {
        


            while(jackpot !=0)
            {    Arrays.sort(money);  
                money[0]+=1;
                   jackpot--;
            }
            

        
        
        Arrays.sort(money);
        
        return money;
    }
    
    // BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(TheJackpotDivTwo.class, "test.*");
    }

	public void test0() {
		RETester.eq(find(new int[] {1, 2, 3, 4}, 2), new int[] {2, 3, 3, 4 });
	}

	public void test1() {
		RETester.eq(find(new int[] {4, 7}, 1), new int[] {5, 7 });
	}

	public void test2() {
		RETester.eq(find(new int[] {1}, 100), new int[] {101 });
	}

	public void test3() {
		RETester.eq(find(new int[] {21, 85, 6, 54, 70, 100, 91, 60, 71}, 15), new int[] {21, 21, 54, 60, 70, 71, 85, 91, 100 });
	}

// END CUT HERE

}


// Powered by FileEdit
// Powered by RETester [based on ExampleBuilder]
// Powered by CodeProcessor
