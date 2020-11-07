import  javax.swing.JOptionPane;

public class MainMenu {

    public static void main(String[] args) {
        final String MENU_TEXT="R: Recite poem, Q: Quit";
        String[] poem= new String[]{"Near the road it flowered," ,"the mallow—and by my horse",  "has been devoured!",};
        String author="Matsuo Basho(1684), Rendition by Harold G. Henderson";
        String ans="";
        Recite r=new Recite(poem);
        while (!ans.equals("Q"))
        {
            ans=JOptionPane.showInputDialog(fullpoem(poem)+"-"+author+"\n"+MENU_TEXT);
            if(ans.equals("R")){
               String[] s=JOptionPane.showInputDialog("Enter Verses to recite separated by spaces").split(" ");

            }
        }
    }
    public static String fullpoem(String[] S){
        String r="";
        for (String s:S) {
            r+=s+"\n";
        }
        return r;
    }

}
