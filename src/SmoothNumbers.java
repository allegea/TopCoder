import java.util.*;

//TC 388 SRM DIV 1
public class SmoothNumbers {
    public int countSmoothNumbers(int N, int k) {
        int res=0;
        
        for (int i = 1; i <= N; i++) {
            int number = i;
            boolean pri = true;
            for (int p = 2; p * p <= number && pri; p++) {
                while (number % p == 0 && pri) {
                    number /= p;
                    if (p > k) {
                        pri = false;
                    }
                }
            }

            if (pri) {
                if (number >= 1 && number <= k) {
                    res++;
                }
            }

        }
        res=0;
        ///Criba de Eratostenes modificada, en donde se hallan los factores primos mayores de los números entre 1 y N
        int[] numbers = new int[N+1];
        
        for(int i=2;i<=N;i++)//Aquellos números primos, pone que sus multiplos pues tengan el mayor factor primo igual a dicho primo, y por el ciclo, el ultimo que haga dicha operación, sera el factor primo mayor
            if(numbers[i]==0)
            for(int j=i;j<=N;j+=i)
                numbers[j]=i;
        
        for(int i=1;i<=N;i++)
            if(numbers[i]<=k)
                res++;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(SmoothNumbers.class, "test.*");
    }

	public void test0() {
		RETester.eq(countSmoothNumbers(10, 3), 7);
	}

	public void test1() {
		RETester.eq(countSmoothNumbers(10, 4), 7);
	}

	public void test2() {
		RETester.eq(countSmoothNumbers(15, 3), 8);
	}

	public void test3() {
		RETester.eq(countSmoothNumbers(5, 20), 5);
	}

	public void test4() {
		RETester.eq(countSmoothNumbers(100000, 100), 17442);
	}

// END CUT HERE
}
