/**
 * Radio
 */
public class Radio {
        
    public boolean on;
    public int volume;
    public float frequency;

    public Radio(float startFrequenz){
         frequency = startFrequenz;
    }

    public Radio(){
        frequency = 111.11f;
   }

    public void volumeUP(){
        if (Battery.use()) {
            //mach weiter
        } else {
            return;
        }

        if (volume <= 95){
            volume += 5;
        }
    }

    public void volumeDown(){
        if (Battery.use()) {
            //mach weiter
        } else {
            return;
        }

        if (volume >= 5){
            volume -= 5;
        }
    }

    public void setOn(){
        if (Battery.use()) {
            //mach weiter
        } else {
            return;
        }

        on = true;
        System.out.println("an");
    }

    public void setOff(){
        Battery.use();

        on = false;
        System.out.println("aus");
    }

    public void setFrequency(float new_frequency){
        if (Battery.use()) {
            //mach weiter
        } else {
            return;
        }

        frequency = new_frequency;
    }

    public String toString(){
        Battery.use();

        String an_aus;
        if (on) {
            an_aus = "an";
        } else {
            an_aus = "aus";
        }
        String ausgabe = "Radio "+an_aus+", Frequenz = "+frequency+", Lautstärke = "+volume+", Batterie = "+Battery.charge;
        return ausgabe;
    }
}