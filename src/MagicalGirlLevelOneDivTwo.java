import java.awt.geom.Point2D;
import java.util.*;

public class MagicalGirlLevelOneDivTwo {
    public double theMinDistance(int d, int x, int y) {
        double res;
        int mx,my;
        mx=my=0;
        
        mx=Math.abs(x)-d;
        my=Math.abs(y)-d;
        
        if(mx<0)mx=0;
        if(my<0)my=0;
        
        
        res = Math.sqrt(mx*mx+my*my);
       
        
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(MagicalGirlLevelOneDivTwo.class, "test.*");
    }

	public void test0() {
		RETester.eq(theMinDistance(5, 10, 10), 7.0710678118654755);
	}

	public void test1() {
		RETester.eq(theMinDistance(5, 10, 3), 5.0);
	}

	public void test2() {
		RETester.eq(theMinDistance(5, -8, -6), 3.1622776601683795);
	}

	public void test3() {
		RETester.eq(theMinDistance(5, 3, 2), 0.0);
	}

	public void test4() {
		RETester.eq(theMinDistance(24, 24, -24), 0.0);
	}

	public void test5() {
		RETester.eq(theMinDistance(345, -471, 333), 126.0);
	}

// END CUT HERE
}
