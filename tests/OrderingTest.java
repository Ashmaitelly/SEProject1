import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OrderingTest {

    String p[]=new String[]{"aaa","bbb","ccc"};
    Ordering o =new Ordering(p);
    String[] repeated=new String[]{"1","1","1"};
    @Test
    void matching() {
        o.shuffle();
        String s= JOptionPane.showInputDialog(null,Arrays.toString(o.Inc));
        String[] j=s.split(" ");
        assertEquals("Please try again", o.matching(repeated));
        assertEquals("Correct", o.matching(j));
    }
}