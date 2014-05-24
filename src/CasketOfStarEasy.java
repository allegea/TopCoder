import java.util.*;

public class CasketOfStarEasy {
    
    public int max = -1;
    
    public void DFS(int sum, ArrayList<Integer> x){
        
        if(x.size()==2){
            max = Math.max(max,sum);
        }else{
            ArrayList<Integer> aux;
            //System.out.println(x+" - "+sum);
            for(int i=1;i<x.size()-1;i++){
                aux = new ArrayList<Integer>(x);
                int p=aux.get(i-1)*aux.get(i+1);
                aux.remove(i);
                DFS(sum+p,aux);
            }
            
        }
        
    }
    
    public int maxEnergy(int[] weight) {
        
       // boolean[] visited = new boolean[weight.length];
        int res=0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0;i<weight.length;i++)
            numbers.add(weight[i]);
        
        DFS(0,numbers);
        res = max;
        

        
        return res;
    }

}


// Powered by FileEdit
// Powered by RETester [based on ExampleBuilder]
// Powered by CodeProcessor
