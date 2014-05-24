import java.util.*;
//SRM 431 DIV 2 - 250 
public class MegaCoolNumbersEasy {
    public int count(int N) {
        int res=0;
        for(int i=1;i<=N;i++){
            char[] number = String.valueOf(i).toCharArray();
            boolean answer = true;
            int dif = 0;
            boolean first = true;
            for(int j=0;j<number.length && answer;j++){
                if(j+1<number.length){
                        if(first){
                            dif = (number[j]- number[j+1]);
                            first = false;
                        }
                        else if(dif!=(number[j]- number[j+1]))answer = false; 
                }
                    
            }
            if(answer)
            { res++;
               // System.out.println(i);
                
            }
            
        }
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(MegaCoolNumbersEasy.class, "test.*");
    }

	public void test0() {
		RETester.eq(count(1), 1);
	}

	public void test1() {
		RETester.eq(count(110), 99);
	}

	public void test2() {
		RETester.eq(count(500), 119);
	}

// END CUT HERE
}
