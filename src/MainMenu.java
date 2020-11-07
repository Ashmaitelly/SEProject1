import  javax.swing.JOptionPane;


public class MainMenu {

    public static void main(String[] args) {
        final String MENU_TEXT="R: Recite poem";
        String[] poem= new String[]{"Near the road it flowered," ,"the mallow—and by my horse",  "has been devoured!",};
        String author="Matsuo Basho(1684), Rendition by Harold G. Henderson";
        Recite r=new Recite(poem);

        while (true)
        {
             String ans=JOptionPane.showInputDialog(null,r.fullpoem()+"-"+author+"\n\n"+MENU_TEXT);
            if(ans==null){break;}
            switch (ans){
                case "R":
                    while (true){
                         String s=JOptionPane.showInputDialog("Enter start and end line numbers to recite (seperate by spaces)");
                        if(s==null){
                            break;
                        }
                        String[] rec=s.split(" ");
                        int st=Integer.parseInt(rec[0]);
                        int fn=Integer.parseInt(rec[1]);
                        JOptionPane.showMessageDialog(null,r.verses(st,fn));
                    }
                    break;

            }

            }
        JOptionPane.showMessageDialog(null,"Bye");
    }

    }



