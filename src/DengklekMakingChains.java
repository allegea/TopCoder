import java.util.*;
//SRM 532 Div II 600
public class DengklekMakingChains {
       public int calcular(String chain){
        
        int aux = 0;
        for(int i=0;i<3;i++)
        if(chain.charAt(i)!='.')
            aux+=(chain.charAt(i)-'0');
        
        return aux;
    }
    
    public int maxBeauty(String[] chains) {
        int res = 0;
        ArrayList<Integer> completas = new ArrayList<Integer>();
        ArrayList<Integer> oneIz = new ArrayList<Integer>();
        ArrayList<Integer> oneDer = new ArrayList<Integer>();
        ArrayList<String> lados = new ArrayList<String>();
       
        ArrayList<Integer> center = new ArrayList<Integer>();

        for(int i=0;i<chains.length;i++)
        {
            
            if(chains[i].charAt(0)!='.' && chains[i].charAt(1)!='.' && chains[i].charAt(2)!='.')
                completas.add(calcular(chains[i]));
            if(chains[i].charAt(0)=='.' && chains[i].charAt(1)!='.' && chains[i].charAt(2)!='.')
                oneIz.add(calcular(chains[i]));
            if(chains[i].charAt(0)!='.' && chains[i].charAt(1)!='.' && chains[i].charAt(2)=='.')
                oneDer.add(calcular(chains[i]));
            if(chains[i].charAt(0)=='.' && chains[i].charAt(1)=='.' && chains[i].charAt(2)!='.')
                oneIz.add(calcular(chains[i]));
            if(chains[i].charAt(0)!='.' && chains[i].charAt(1)=='.' && chains[i].charAt(2)=='.')
                oneDer.add(calcular(chains[i]));
            if(chains[i].charAt(0)=='.' && chains[i].charAt(1)!='.' && chains[i].charAt(2)=='.')
                center.add(calcular(chains[i]));
            if(chains[i].charAt(0)!='.' && chains[i].charAt(1)=='.' && chains[i].charAt(2)!='.'){
                
                lados.add(chains[i]);
                
            }
        }
        
       
        Collections.sort(oneIz);
        Collections.sort(oneDer);
        Collections.sort(center);

        if(!completas.isEmpty()){
            
            for(int i=0;i<completas.size();i++)
                res+=completas.get(i);
        }         
        
                     if(!oneDer.isEmpty()){
                
                int j=0;
                int max = -1;
                for(int i=0;i<lados.size();i++){
                    if(lados.get(i).charAt(0)-'0'>max)
                    {
                        j=i;
                        max = lados.get(i).charAt(0)-'0';
                    }  
                }
                if(max >oneDer.get(oneDer.size()-1)){
                    res+=max;
                    lados.remove(j);
                }else res+=oneDer.get(oneDer.size()-1);
                
            }
                     
            if(!oneIz.isEmpty()){
                
                int j=0;
                int max = -1;
                for(int i=0;i<lados.size();i++){
                    if(lados.get(i).charAt(0)-'0'>max)
                    {
                        j=i;
                        max = lados.get(i).charAt(0)-'0';
                    }  
                }
                if(max >oneIz.get(oneIz.size()-1)){
                    res+=max;
                    lados.remove(j);
                }else res+=oneIz.get(oneIz.size()-1);
                
            }
            

                
      
            
         
             if(!center.isEmpty())
                res=Math.max(res, center.get(center.size()-1));
        
        
        return res;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        RETester.test(DengklekMakingChains.class, "test.*");
    }

	public void test0() {
		RETester.eq(maxBeauty(new String[] {".15", "7..", "402", "..3"}), 19);
	}

	public void test1() {
		RETester.eq(maxBeauty(new String[] {"..1", "7..", "567", "24.", "8..", "234"}), 36);
	}

	public void test2() {
		RETester.eq(maxBeauty(new String[] {"...", "..."}), 0);
	}

	public void test3() {
		RETester.eq(maxBeauty(new String[] {"16.", "9.8", ".24", "52.", "3.1", "532", "4.4", "111"}), 28);
	}

	public void test4() {
		RETester.eq(maxBeauty(new String[] {"..1", "3..", "2..", ".7."}), 7);
	}

	public void test5() {
		RETester.eq(maxBeauty(new String[] {"412", "..7", ".58", "7.8", "32.", "6..", "351", "3.9", "985", "...", ".46"}), 58);
	}

// END CUT HERE
}
