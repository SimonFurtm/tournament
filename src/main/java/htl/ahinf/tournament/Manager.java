package htl.ahinf.tournament;

public class Manager {
    public static void main(String[] args) {

        Tournament fallFestival = new Tournament("Fall Festival", "Uther Pendragon, King of Camelot");
        Knight one = new Knight("Arthur Pendragon","0650 123456","Crownprince of Camelot");
        Knight two = new Knight("Sir. Lancelot","0650 123132","The Brave");

        one.addScarce("Merlin", "0650 696969",15);
        one.addWeapon("Longsword",'s',"V");
        two.addWeapon("Festival Lance",'l',"III");

        fallFestival.tournamantInformation();
        fallFestival.tournamentBreak();

        try {
            fallFestival.addParticipants(one);

        }catch (KnightAlreadyExists e){
            System.out.println(e + " is already participating.");
        }
        try {
            fallFestival.addParticipants(one);

        }catch (KnightAlreadyExists e){
            System.out.println(e + " is already participating.");
        }
        try {
            fallFestival.addParticipants(two);

        }catch (KnightAlreadyExists e){
            System.out.println(e + " is already participating.");
        }

        fallFestival.listAllParticipants();
        fallFestival.tournamentBreak();
        fallFestival.participantWithWeaponType('l');

        fallFestival.tournamentBreak();

        fallFestival.removeParticipant(one);
        fallFestival.listAllParticipants();

    }
}
