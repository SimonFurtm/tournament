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
        assertEquals("Scarce{name='Testscarce'phoneNr='+132'training=15}",knight.getKnightsScarce().toString());
    }

    @Test
    void addWeapon() {
        knight.addWeapon("Testwaffe",'s',"V");
        assertEquals("Sword{description='Testwaffe', type='s', property='V'}",knight.getKnightsWeapon().toString());

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