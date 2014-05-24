import java.util.*;

public class OfficeParking {
    public int spacesUsed(String[] events) {
        int res=0;
        int max=0;
        
        HashSet<String> names = new HashSet<String>();
        
        for(int i=0;i<events.length;i++)
        {
            String[] aux = events[i].split("[ ]+");
            if(names.contains(aux[0])){
                res--;
                names.remove(aux[0]);
            }else{
                max=Math.max(max, ++res);
                names.add(aux[0]);
            }
        }
        
        return max;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(OfficeParking.class, "test.*");
    }

	public void test0() {
		RETester.eq(spacesUsed(new String[] {
			"Alice arrives","bob arrives","Alice departs",
			"Charles arrives","bob departs","Charles departs"}),
			2);
	}

	public void test1() {
		RETester.eq(spacesUsed(new String[] {
			"AdminBrett arrives","lbackstrom arrives","AdminBrett departs","mike arrives",
			"TheFaxman arrives","AdminBrett arrives","lbackstrom departs","dok arrives",
			"AdminBrett departs","gt arrives","AdminBrett arrives","lbackstrom arrives",
			"AdminBrett departs","jhughes arrives","jhughes departs","TheFaxman departs",
			"MaryJoe arrives","AdminBrett arrives","AdminBrett departs","AdminBrett arrives"}),
			6);
	}

	public void test2() {
		RETester.eq(spacesUsed(new String[] {
			"SnapDragon arrives","tomek arrives","JohnDethridge arrives","ZorbaTHut arrives",
			"snewman arrives","reid arrives","NGBronson arrives","Yarin arrives",
			"bstanescu arrives","mathijs arrives","radeye arrives","bladerunner arrives",
			"dgarthur arrives","venco arrives","dmwright arrives","WishingBone arrives",
			"Eryx arrives","antimatter arrives","ChristopherH arrives","lars arrives",
			"biggnate arrives","JanKuipers arrives","dary arrives","haha arrives","grotmol arrives",
			"XuChuan arrives","Ryan arrives","LunaticFrindge arrives","Wasteland arrives",
			"RunningWild arrives","hampster arrives","RalphFurmaniak arrives",
			"kyky arrives","qubits arrives","Rustyoldman arrives","turuthok arrives",
			"Vulpecular arrives","Eeyore arrives","wackes arrives","Ishan arrives",
			"dimkadimon arrives","dplass arrives","Olorin arrives","TangentZ arrives",
			"NeverMore arrives","Pops arrives","srowan arrives","tjq arrives",
			"vorthys arrives","schveiguy arrives"}),
			50);
	}

	public void test3() {
		RETester.eq(spacesUsed(new String[] {
			"AdminBrett arrives","AdminBrett departs","AdminBrett arrives","AdminBrett departs",
			"AdminBrett arrives","AdminBrett departs","AdminBrett arrives","AdminBrett departs",
			"AdminBrett arrives","AdminBrett departs","AdminBrett arrives","AdminBrett departs",
			"AdminBrett arrives","AdminBrett departs","AdminBrett arrives","AdminBrett departs"}
			),
			1);
	}

	public void test4() {
		RETester.eq(spacesUsed(new String[] {
			"snapdragon arrives","SnapDragon arrives",
			"AdminBrett arrives","AdminBrett departs",
			"SnapDragon departs","snapdragon departs"}),
			3);
	}

	public void test5() {
		RETester.eq(spacesUsed(new String[] {"departs arrives","arrives arrives","arrives departs","departs departs"}), 2);
	}

// END CUT HERE
}
