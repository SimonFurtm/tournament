package htl.ahinf.tournament;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {

    Knight knight = new Knight("Test", "+123", "von junit");

    @Test
    void testToString() {

    }

    @Test
    void addScarce() {
        knight.addScarce("Testscarce","+132",5);
        assertEquals("Scarce:\n" +
                "\t\tname = Testscarce\n" +
                "\t\tphoneNr = +132\n" +
                "\t\ttraining = 15;",knight.getKnightsScarce().toString());
    }

    @Test
    void addWeapon() {
        knight.addWeapon("Testwaffe",'s',"V");
        assertEquals("Sword:\n" +
                "\t\tdescription= Testwaffe\n" +
                "\t\ttype= s\n" +
                "\t\tproperty= V;",knight.getKnightsWeapon().toString());

    }

    @Test
    void getNickname() {
    }

    @Test
    void getKnightsScarce() {
    }

    @Test
    void getKnightsWeapon() {
    }

    @Test
    void getWeaponType() {
    }
}