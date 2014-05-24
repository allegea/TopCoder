import java.util.*;

public class MinDifference {
    public int closestElements(int A0, int X, int Y, int M, int n) {
        int res;
               int[] A = new int[n];
        A[0] = A0;
        for(int i=1;i<n;i++)
        {
            A[i] = (A[i-1]*X+Y)%M;

        }

        res = Math.abs(A[0]-A[1]);

        for(int i = 0; i<(n-1); i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(res>Math.abs(A[i]-A[j]))
                {
                    res = Math.abs(A[i]-A[j]);
                }
            }
        }

        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(MinDifference.class, "test.*");
    }

	public void test0() {
		RETester.eq(closestElements(3, 7, 1, 101, 5), 6);
	}

	public void test1() {
		RETester.eq(closestElements(3, 9, 8, 32, 8), 0);
	}

	public void test2() {
		RETester.eq(closestElements(67, 13, 17, 4003, 23), 14);
	}

	public void test3() {
		RETester.eq(closestElements(1, 1221, 3553, 9889, 11), 275);
	}

	public void test4() {
		RETester.eq(closestElements(1, 1, 1, 2, 10000), 0);
	}

	public void test5() {
		RETester.eq(closestElements(1567, 5003, 9661, 8929, 43), 14);
	}

// END CUT HERE
}
