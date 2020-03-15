import java.util.concurrent.TimeUnit;

public class ParentFlow
{
    public Parent parent;
    
    public void setParent(Parent new_parent){
        parent = new_parent;
    }
    
    public void start(){
        while(true){
            parent.doIt();
            // Sleep-Methode kann einen Fehler ausgeben (exception). Dadurch wird ein try-catch-Bereich benötigt um zu beschreiben, was in diesem Fehlerfall unternommen werden soll.
            try{
                TimeUnit.SECONDS.sleep(3);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
