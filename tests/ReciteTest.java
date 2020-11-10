import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReciteTest {
    String p[]=new String[]{"aaa","bbb","ccc"};
    Recite r=new Recite(p);
    @Test
    void verses(){
         assertEquals("aaa\n",r.verses(1,1));
        assertEquals("bbb\n",r.verses(2,2));
        assertEquals("ccc\n",r.verses(3,3));
        assertEquals("aaa\nbbb\n",r.verses(1,2));
        assertEquals("bbb\nccc\n",r.verses(2,3));
        assertEquals("aaa\nbbb\nccc\n",r.verses(1,3));
     }
    @Test
    void fullpoem(){
        assertEquals("aaa\nbbb\nccc\n",r.fullpoem());
    }
}