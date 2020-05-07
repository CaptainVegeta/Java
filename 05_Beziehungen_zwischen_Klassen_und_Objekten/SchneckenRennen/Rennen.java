
public class Rennen extends Rennstruktur{

    public String name;
    public int anzahlTeilnehmer;
    public RennSchnecke[] teilnehmer = new RennSchnecke[anzahlTeilnehmer];
    public float streckenLaenge;

    public Rennen(){
        name = "Hockenheim";
        anzahlTeilnehmer = 3;
        streckenLaenge = 20.5f;
    }

    public int counter = 0;
    public void addRennschnecke(RennSchnecke neue_RennSchnecke){
        while(counter < teilnehmer.length){
            teilnehmer[counter] = neue_RennSchnecke;
            counter += 1;
        }
    }

    public void removeRennschnecke(String name){

    }

    public String getData(){
        return name+" "+anzahlTeilnehmer+" "+streckenLaenge;
    }
    
    public void getDataTeilnehmer(){
        for(int i = 0; i<teilnehmer.length; i++){
            String schnecke = (teilnehmer[i].name+" "+teilnehmer[i].rasse+" "+teilnehmer[i].maximalgeschwindigkeit+" "+teilnehmer[i].zurueckgelegteStrecke);
            System.out.println(schnecke);
        }
    }
}