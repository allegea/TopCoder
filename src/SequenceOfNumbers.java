import java.util.*;

public class SequenceOfNumbers {
    public String[] rearrange(String[] sequence) {
        String[] res;
        
        long[] vec = new long[sequence.length];
        
        for(int i=0;i<sequence.length;i++)
            vec[i]=Long.parseLong(sequence[i]);
        
        Arrays.sort(vec);
        
        for(int i=0;i<sequence.length;i++)
            sequence[i]=String.valueOf(vec[i]);
        
        return sequence;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(SequenceOfNumbers.class, "test.*");
    }

	public void test0() {
		RETester.eq(rearrange(new String[] {"1","174","23","578","71","9"}), new String[] {"1", "9", "23", "71", "174", "578" });
	}

	public void test1() {
		RETester.eq(rearrange(new String[] {"172","172","172","23","23"}), new String[] {"23", "23", "172", "172", "172" });
	}

	public void test2() {
		RETester.eq(rearrange(new String[] {"183","2","357","38","446","46","628","734","741","838"}), new String[] {"2", "38", "46", "183", "357", "446", "628", "734", "741", "838" });
	}

// END CUT HERE
}
