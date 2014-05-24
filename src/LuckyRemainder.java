/*
 * Little Arthur loves numbers and 9 is his most favorite. When encountering a number, he always calculates its lucky remainder - the remainder after division by 9.

This time Arthur is given a number X of length N which contains no zeros. He is asked to find the supersum of X: super(X).

super(X) is defined as follows. For a given non-full set S of digit positions in X we erase the digits in these positions to obtain a sub-number. For example, if X = 12345 and S = {2, 4} we erase 2nd and 4th digits and obtain a sub-number 135. Supersum of X is simply the sum of sub-numbers for all valid sets S.

For example, if X is 123, then super(X) = 123 + 12 + 13 + 23 + 1 + 2 + 3 = 177.

Calculating super(X) is very difficult for Arthur. However, before getting to work he is wondering if it is possible to quickly tell what the lucky reminder of the supersum of X is. You have to help him.

Given String X, which contains the decimal representation of the number X, return super(X)'s lucky remainder.
 *
 */


import java.math.BigInteger;
import java.util.*;

public class LuckyRemainder {
    public int getLuckyRemainder(String X) {
        int res=0;


        BigInteger sumatoria = new BigInteger("0") ;
        BigInteger permutaciones = new BigInteger("1");
        BigInteger inicial = new BigInteger("2");

        BigInteger aumento = BigInteger.valueOf(X.length()+1);

        BigInteger contador = new BigInteger("0");

        for(;!aumento.equals(inicial);)
        {
            permutaciones = permutaciones.multiply(inicial);
            inicial=inicial.add(BigInteger.valueOf(1));
        }

        //System.out.println(permutaciones.toString()+" fffff "+aumento.toString()+" - "+inicial.toString());


        Set<BigInteger> set = new HashSet<BigInteger>();
			char[] a = X.toCharArray();
			//Arrays.sort(a);
                        boolean terminar = false;
                        


			while (true) {
				//String Nc = String.valueOf(a);
				//System.out.println(Nc);
				for (int i = 0; i < Nc.length(); ++i)
                                {      String Nc=

                                }
					for (int j = i+1; j <= Nc.length(); ++j)
                                        {
						String tmp = Nc.substring(i, j);
						//System.out.println(tmp);
						//if (isPrime(Integer.parseInt(tmp)))
                                                //System.out.println((tmp));
							if(set.add(BigInteger.valueOf(Long.parseLong(tmp))))
                                                        {
                                                            System.out.println((tmp));
                                                            contador=contador.add(BigInteger.valueOf(1));
                                                            if(contador.equals(permutaciones))
                                                            {
                                                                terminar = true;
                                                                break;
                                                            }
                                                        }


					
                                       }
                            }
                                if(terminar)break;
				if (!nextPermutation(a))
					break;
                                    
                                 
                               }

                        for(BigInteger i:set)
                        {
                            sumatoria=sumatoria.add(i);
                        }
            res = Integer.parseInt(sumatoria.mod(new BigInteger("9")).toString());
        return res;
    }

    public boolean nextPermutation(char[] a) {
		int n = a.length;

		int k = -1;
		for (int i = 0; i < n - 1; ++i)
			if (a[i] < a[i + 1]) {
				k = i;
			}
		if (k == -1)
			return false;
		int l = 0;
		for (int i = k + 1; i < n; ++i)
			if (a[i] > a[k])
				l = i;
		char t = a[k];
		a[k] = a[l];
		a[l] = t;

		for (int i = k + 1; i < (n + k + 1) / 2; ++i) {
			t = a[i];
			a[i] = a[n + k - i];
			a[n + k - i] = t;
		}

		return true;
	}

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(LuckyRemainder.class, "test.*");
    }

	public void test0() {
		RETester.eq(getLuckyRemainder("123"), 6);
	}

	/*public void test1() {
		RETester.eq(getLuckyRemainder("24816"), 3);
	}

	public void test2() {
		RETester.eq(getLuckyRemainder("8"), 8);
	}

	public void test3() {
		RETester.eq(getLuckyRemainder("11235813213455"), 7);
	}*/

// END CUT HERE
}
