package htl.ahinf.tournament;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanceTest {
    Knight knight = new Knight("Test","+123","von junit");

    @Test
    void testToString() {
        knight.addWeapon("TestLance",'l',"I");
        assertEquals("Lance{description='TestLance', type='l', property='I'}",knight.getKnightsWeapon().toString());
    }

    @Test
    void getPiercing() {
        knight.addWeapon("TestLance",'l',"I");
        assertEquals("I",knight.getKnightsWeapon().getProperty());
    }
}