import  javax.swing.JOptionPane;


public class MainMenu {

    public static void main(String[] args) {
        final String MENU_TEXT="R: Recite poem, O: Play ordering game";
        String[] poem= new String[]{"Near the road it flowered," ,"The mallow—and by my horse",  "Has been devoured!"};
        String author="Matsuo Basho(1684), Rendition by Harold G. Henderson";
        Recite r=new Recite(poem);
        Ordering o=new Ordering(poem);

        while (true)
        {
             String ans=JOptionPane.showInputDialog(null,r.fullpoem()+"-"+author+"\n\n"+MENU_TEXT);
            if(ans==null){break;}
            switch (ans){
                case "R":
                    while (true){
                         String s=JOptionPane.showInputDialog(null,"Enter start and end line numbers to recite (seperate by spaces)");
                        if(s==null){
                            break;
                        }
                        String[] rec=s.split(" ");
                        int st=Integer.parseInt(rec[0]);
                        int fn=Integer.parseInt(rec[1]);
                        JOptionPane.showMessageDialog(null,r.verses(st,fn));
                    }
                    break;
                case "O":
                    o.shuffle();
                    while(true){
                        Recite r1=new Recite(o.Inc);
                        String s=JOptionPane.showInputDialog(null,r1.fullpoem()+"\n Enter correct Line Order numbers (seperate by spaces)");
                        if(s==null){
                            break;
                        }
                        String[] answ=s.split(" ");
                        JOptionPane.showMessageDialog(null,o.matching(answ));
                    }

                    break;
            }

            }
        JOptionPane.showMessageDialog(null,"Bye");
        System.exit(0);
    }

    }



