import java.util.*;

public class CorporationSalary {
    public long totalSalary(String[] relations) {
        long res=0;
        int[] salari = new int[relations.length];
       Arrays.fill(salari, -1);
        for(int w=0;w<relations.length;w++)
        {
        for(int i=0;i<relations.length;i++) if(salari[i]<0)
        {
            boolean raso = true;
                
            for(int j=0;j<relations[0].length() && raso;j++) 
            {
                if(relations[i].charAt(j)=='Y' && salari[j]<0)
                    raso=false;
                
                
            }
            
            if(raso)
                {
                    salari[i]=0;
                    //System.out.println("ffffff"+i);
                    for(int h=0;h<relations.length;h++)
                        if(relations[h].charAt(i)=='Y')
                            salari[h]+=salari[i];
                    if(salari[i]==0)salari[i]++;
                }
        }
    }
        
        for(int i=0;i<relations.length;i++)
            res+=salari[i];
        return res;
    }
    
   
/*
    public class CorporationSalary {

        List<Integer> sort;
        boolean[] visited;
        boolean[][] adj;
        long[] salary;
        int N;

        void dfs(int s) {
            visited[s] = true;
            for (int i = 0; i < N; ++i) {
                if (!visited[i] && adj[s][i]) {
                    dfs(i);
                }
            }
            sort.add(s);
        }

        void topsort() {
            sort = new ArrayList<Integer>();
            visited = new boolean[N];
            for (int i = 0; i < N; ++i) {
                if (!visited[i]) {
                    dfs(i);
                }
            }
        }

        public long totalSalary(String[] relations) {
            N = relations.length;
            adj = new boolean[N][N];
            salary = new long[N];
            long res = 0;

            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    if (relations[i].charAt(j) == 'N') {
                        adj[i][j] = false;
                    } else {
                        adj[i][j] = true;
                    }
                }
            }
            topsort();

            for (int i = 0; i < N; ++i) {
                boolean isLeave = true;
                for (int j = 0; j < N; ++j) {
                    if (adj[i][j]) {
                        isLeave = false;
                        break;
                    }
                }
                if (isLeave) {
                    salary[i] = 1;
                }
            }

            for (int x : sort) {
                for (int i = 0; i < N; ++i) {
                    if (adj[x][i]) {
                        salary[x] += salary[i];
                    }
                }
            }

            for (long s : salary) {
                res += s;
            }

            return res;
        }
*/

    

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(CorporationSalary.class, "test.*");
    }

	public void test0() {
		RETester.eq(totalSalary(new String[] {"N"}), 1L);
	}

	public void test1() {
		RETester.eq(totalSalary(new String[] {
			"NNYN",
			"NNYN",
			"NNNN",
			"NYYN"}),
			5L);
	}

	public void test2() {
		RETester.eq(totalSalary(new String[] {
			"NNNNNN",
			"YNYNNY",
			"YNNNNY",
			"NNNNNN",
			"YNYNNN",
			"YNNYNN"}),
			17L);
	}

	public void test3() {
		RETester.eq(totalSalary(new String[] {
			"NYNNYN",
			"NNNNNN",
			"NNNNNN",
			"NNYNNN",
			"NNNNNN",
			"NNNYYN"}),
			8L);
	}

	public void test4() {
		RETester.eq(totalSalary(new String[] {
			"NNNN",
			"NNNN",
			"NNNN",
			"NNNN"}),
			4L);
	}

// END CUT HERE
}
