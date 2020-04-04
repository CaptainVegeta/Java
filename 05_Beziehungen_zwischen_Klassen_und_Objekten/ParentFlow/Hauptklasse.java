public class Hauptklasse {

    public static void main(String[] args) {
        
        ParentExtender parentExtender1 = new ParentExtender();
        ParentFlow parentFlow1 = new ParentFlow();

        parentFlow1.setParent(parentExtender1);
        parentFlow1.start();
    }
}