import java.util.*;

public class GroupedWordChecker {
    //SRM 432 DIV 2 250
    public int howMany(String[] words) {
        int res=0;
        
        for(int i=0;i<words.length;i++){
            
            boolean[] visited = new boolean[26];
            char[] word = words[i].toCharArray();
            boolean count = true;
            for(int j=0;j<word.length && count;j++){
                
                //System.out.println(word[j]+" - "+visited[word[j]-'a']);
                if(!visited[word[j]-'a']){
                    visited[word[j]-'a']=true;
                    char aux = word[j];
                    while(j<word.length && word[j]==aux)
                        j++;
                    
                    if(j<word.length)
                        j--;
                    
                }else{
                    count = false;
                }
                
            }
            if(count)res++;
            
        }
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(GroupedWordChecker.class, "test.*");
    }

	public void test0() {
		RETester.eq(howMany(new String[] {"ccazzzzbb", "code", "aabbbccb", "topcoder"}), 2);
	}

	public void test1() {
		RETester.eq(howMany(new String[] {"a"}), 1);
	}

	public void test2() {
		RETester.eq(howMany(new String[] {"happy", "new", "year"}), 3);
	}

	public void test3() {
		RETester.eq(howMany(new String[] {"yzyzy", "zyzyz"}), 0);
	}

	public void test4() {
		RETester.eq(howMany(new String[] {"z"}), 1);
	}

// END CUT HERE
}
