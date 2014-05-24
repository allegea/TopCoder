import java.util.*;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Glossary {
    

    public String[] buildGlossary(String[] items) {
        String[] res = new String[1000];
        int size = 0;
       
       
                
        
        TreeMap<Character, TreeSet<String> > set1 = new TreeMap<Character, TreeSet<String>>();
        TreeMap<Character, TreeSet<String> > set2 = new TreeMap<Character, TreeSet<String>>();
        for(int i=0;i<items.length;i++)
        {
            char first = Character.toUpperCase(items[i].charAt(0));
            if (first >= 'N') {
                if (set2.containsKey(first)) {
                    set2.get(first).add(items[i]);


                } else {

                    TreeSet<String> aux = new TreeSet<String>();
                    aux.add(items[i]);
                    set2.put(first, aux);
                }
            } else {
                if (set1.containsKey(first)) {
                    set1.get(first).add(items[i]);


                } else {

                    TreeSet<String> aux = new TreeSet<String>();
                    aux.add(items[i]);
                    set1.put(first, aux);
                }

            }
                
                
        }
        

        String spaces = "                                           ";
    
           for(Entry<Character, TreeSet<String>> s11:set1.entrySet()) {
              
                
                res[size++]=s11.getKey() + "                    ";
                res[size++]="-------------------";

                String[] y = s11.getValue().toArray(new String[0]);
                Arrays.sort(y, new Comparator<String>() {

                    public int compare(String s1, String s2) {
                        return s1.toLowerCase().compareTo(s2.toLowerCase());
                    }
                });

                for (int j = 0; j < y.length; j++) {
                     res[size++]="  "+y[j];
                    //System.out.println(y[j]);
                }
            }
      
            int sizeA = 0;
            for(Entry<Character, TreeSet<String>> s11:set2.entrySet()) {
               
                //System.out.println(res[sizeA]+" ************");
                if(res[sizeA]==null)res[sizeA]="                     ";
                else res[sizeA]+=spaces.substring(0, 21-res[sizeA].length()); 
                    res[sizeA]+=s11.getKey();
                    res[sizeA]+=spaces.substring(0, 40-res[sizeA++].length());
                            
                    
                 if(res[sizeA]==null)res[sizeA]="                     ";
                 else  res[sizeA]+=spaces.substring(0, 21-res[sizeA].length()); 
                res[sizeA++]+="-------------------";
       
                String[] y = s11.getValue().toArray(new String[0]);
                Arrays.sort(y, new Comparator<String>() {

                    public int compare(String s1, String s2) {
                        return s1.toLowerCase().compareTo(s2.toLowerCase());
                    }
                });


                for (int j = 0; j < y.length; j++) {
                   // System.out.println("\t\t\t" + y[j]);
                     /*if(res[sizeA]==null)res[sizeA]="                    ";
                     res[sizeA++]+=y[j]+"                   ";*/
                     
                     if(res[sizeA]==null)res[sizeA]="                     ";
                else res[sizeA]+=spaces.substring(0, 21-res[sizeA].length()); 
                    res[sizeA]+="  "+y[j];
                    res[sizeA]+=spaces.substring(0, 40-res[sizeA++].length());
                }
            }
           // for(int i=0;i<)

            size= size<sizeA?sizeA:size;
            String[] respuesta = new String[size];
        for(int i=0;i<size;i++){
            //System.out.println(res[i]+" **"+res[i].length());
            respuesta[i]=res[i];
            if(respuesta[i].length()<40)respuesta[i]+=spaces.substring(0, 40-respuesta[i].length());
        }
              
        return respuesta;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(Glossary.class, "test.*");
    }

	public void test0() {
		RETester.eq(buildGlossary(new String[] {
			"Canada", "France", "Germany", "Italy", "Japan", "Russia", 
			"United Kingdom", "United States"}),
			new String[] {"C                    R                  ", "-------------------  -------------------", "  Canada               Russia           ", "F                    U                  ", "-------------------  -------------------", "  France               United Kingdom   ", "G                      United States    ", "-------------------                     ", "  Germany                               ", "I                                       ", "-------------------                     ", "  Italy                                 ", "J                                       ", "-------------------                     ", "  Japan                                 " });
	}

	public void test1() {
		RETester.eq(buildGlossary(new String[] {"alpha", "beta", "gamma", "delta", "omega"}), new String[] {"A                    O                  ", "-------------------  -------------------", "  alpha                omega            ", "B                                       ", "-------------------                     ", "  beta                                  ", "D                                       ", "-------------------                     ", "  delta                                 ", "G                                       ", "-------------------                     ", "  gamma                                 " });
	}

	public void test2() {
		RETester.eq(buildGlossary(new String[] {"AVL tree", "backtracking", "array", "balanced tree", "binary search"}), new String[] {"A                                       ", "-------------------                     ", "  array                                 ", "  AVL tree                              ", "B                                       ", "-------------------                     ", "  backtracking                          ", "  balanced tree                         ", "  binary search                         " });
	}

	public void test3() {
		RETester.eq(buildGlossary(new String[] {
			"XXXXXXXXXXXXXXXXX", 
			"YYYYYYYYYYYYYYYYY",
			"ZZZZZZZZZZZZZZZZZ"}),
			new String[] {"                     X                  ", "                     -------------------", "                       XXXXXXXXXXXXXXXXX", "                     Y                  ", "                     -------------------", "                       YYYYYYYYYYYYYYYYY", "                     Z                  ", "                     -------------------", "                       ZZZZZZZZZZZZZZZZZ" });
	}

	public void test4() {
		RETester.eq(buildGlossary(new String[] {
			"Asteria", "Astraeus", "Atlas", "Clymene", "Coeus", "Crius", 
			"Cronus", "Dione", "Epimetheus", "Helios", "Hyperion", "Iapetus", 
			"Leto", "Mnemosyne", "Oceanus", "Ophion", "Phoebe", "Prometheus", 
			"Rhea", "Tethys", "Theia", "Themis"}),
			new String[] {"A                    O                  ", "-------------------  -------------------", "  Asteria              Oceanus          ", "  Astraeus             Ophion           ", "  Atlas              P                  ", "C                    -------------------", "-------------------    Phoebe           ", "  Clymene              Prometheus       ", "  Coeus              R                  ", "  Crius              -------------------", "  Cronus               Rhea             ", "D                    T                  ", "-------------------  -------------------", "  Dione                Tethys           ", "E                      Theia            ", "-------------------    Themis           ", "  Epimetheus                            ", "H                                       ", "-------------------                     ", "  Helios                                ", "  Hyperion                              ", "I                                       ", "-------------------                     ", "  Iapetus                               ", "L                                       ", "-------------------                     ", "  Leto                                  ", "M                                       ", "-------------------                     ", "  Mnemosyne                             " });
	}

// END CUT HERE
}
