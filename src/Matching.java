import java.util.*;

public class Matching {
    String[] Cor;
    String[] Inc;

    LinkedHashSet<Integer> ord =new LinkedHashSet<Integer>();
    public Matching(String[] p){
        Cor=p;
        List<String> inc=new ArrayList<String>();
        while(ord.size()<p.length){

            int num=(int)(Math.random()* p.length);

            ord.add(num);

        }
        Iterator<Integer> it= ord.iterator();
        while (it.hasNext()){
            inc.add(Cor[it.next()]);
        }
        Inc=inc.toArray(new String[0]);
    }
    public String matching(String[] s){
        Boolean match=true;
        for(int i=0; i<s.length;i++){
            int j=Integer.parseInt(s[i]);
            if (!Cor[i].equals(Inc[j-1])){
                match=false;
                break;
            }
        }
        if(match){
            return "Correct";
        }
        else{
            return "Please try again";
        }
    }

}
