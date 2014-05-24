import java.util.*;

public class ScoringEfficiency {
    public double getPointsPerShot(String[] gameLog) {
        double res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(ScoringEfficiency.class, "test.*");
    }

	public void test0() {
		RETester.eq(getPointsPerShot(new String[] {
			"Made 3 point field goal",
			"Missed 2 point field goal"}),
			1.5);
	}

	public void test1() {
		RETester.eq(getPointsPerShot(new String[] {
			"Made free throw",
			"Missed free throw",
			"Missed free throw",
			"Missed free throw",
			"Made free throw"}
			),
			0.8);
	}

	public void test2() {
		RETester.eq(getPointsPerShot(new String[] {
			"Made 2 point field goal", "Made 2 point field goal", "Made 2 point field goal", 
			"Made 2 point field goal", "Missed 2 point field goal",
			"Made 3 point field goal", "Made 3 point field goal", "Made 3 point field goal",
			"Missed 3 point field goal", "Missed 3 point field goal", 
			"Missed 3 point field goal", "Missed 3 point field goal",
			"Made free throw", "Made free throw", "Made free throw", 
			"Made free throw", "Made free throw", "Made free throw", 
			"Made free throw", "Missed free throw", "Missed free throw"}),
			1.4545454545454546);
	}

	public void test3() {
		RETester.eq(getPointsPerShot(new String[] {
			"Made 2 point field goal", "Missed free throw",
			"Made free throw", "Missed free throw", "Made free throw", 
			"Made 2 point field goal", "Made 2 point field goal",
			"Missed 2 point field goal", "Missed 2 point field goal",
			"Made 3 point field goal", "Missed 2 point field goal",
			"Made 2 point field goal", "Missed 2 point field goal",
			"Made 3 point field goal", "Missed 2 point field goal",
			"Missed 2 point field goal", "Missed 3 point field goal",
			"Made free throw", "Made free throw", 
			"Missed 3 point field goal", "Missed 2 point field goal",
			"Missed 2 point field goal", "Made 2 point field goal",
			"Missed 2 point field goal", "Made 2 point field goal",
			"Missed 3 point field goal"}
			),
			0.9565217391304348);
	}

// END CUT HERE
}
