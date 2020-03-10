/**
 * House
 */
public class House {

    public static void main(String[] args) {
        Radio radio1 = new Radio();
        Radio radio2 = new Radio(99.99f);

        printOut(radio1.frequency);
        printOut(radio2.frequency);
        System.out.println("*****");

        /**
         * 1. Starten Sie das Radio.
            2. Stellen Sie die Frequenz 102.8 ein.
            3. Erhöhen Sie die Lautstärke zwei mal.
            4. Geben Sie den internen Zustand des Radios an die Konsole aus.
            5. Stellen Sie das Radio wieder aus.
         */
        radio1.setOn();
        radio1.setFrequency(102.8f);
        radio1.volumeUP();
        radio1.volumeUP();
        radio1.volumeUP();
        System.out.println(radio1.toString());
        radio1.setOff();

        radio1.volumeDown();
        radio1.volumeDown();
        radio1.setFrequency(77.77f);
        System.out.println(radio1.toString()); 


        /**
        radio1.on = true;
        radio1.frequency = 98.9f;
        radio1.volume = 6;

        printOut(radio1.on);
        printOut(radio1.frequency);
        printOut(radio1.volume);
        */
    }

    public static void printOut(boolean anAus){
        System.out.println(anAus);
    }

    public static void printOut(float frequenz){
        System.out.println(frequenz);
    }

    public static void printOut(int lautstaerke){
        System.out.println(lautstaerke);
    }
}