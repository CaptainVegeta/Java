import java.awt.event.ActionEvent;


public class ActionErweitern extends SimplifiedListener{

    public void actionPerformed(ActionEvent e) {

        int nummer = pruefeInhalt();
        Felder.textField.setText(String.valueOf(nummer));
    }

    public int pruefeInhalt(){

        String zuTesten = Felder.textField.getText();

        // Only set num to 0 on first try of button
        if (zuTesten.equals("Hallo Welt")) {
            int num;
            return num = 0;
        } else {
            int nummer = Integer.parseInt(Felder.textField.getText());
            return nummer +=1;
        }
    }
}