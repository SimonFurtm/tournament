package htl.ahinf.tournament;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TournamentTest {
    Knight knight = new Knight("Test", "+123", "von junit");
    Tournament testFestival = new Tournament("Test Festival", "Junit");

    @Test
    void tournamantInformation() {
    }

    @Test
    void tournamentBreak() {
    }

    @Test
    void addParticipants() {    //Tests the Exeption
        Assertions.assertThrows(KnightAlreadyExists.class, () ->{
            testFestival.addParticipants(knight);   //There can be multiple knight with the same name, but there can't be an exact copy of a knight
            testFestival.addParticipants(knight);
        });
    }

    @Test
    void removeParticipant() {
    }

    @Test
    void listAllParticipants() {
    }

    @Test
    void participantWithWeaponType() {
    }

    @Test
    void getTournamentName() {
    }

    @Test
    void getHost() {
    }

    @Test
    void getParticipantsCount() {
    }

    @Test
    void getParticipants() {
    }
}