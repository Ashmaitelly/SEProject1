import java.util.*;

public class Ordering {
    String[] Cor;
    String[] Inc;


    public Ordering(String[] p){
        Cor=p;

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
    public void shuffle(){
        List<String> inc=new ArrayList<String>();
        LinkedHashSet<Integer> ord =new LinkedHashSet<Integer>();
        while(ord.size()<Cor.length){

            int num=(int)(Math.random()* Cor.length);

            ord.add(num);

        }
        Iterator<Integer> it= ord.iterator();
        while (it.hasNext()){
            inc.add(Cor[it.next()]);
        }
        Inc=inc.toArray(new String[0]);
    }

}
