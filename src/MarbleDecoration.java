 /* Problem Statement
    
Ash is a marble collector and he likes to create various ornaments using his marbles.  One day, Elsh asks him to create a simple decoration for her desk. She wants a sequence of marbles consisting of at most two different colors. To make the sequence look interesting, each pair of adjacent marbles must have different colors.  Currently, Ash has R red marbles, G green marbles, and B blue marbles. Elsh wants that the resulting sequence is as long as possible. Return this maximum length.
Definition
    
Class:
MarbleDecoration
Method:
maxLength
Parameters:
int, int, int
Returns:
int
Method signature:
int maxLength(int R, int G, int B)
(be sure your method is public)
    

Constraints
-
R will be between 0 and 50, inclusive.
-
G will be between 0 and 50, inclusive.
-
B will be between 0 and 50, inclusive.
Examples
0)

    
0
0
0
Returns: 0
Ash currently doesn't have any marbles at all.
1)

    
3
0
0
Returns: 1
The only valid sequence is (red).
2)

    
5
1
2
Returns: 5
One possible sequence is (red, blue, red, blue, red).
3)

    
7
7
4
Returns: 14

4)

    
2
3
5
Returns: 7

5)

    
13
13
13
Returns: 26

This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
 */

import java.util.*;

public class MarbleDecoration {
    public int maxLength(int R, int G, int B) {
        int res;
        if(R==0&&G==0&&B>0) return 1;
        if(B==0&&G==0&&R>0) return 1;
        if(R==0&&B==0&&G>0) return 1;
        
        
        int[] mayor = new int[3];
        mayor[0]=R;
        mayor[1]=G;
        mayor[2]=B;
        Arrays.sort(mayor);
        
        res = mayor[1]*2;
        if(mayor[2]>mayor[1])res+=1;
        
        
        
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(MarbleDecoration.class, "test.*");
    }

	public void test0() {
		RETester.eq(maxLength(0, 0, 0), 0);
	}

	public void test1() {
		RETester.eq(maxLength(3, 0, 0), 1);
	}

	public void test2() {
		RETester.eq(maxLength(5, 1, 2), 5);
	}

	public void test3() {
		RETester.eq(maxLength(7, 7, 4), 14);
	}

	public void test4() {
		RETester.eq(maxLength(2, 3, 5), 7);
	}

	public void test5() {
		RETester.eq(maxLength(13, 13, 13), 26);
	}

// END CUT HERE
}
