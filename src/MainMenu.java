import  javax.swing.JOptionPane;

public class MainMenu {

    public static void main(String[] args) {
        final String MENU_TEXT="R: Recite poem, Q: Quit";
        String ans=new String();
        while (!ans.equals("Q"))
        {
            ans=JOptionPane.showInputDialog(MENU_TEXT);
        }
    }
}
