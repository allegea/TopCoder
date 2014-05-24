import java.util.*;

public class CubeAnts {
    public int getMinimumSteps(int[] pos) {
        int res=0;
        int mayo=0;
        for(int i=0;i<pos.length;i++)
        {
            if(pos[i]==0)mayo=0;
            if(pos[i]==1 ||pos[i]==3 ||pos[i]==4)mayo=1;
            if(pos[i]==2 ||pos[i]==7 ||pos[i]==5)mayo=2;
            if(pos[i]==6)mayo=3;

            if(res<mayo)res=mayo;
        }
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(CubeAnts.class, "test.*");
    }

	public void test0() {
		RETester.eq(getMinimumSteps(new int[] {0,1,1}), 1);
	}

	public void test1() {
		RETester.eq(getMinimumSteps(new int[] {5,4}), 2);
	}

	public void test2() {
		RETester.eq(getMinimumSteps(new int[] {0}), 0);
	}

	public void test3() {
		RETester.eq(getMinimumSteps(new int[] {6,1,6}), 3);
	}

	public void test4() {
		RETester.eq(getMinimumSteps(new int[] {7,7,3,3,7,7,3,3}), 2);
	}

// END CUT HERE
}
