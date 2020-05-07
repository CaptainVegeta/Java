
public class RennSchnecke {

    public String name;
    public String rasse;
    public float maximalgeschwindigkeit;
    public float zurueckgelegteStrecke;
    public static int counter = 0;

    public RennSchnecke(String name, String rasse, int maximalgeschwindigkeit, int zurueckgelegteStrecke){
        counter += 1;
        this.name = name+counter;
        this.rasse = rasse;
        this.maximalgeschwindigkeit = maximalgeschwindigkeit;
        this.zurueckgelegteStrecke = zurueckgelegteStrecke;
    }

    public void krieche(){
        zurueckgelegteStrecke = getRandom(0.1f, maximalgeschwindigkeit);
    }

    public float getRandom(float min, float max){
        return min + (float)(Math.random() * ((max - min) + 1));
    }

    public String getData(){
        return (name+" "+rasse+" "+maximalgeschwindigkeit+" "+zurueckgelegteStrecke);
    }
}