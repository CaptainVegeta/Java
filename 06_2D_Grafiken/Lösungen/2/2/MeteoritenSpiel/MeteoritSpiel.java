import java.util.concurrent.TimeUnit;

public class MeteoritSpiel
{   
    public static void main(String[] args){
        Stage stage = new Stage();
        while(true){
            stage.update();
            SimplifiedDelay.delay(10);
            
            // Beende Endlos-Schlaufe sobald das Fenster geschlossen wurde
            if(!stage.isVisible()){
                break;
            }
        }
    }
}
