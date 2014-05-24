import java.util.*;
//SRM 394 Div 1 250
public class RoughStrings {
    public int minRoughness(String s, int n) {
        int res;
        HashMap<Character,Integer> fre = new HashMap<Character,Integer>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        char[] letters = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(fre.containsKey(letters[i])){
                int frec = fre.get(letters[i]);
                //max = Math.max(max, ++frec);
                fre.put(letters[i], frec+1);
                
            }else
            {
                fre.put(letters[i], 1);
               // min = 1;
                
            }
        }
        
        
        for(int i=0;i<s.length();i++){
            int val = fre.get(letters[i]);
            min = Math.min(min, val);
            max = Math.max(max, val);
        }
        
        System.out.println(fre);
        
        if(fre.size()==1)return 0;
        
      
            if(n>max)return 0;
            else{
               
                max = max-n;
                return Math.abs(max-min);
            }
            
            /*if(n>min)return 0;
            else{
                min = min-n;
                return Math.abs(max-min);
            }*/
        
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(RoughStrings.class, "test.*");
    }

	public void test0() {
		RETester.eq(minRoughness("aaaaabbc", 1), 3);
	}

	public void test1() {
		RETester.eq(minRoughness("aaaabbbbc", 5), 0);
	}

	public void test2() {
		RETester.eq(minRoughness("veryeviltestcase", 1), 2);
	}

	public void test3() {
		RETester.eq(minRoughness("gggggggooooooodddddddllllllluuuuuuuccckkk", 5), 3);
	}

	public void test4() {
		RETester.eq(minRoughness("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz", 17), 0);
	}

	public void test5() {
		RETester.eq(minRoughness("bbbccca", 2), 0);
	}

// END CUT HERE
}
