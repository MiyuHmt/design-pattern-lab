package exercice1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestContexte {

    @Test
    public void testKey() {
        // test contexte avec clé vide
        Contexte c1 = new Contexte();
        c1.addMapValue("Toto", 1);
        int result = c1.getValue("Toto");
        assertEquals("Should be 1",1,result);
    }
}
