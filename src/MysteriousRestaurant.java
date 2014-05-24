/*
 * 
 * Problem Statement
    
A mysterious new restaurant is open in the city for only N days. Happy to hear that, Ash and Elsh would like to have lunch at the restaurant on as many days as possible.  The restaurant sells M types of dishes. Being a mysterious restaurant, it has mysterious rules for the customers:  
They can only buy one single dish per day.
If they buy a dish of type j on the i-th day, then on the same day next week, i.e., on the (i+7)-th day, they can only buy a dish of type j.
If they don't buy any dishes on any day, then they can't buy any dishes again from the restaurant.
 Mysteriously, the price of each type of dish varies every day. You are given a String[] prices consisting of N elements, each containing M characters. prices[i][j] represents the price of the j-th type of dish on the i-th day, encoded as follows: 
'0' - '9': denotes the price of 0 - 9 dollars.
'A' - 'Z': denotes the price of 10 - 35 dollars.
'a' - 'z': denotes the price of 36 - 61 dollars.
 Ash and Elsh have only budget dollars allocated for having lunch in the restaurant. Return the maximum number of days they could have lunch in the restaurant.
Definition
    
Class:
MysteriousRestaurant
Method:
maxDays
Parameters:
String[], int
Returns:
int
Method signature:
int maxDays(String[] prices, int budget)
(be sure your method is public)
    

Constraints
-
prices will contain between 1 and 50 elements, inclusive.
-
Each element of prices will contain the same number of characters, between 1 and 50 characters, inclusive.
-
Each character in prices will be '0'-'9', 'a'-'z', or 'A'-'Z'.
-
budget will be between 0 and 10,000, inclusive.
Examples
0)

    
{"26", "14", "72", "39", "32", "85", "06"}
13
Returns: 5
The restaurant is open for 7 days. They can have lunch for 5 days, each picking the cheaper dish from the two available types. The total prices would be 2+1+2+3+2 = 10.
1)

    
{"26", "14", "72", "39", "32", "85", "06", "91"}
20
Returns: 8
In this case, it is better to buy the second type of dish on the first and the eighth day, so they can have lunch for the entire 8 days.
2)

    
{"SRM", "512"}
4
Returns: 0
They don't have sufficient budget.
3)

    
{"Dear", "Code", "rsHa", "veFu", "nInT", "heCh", "alle", "ngeP", "hase", "andb", "ecar", "eful"}
256
Returns: 10
 */



import java.util.*;

public class MysteriousRestaurant {
    public int maxDays(String[] prices, int budget) {
        int res =0;
        int days = prices.length;
        int[][] price = new int[prices.length][prices[0].length()];
        int[] positions = new int[prices.length];
        int[] sums = new int[prices[0].length()];
        Arrays.fill(positions, -1);
        int[] minimos = new int[prices.length];
        for(int i=0;i<prices.length;i++)
        {
            for(int j=0;j<prices[i].length();j++)
            {
                price[i][j]=prices[i].charAt(j)-48;
                if(price[i][j]>=17 &&price[i][j]<=34)price[i][j]-=7;
                if(price[i][j]>=49 &&price[i][j]<=74)price[i][j]-=13;
                
            }
        }
        
        for(int i=0;i<prices.length;i++)
        {
            int min = price[i][0];
            sums[0]+=price[i][0];
            positions[i]=0;
            for(int j=1;j<prices[i].length();j++)
            {
               if(price[i][j]<min)
               {
                   min = price[i][j];
                   positions[i]=j;
               }
               sums[j]+=price[i][j];
                
            }
            
            boolean correc = false;
            int menor=0;
            int posAux = -1;
            for(int w=i-7;w>0;w--)
            {
                
                if(positions[i]!=positions[w])
                {
                    menor = sums[0];
                    correc = true;
                    for(int k=0;k<prices[0].length();k++)
                    {
                            if(menor>sums[k])
                                {menor=sums[k];
                                posAux=k;
                            }
                        }

                    break;
                }
            }
            
            if(correc)
            {
                for(int w=i-7;w>0;w--)
                {
                    positions[w]=posAux;
                    budget+=minimos[w];
                }
                
                budget-=menor;
            }else{
            
            
            
            minimos[i]=min;
            budget-=min;
            }
            //System.err.println(budget+" - "+min);
            if(budget>0) res++;
            else break;

        }

        System.out.println(res);
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(MysteriousRestaurant.class, "test.*");
    }

	public void test0() {
		RETester.eq(maxDays(new String[] {"26", "14", "72", "39", "32", "85", "06"}, 13), 5);
	}

	public void test1() {
		RETester.eq(maxDays(new String[] {"26", "14", "72", "39", "32", "85", "06", "91"}, 20), 8);
	}

	public void test2() {
		RETester.eq(maxDays(new String[] {"SRM", "512"}, 4), 0);
	}

	public void test3() {
		RETester.eq(maxDays(new String[] {"Dear", "Code", "rsHa", "veFu", "nInT", "heCh", "alle", "ngeP", "hase", "andb", "ecar", "eful"}, 256), 10);
	}

// END CUT HERE
}
