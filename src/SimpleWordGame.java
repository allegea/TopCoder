import java.util.*;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        int res=0;
        HashSet<String> dic = new HashSet<String>();
        HashSet<String> visited = new HashSet<String>();
        for(int i=0;i<dictionary.length;i++){
            dic.add(dictionary[i]);
        }
        
        for(int i =0;i<player.length;i++){
            if(dic.contains(player[i])){
                if(!visited.contains(player[i])){
                    res+=player[i].length()*player[i].length();
                    visited.add(player[i]);
                }
            }
        }
        
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(SimpleWordGame.class, "test.*");
    }

	public void test0() {
		RETester.eq(points(new String[] { "apple", "orange", "strawberry" }, new String[] { "strawberry", "orange", "grapefruit", "watermelon" }), 136);
	}

	public void test1() {
		RETester.eq(points(new String[] { "apple" }, new String[] { "strawberry", "orange", "grapefruit", "watermelon" }), 0);
	}

	public void test2() {
		RETester.eq(points(new String[] { "orange", "orange" }, new String[] { "strawberry", "orange", "grapefruit", "watermelon" }), 36);
	}

	public void test3() {
		RETester.eq(points(new String[] {
			"lidi", "o", "lidi", "gnbewjzb", "kten",
			"ebnelff", "gptsvqx", "rkauxq", "rkauxq", "kfkcdn"},
			new String[] {
			"nava", "wk", "kfkcdn", "lidi", "gptsvqx",
			"ebnelff", "hgsppdezet", "ulf", "rkauxq", "wcicx"}),
			186);
	}

// END CUT HERE
}
