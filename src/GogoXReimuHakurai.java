import java.util.*;
//SRM 530 Div II 1000
public class GogoXReimuHakurai {
    
     class edges{
        int id;
        ArrayList<Integer> ed = new ArrayList<Integer>();
        edges(int id){
            this.id=id;
        }
    }
     edges[] adj2;
     int[] color;
    
     int res =0;

     public void DFS_Visit2(int x){
         //System.out.print(" ("+x);
         color[x]=1;
         
         for(int i=0;i<adj2[x].ed.size();i++){
             int id=adj2[x].ed.get(i);
             if(id==color.length-1)res++;
             if(color[id]==0)
                 DFS_Visit2(id);
               // else if(color[id]==1)System.out.println(x+" - "+id);
                 
                         
         }
         color[x]=-1;
        
    }
    public int solve(String[] choices) {
        
         
        int n= choices.length;
        adj2 = new edges[n];
        color = new int[n];
        for(int i=0;i<n;i++){
            char[] adja = choices[i].toCharArray();
            
            adj2[i] = new edges(i);
            for(int j=0;j<adja.length;j++)
                if(adja[j]=='Y')
                adj2[i].ed.add(j);
        }
                DFS_Visit2(0);
                
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(GogoXReimuHakurai.class, "test.*");
    }

	public void test0() {
		RETester.eq(solve(new String[] {
			"NYY",
			"NNY",
			"NNN"}),
			2);
	}

	public void test1() {
		RETester.eq(solve(new String[] {
			"NYNY",
			"NNYY",
			"NNNY",
			"NNNN"}),
			3);
	}

	public void test2() {
		RETester.eq(solve(new String[] {
			"NNY"
			,"NNY"
			,"NNN"}),
			1);
	}

	public void test3() {
		RETester.eq(solve(new String[] {
			"NN"
			,"NN"}),
			0);
	}

// END CUT HERE
}
