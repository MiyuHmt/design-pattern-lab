package exercice1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestVariable {

    @Test
    public void testVariableCreation() {
        Variable v1 = new Variable("nom");
        assertEquals("Should be nom", "nom", v1.varName);
    }

    @Test
    public void testVarName() {
        // test nom variable
        Variable v2 = new Variable("");
        assertEquals("Should be empty", "", v2.varName);
    }

    @Test
    public void testToString() {
        Variable v3 = new Variable("Toto");
        String titi = v3.toString();
        assertEquals("Should be Toto", "Toto", titi);

    }


}
