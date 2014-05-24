import java.util.*;

public class ComparerInator {
    public int makeProgram(int[] A, int[] B, int[] wanted) {
     
        boolean one, two, three, four;
        one = true;
        two = true;
        three = true;
        four = true;
        for(int i=0;i<A.length && (one || two || three || four);i++){
            
            if(A[i]!=wanted[i]) one = false;
            if(B[i]!=wanted[i])two = false;
            if((A[i]<B[i]?A[i]:B[i])!=wanted[i])three = false;
            if((A[i]<B[i]?B[i]:A[i])!=wanted[i])four = false;
            
        }
         
        if(one || two)return 1;
        if(three || four) return 7; 
        return -1;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(ComparerInator.class, "test.*");
    }

	public void test0() {
		RETester.eq(makeProgram(new int[] {1}, new int[] {2}, new int[] {2}), 1);
	}

	public void test1() {
		RETester.eq(makeProgram(new int[] {1,3}, new int[] {2,1}, new int[] {2,3}), 7);
	}

	public void test2() {
		RETester.eq(makeProgram(new int[] {1,3,5}, new int[] {2,1,7}, new int[] {2,3,5}), -1);
	}

	public void test3() {
		RETester.eq(makeProgram(new int[] {1,3,5}, new int[] {2,1,7}, new int[] {1,3,5}), 1);
	}

	public void test4() {
		RETester.eq(makeProgram(new int[] {1,2,3,4,5,6,7,8,9,10,11}, new int[] {5,4,7,8,3,1,1,2,3,4,6}, new int[] {1,2,3,4,3,1,1,2,3,4,6}), 7);
	}

	public void test5() {
		RETester.eq(makeProgram(new int[] {1,5,6,7,8}, new int[] {1,5,6,7,8}, new int[] {1,5,6,7,8}), 1);
	}

// END CUT HERE
}
