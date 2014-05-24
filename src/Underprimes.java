import java.util.*;

public class Underprimes {
    public int howMany(int A, int B) {
         int res=0;
         int[] primes = new int[B+1];
         primes[0]=primes[1]=-1;
        for(int i=2;i<=B;i++)
            if(primes[i]==0)
                for(int j=i*2;j<=B;j+=i){
                    int aux =j;
                    while(aux%i==0){
                        primes[j]++;
                        //System.out.println(primes[j]+" - "+aux+" - "+i+" - "+j);
                        aux/=i;
                        
                    }
                }
                    
     for(int i=A;i<=B;i++)
        if(primes[primes[i]]==0)res++;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(Underprimes.class, "test.*");
    }

	public void test0() {
		RETester.eq(howMany(2, 10), 5);
	}

	public void test1() {
		RETester.eq(howMany(100, 105), 2);
	}

	public void test2() {
		RETester.eq(howMany(17, 17), 0);
	}

	public void test3() {
		RETester.eq(howMany(123, 456), 217);
	}

// END CUT HERE
}
