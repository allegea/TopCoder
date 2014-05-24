import java.util.*;

public class WorkingRabbits {
    public double getEfficiency(String[] profit) {
        double res=0;
        int count = 0;
        for(int i=0;i<profit.length;i++)
        {
            for(int j=0;j<profit[0].length();j++)
            {
                if(i==j)continue;
                res+=profit[i].charAt(j)-'0';
                count++;
            }
        }
        //System.out.println(res/count);
        return res/count;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(WorkingRabbits.class, "test.*");
    }

	public void test0() {
		RETester.eq(getEfficiency(new String[] {
			"071", 
			"702", 
			"120" }
			),
			3.3333333333333335);
	}

	public void test1() {
		RETester.eq(getEfficiency(new String[] {
			"00", 
			"00" }
			),
			0.0);
	}

	public void test2() {
		RETester.eq(getEfficiency(new String[] {
			"0999", 
			"9099", 
			"9909", 
			"9990" }
			),
			9.0);
	}

	public void test3() {
		RETester.eq(getEfficiency(new String[] {
			"013040", 
			"100010", 
			"300060", 
			"000008", 
			"416000", 
			"000800" }
			),
			1.5333333333333334);
	}

	public void test4() {
		RETester.eq(getEfficiency(new String[] {
			"06390061", 
			"60960062", 
			"39090270", 
			"96900262", 
			"00000212", 
			"00222026", 
			"66761201", 
			"12022610" }
			),
			3.2142857142857144);
	}

// END CUT HERE
}
