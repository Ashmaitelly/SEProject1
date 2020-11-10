public class Recite {
    String[] P;
    public Recite(String[] p){
        P=p;
    }
    public String verses(int s,int e){
        String r="";

        for(int i=s-1;i<e;i++){
            r+=P[i]+"\n";
        }
        return r;
    }
    public String fullpoem(){
        return verses(1,P.length);
    }

}
