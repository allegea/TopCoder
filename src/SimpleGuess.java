import java.util.*;

public class SimpleGuess {
    public int getMaximum(int[] hints) {
        int res = 0;

        int[] X = new int[hints.length*hints.length];
        int[] Y = new int[hints.length*hints.length];

        //System.out.println(hints.length);
        int parejas = 0;

        for(int i = 0; i< (hints.length-1);i++)
        {
            for(int j = i+1 ; j<hints.length;j++)
            {
           
                int min = hints[i];
                int mayor = hints[j];
                if( hints[j] < min)
                {
                    min = mayor;
                    mayor = hints[i];
                }
                //System.out.println(min +"   "+mayor);

                if((mayor - min)%2==0)
                {
                X[parejas] = (mayor - min)/2;
                Y[parejas] = X[parejas] +min;

                parejas++;
                }

            }
         }
        res = X[0]*Y[0];
        for(int i = 1;i<parejas;i++)
        {
            if(res < X[i]*Y[i])
                res = X[i]*Y[i];

        }

        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(SimpleGuess.class, "test.*");
    }

	public void test0() {
		RETester.eq(getMaximum(new int[] { 1, 4, 5 }), 6);
	}

	public void test1() {
		RETester.eq(getMaximum(new int[] { 1, 4, 5, 8 }), 12);
	}

	public void test2() {
		RETester.eq(getMaximum(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 }), 20);
	}

	public void test3() {
		RETester.eq(getMaximum(new int[] { 2, 100 }), 2499);
	}

	public void test4() {
		RETester.eq(getMaximum(new int[] { 50, 58, 47, 57, 40 }), 441);
	}

// END CUT HERE
}
