public class ParentExtender extends Parent{

    public static int counter = 0;

    public void doIt(){
        counter += 1;
        System.out.println(counter);
    }
    
}