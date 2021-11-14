package htl.ahinf.tournament;

public class Manager {
    //konsolenbeispiel
    public static void main(String[] args) {

        //erzeugt neues festival
        Tournament fallFestival = new Tournament("Fall Festival", "Uther Pendragon, King of Camelot");
        //ritter hinzufügen
        Knight one = new Knight("Arthur Pendragon","0650 123456","Crownprince of Camelot");
        Knight two = new Knight("Sir. Lancelot","0650 123132","The Brave");

        //knappen und schwerter zu rittern hinzufügen
        one.addScarce("Merlin", "0650 696969",15);
        one.addWeapon("Longsword",'s',"V");
        two.addWeapon("Festival Lance",'l',"III");

        fallFestival.tournamantInformation();
        fallFestival.tournamentBreak();

        //ritter schon vorhanden exeptions
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

        //alle teilnehmer auflisten
        fallFestival.listAllParticipants();
        fallFestival.tournamentBreak();
        //auflistung der teilnehmer mit waffentyp l(lance)
        fallFestival.participantWithWeaponType('l');
        fallFestival.tournamentBreak();

        //ritter aus tournier entfernen
        fallFestival.removeParticipant(one);
        fallFestival.tournamentBreak();

    }
}
