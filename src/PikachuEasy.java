import java.util.*;

public class PikachuEasy {
    public String check(String word) {
                
        while(word.length()!=0){
           // System.out.println(word);
            if(word.startsWith("pi")){
               word= word.substring(2);
            }else if(word.startsWith("ka")){
               word= word.substring(2);
            }
            else if(word.startsWith("chu")){
               word= word.substring(3);
            }else return "NO";
            
        }
        
        
        return "YES";
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(PikachuEasy.class, "test.*");
    }

	public void test0() {
		RETester.eq(check("pikapi"), "YES");
	}

	public void test1() {
		RETester.eq(check("pipikachu"), "YES");
	}

	public void test2() {
		RETester.eq(check("pikaqiu"), "NO");
	}

	public void test3() {
		RETester.eq(check("topcoder"), "NO");
	}

	public void test4() {
		RETester.eq(check("piika"), "NO");
	}

	public void test5() {
		RETester.eq(check("chupikachupipichu"), "YES");
	}

	public void test6() {
		RETester.eq(check("pikapipachu"), "NO");
	}

// END CUT HERE
}
