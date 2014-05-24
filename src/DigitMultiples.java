import java.lang.Integer;
import java.util.*;

public class DigitMultiples {
    public int getLongest(String single, String multiple) {
        int res=0;
            Petr
        Long.parseLong(single);
        for(int i=0;i<=9;i++)
        {            
            for(int j=0;j<single.length();j++){
                for(int h=j+1;h<=single.length();h++){
                String x =   String.valueOf(Long.parseLong(single.substring(j, h))*i);
                    for(int w=0;w+x.length()<multiple.length();w++)
                    {
                        if(multiple.substring(w, w+x.length()).equals(x))
                            res = Math.max(res, x.length());
                    }
                }
            }
        }
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(DigitMultiples.class, "test.*");
    }

	public void test0() {
		RETester.eq(getLongest("3211113321571", "5555266420"), 5);
	}

	public void test1() {
		RETester.eq(getLongest("100200300", "100400600"), 8);
	}

	public void test2() {
		RETester.eq(getLongest("111111111100000000000000000000000000000000000", "122333444455555666666777777788888888999999999"), 9);
	}

	public void test3() {
		RETester.eq(getLongest("000000000000", "000000000000"), 12);
	}

	public void test4() {
		RETester.eq(getLongest("11111111111", "11111111111"), 11);
	}

	public void test5() {
		RETester.eq(getLongest("89248987092734709478099", "00000000000000000000000"), 23);
	}

	public void test6() {
		RETester.eq(getLongest("11111111111111111111111111111111111111111111111111", "00000000000000000000000001111111111111111111111111"), 25);
	}

// END CUT HERE
}
