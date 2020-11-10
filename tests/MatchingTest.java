import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatchingTest {

    String p[]=new String[]{"aaa","bbb","ccc"};
    Matching m=new Matching(p);
    String[] repeated=new String[]{"1","1","1"};
    @Test
    void matching() {
        String s= JOptionPane.showInputDialog(null,Arrays.toString(m.Inc));
        String[] j=s.split(" ");
        assertEquals("Please try again",m.matching(repeated));
        assertEquals("Correct",m.matching(j));
    }
}