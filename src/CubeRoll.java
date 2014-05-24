import java.util.*;

public class CubeRoll {
    public int getMinimumSteps(int initPos, int goalPos, int[] holePos) {
        int res=0;
        int min=Math.min(initPos, goalPos);
        int max=Math.max(initPos, goalPos);
        for(int i=0;i<holePos.length;i++)
        {
            if(holePos[i]>min && holePos[i]<max)
            {
                res = -1;
                break;
            }
        }
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(CubeRoll.class, "test.*");
    }

	public void test0() {
		RETester.eq(getMinimumSteps(5, 1, new int[] {3}), -1);
	}

	public void test1() {
		RETester.eq(getMinimumSteps(36, 72, new int[] {300, 100, 200, 400}), 1);
	}

	public void test2() {
		RETester.eq(getMinimumSteps(10, 21, new int[] {38,45}), 2);
	}

	public void test3() {
		RETester.eq(getMinimumSteps(98765, 4963, new int[] {10,20,40,30}), 2);
	}

	public void test4() {
		RETester.eq(getMinimumSteps(68332, 825, new int[] {99726,371,67,89210}), 2);
	}

// END CUT HERE
}
