import java.util.*;

public class InternetSecurity {
    public String[] determineWebsite(String[] address, String[] keyword, String[] dangerous, int threshold) {
        String[] res;
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(InternetSecurity.class, "test.*");
    }

	public void test0() {
		RETester.eq(determineWebsite(new String[] {
			"www.topcoder.com",
			"www.sindicate_of_evil.com",
			"www.happy_citizens.com"},
			new String[] {
			"hack encryption decryption internet algorithm",
			"signal interference evil snake poison algorithm",
			"flower baloon topcoder blue sky sea"},
			new String[] {"hack","encryption","decryption","interference","signal","internet"}, 3), new String[] {"www.topcoder.com", "www.sindicate_of_evil.com" });
	}

	public void test1() {
		RETester.eq(determineWebsite(new String[] {"brokenlink","flowerpower.net","purchasedomain.com"}, new String[] {"broken","rose tulips","cheap free domain biggest greatest"}, new String[] {"biggest","enemy","hideout"}, 2), new String[] { });
	}

	public void test2() {
		RETester.eq(determineWebsite(new String[] {"a..a.ab.","...aa.b"}, new String[] {"a bc def","def ghij klmno"}, new String[] {"a","b","c","d","e"}, 1), new String[] {"a..a.ab.", "...aa.b" });
	}

	public void test3() {
		RETester.eq(determineWebsite(new String[] {"www.tsa.gov"}, new String[] {"information assurance signal intelligence research"}, new String[] {"signal","assurance","penguin"}, 2), new String[] {"www.tsa.gov" });
	}

// END CUT HERE
}
