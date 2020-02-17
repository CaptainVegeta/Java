/**
 * Person
 */
public class Person {

    public String name;
    public int alter;
    public float groesse;

    public Person(String name, int alter, float groesse){
        this.name = name;
        this.alter = alter;
        this.groesse = groesse;
    }


    public void aendereAttribute(String aName, int anAge, float aTalleness){
        name = aName;
        alter = anAge;
        groesse = aTalleness;

        System.out.println("Diese Person heisst: "+name+", ist: "+alter+" alt und die Groesse beträgt: "+groesse);
    }
}