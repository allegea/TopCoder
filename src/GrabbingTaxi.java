import java.util.*;

public class GrabbingTaxi {
    public int minTime(int[] tXs, int[] tYs, int gX, int gY, int walkTime, int taxiTime) {
        int res;
        int apro;
        res = Math.abs(gX*walkTime) + Math.abs(gY*walkTime);
        for(int i=0;i<tXs.length;i++)
        {
            apro = Math.abs(tXs[i]*walkTime)+Math.abs(tYs[i]*walkTime)+taxiTime*(Math.abs(gX-tXs[i])+Math.abs(gY-tYs[i]));
            if(res>apro)
                res = apro;
        }
           // System.out.println(res);
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(GrabbingTaxi.class, "test.*");
    }

	public void test0() {
		RETester.eq(minTime(new int[] {}, new int[] {}, 3, 2, 10, 2), 50);
	}

	public void test1() {
		RETester.eq(minTime(new int[] {-2, -2}, new int[] {0, -2}, -4, -2, 15, 3), 42);
	}

	public void test2() {
		RETester.eq(minTime(new int[] {3}, new int[] {0}, 5, 0, 10, 20), 50);
	}

	public void test3() {
		RETester.eq(minTime(new int[] {34, -12, 1, 0, 21, -43, -98, 11, 86, -31}, new int[] {11, 5, -68, 69, -78, -49, -36, -2, 1, 70}, -97, -39, 47, 13), 2476);
	}

	public void test4() {
		RETester.eq(minTime(new int[] {82, -60, 57, 98, 30, -67, 84, -42, -100, 62}, new int[] {-7, 90, 53, -56, -15, -87, 22, -3, -61, -30}, 21, 15, 53, 2), 1908);
	}

// END CUT HERE
}
