import java.util.*;

public class AdditionGame {
    public int getMaximumPoints(int A, int B, int C, int N) {
        int res = 0;
        int may = A;
        for(int i=0; i< N;i++)
        {

            if(A>=B && A>=C )
            {  res+=A;
               A--;
            }
            else if(B>=A && B>=C )
            {    res+=B;
                 B--;
            }
            else if(C>=B && C>=A )
           {  res+=C;
              C--;
           }
           //System.out.println(A+"  "+B+"   "+C);
            if(C<=0 && A<=0 &&B<=0)
                break;
        }

        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(AdditionGame.class, "test.*");
    }

	public void test0() {
		RETester.eq(getMaximumPoints(3, 4, 5, 3), 13);
	}

	public void test1() {
		RETester.eq(getMaximumPoints(1, 1, 1, 8), 3);
	}

	public void test2() {
		RETester.eq(getMaximumPoints(3, 5, 48, 40), 1140);
	}

	public void test3() {
		RETester.eq(getMaximumPoints(36, 36, 36, 13), 446);
	}

	public void test4() {
		RETester.eq(getMaximumPoints(8, 2, 6, 13), 57);
	}

// END CUT HERE
}
