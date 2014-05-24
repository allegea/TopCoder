import java.util.*;

public class PalindromeGame {
    public int getMaximum(String[] front, int[] back) {
        int res = 0;

        String palindrome;
        String dos;
        int otro = 0;
        int[] score = new int[front.length*front.length];

        for(int i = 0; i <score.length;i++)
        score[i] =0;

        for(int i = 0; i <front.length-1;i++)
        {

            for(int j = i+1;j<front.length;j++)
            {
                palindrome = front[i] + front[j];
                dos = "";
                for(int k = palindrome.length()-1;k>=0;k--)
                    dos = dos + palindrome.charAt(k);


                if(palindrome.endsWith(dos))
                {
                    score[otro]+=back[i]+back[j];
                    res+= score[otro];
                    otro++;


                }
            }
        }

        res = score[0];
        for(int i=1;i<otro;i++)
        {
            if(score[i]>res)
                res = score[i];
        }
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(PalindromeGame.class, "test.*");
    }

	public void test0() {
		RETester.eq(getMaximum(new String[] { "topcoder", "redcoder", "redocpot" }, new int[] { 7, 5, 3 }), 10);
	}

	public void test1() {
		RETester.eq(getMaximum(new String[] { "rabbit" }, new int[] { 1000000 }), 0);
	}

	public void test2() {
		RETester.eq(getMaximum(new String[] { "abc", "abc", "def", "cba", "fed" }, new int[] { 24, 7, 63, 222, 190 }), 499);
	}

// END CUT HERE
}
