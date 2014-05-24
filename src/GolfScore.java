import java.util.*;

public class GolfScore {
    public int tally(int[] parValues, String[] scoreSheet) {
        int res=0;
        HashMap<String,Integer> values = new HashMap<String,Integer>();
        values.put("triple bogey",3);
        values.put("double bogey",2);
        values.put("bogey",1);
        values.put("par",0);
        values.put("birdie",-1);
        values.put("eagle",-2);
        values.put("albatross",-3);
        values.put("hole in one",0);
        for(int i=0;i<parValues.length;i++){
            if("hole in one".equals(scoreSheet[i]))res+=1;
            else res+=parValues[i]+values.get(scoreSheet[i]);
        }
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(GolfScore.class, "test.*");
    }

	public void test0() {
		RETester.eq(tally(new int[] {
			1, 1, 1, 1, 1, 1,
			1, 1, 1, 5, 5, 5,
			5, 5, 5, 5, 5, 5},
			new String[] {
			"bogey", "bogey", "bogey", "bogey", "bogey", "bogey",
			"bogey", "bogey", "bogey", "eagle", "eagle", "eagle",
			"eagle", "eagle", "eagle", "eagle", "eagle", "eagle"}),
			45);
	}

	public void test1() {
		RETester.eq(tally(new int[] {
			3, 2, 4, 2, 2, 1,
			1, 1, 3, 2, 4, 4,
			4, 2, 3, 1, 3, 2},
			new String[] {
			"bogey", "double bogey", "par", "double bogey", "double bogey", "triple bogey",
			"triple bogey", "triple bogey", "bogey", "double bogey", "par", "par",
			"par", "double bogey", "bogey", "triple bogey", "bogey", "double bogey"}),
			72);
	}

	public void test2() {
		RETester.eq(tally(new int[] {
			3, 2, 4, 2, 2, 1,
			1, 1, 3, 2, 4, 4,
			4, 2, 3, 1, 3, 2},
			new String[] {
			"eagle", "birdie", "albatross", "birdie", "birdie", "par",
			"hole in one", "par", "eagle", "birdie", "albatross", "albatross",
			"albatross", "birdie", "eagle", "hole in one", "eagle", "birdie"}),
			18);
	}

	public void test3() {
		RETester.eq(tally(new int[] {
			4, 1, 3, 3, 4, 4,
			1, 4, 2, 3, 3, 5,
			4, 1, 4, 4, 2, 1},
			new String[] {
			"triple bogey", "triple bogey", "bogey", "par", "triple bogey", "double bogey",
			"triple bogey", "triple bogey", "par", "eagle", "bogey", "bogey",
			"birdie", "par", "triple bogey", "eagle", "triple bogey", "triple bogey"}),
			77);
	}

// END CUT HERE
}
