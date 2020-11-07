public class Recite {
    String[] P;
    public Recite(String[] p){
        P=p;
    }
    public String verses(int s,int e){
        String r="";
        for(int i=s;i<=e;i++){
            r+=P[i]+"\n";
        }
        return r;
    }

}
