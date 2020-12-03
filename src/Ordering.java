import java.util.*;

public class Ordering {
    String[] Cor;
    String[] Inc;


    public Ordering(String[] p){
        Cor=p;

    }
    public String matching(String s){
        String[] answ=s.split(" ");
        boolean match=true;
        for(int i=0; i<answ.length;i++){
            int j=Integer.parseInt(answ[i]);
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
        List<String> inc= new ArrayList<>();
        LinkedHashSet<Integer> ord = new LinkedHashSet<>();
        while(ord.size()<Cor.length){

            int num=(int)(Math.random()* Cor.length);

            ord.add(num);

        }
        for (Integer integer : ord) {
            inc.add(Cor[integer]);
        }
        Inc=inc.toArray(new String[0]);
    }

}
