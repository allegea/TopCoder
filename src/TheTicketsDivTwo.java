import java.util.*;

public class TheTicketsDivTwo {
    public double find(int n, int m, int k) {
        double res = 0;
        double a=1d/6d;
        double b=5d/6d;
        double c=1d/n;
        
       // System.out.println(c);
        
        if(k<m) return res;
        else
        {
            for(int i=0;i<k;i++)
            {
                if((i+1)%n==m) 
                {
                    res=res+a;
                    //System.out.println(n%(i+1));
                }
                else {
                    res=res+(b*c);
                    //System.out.println(n%(i+1));
                }
                
               
            }
        }
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(TheTicketsDivTwo.class, "test.*");
    }

	public void test0() {
		RETester.eq(find(2, 1, 1), 0.16666666666666666);
	}

	public void test1() {
		RETester.eq(find(2, 1, 2), 0.5833333333333334);
	}

	public void test2() {
		RETester.eq(find(7, 7, 4), 0.0);
	}

	public void test3() {
		RETester.eq(find(4, 2, 10), 0.25264033564814814);
	}

// END CUT HERE
}
