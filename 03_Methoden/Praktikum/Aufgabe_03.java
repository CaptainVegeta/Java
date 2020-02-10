public class Aufgabe_03{

    public static void kreisRechner(int r, int x, int y){
        boolean ist_im_kreis = false;


        int r_2 = (int) Math.pow(r, 2);
        int x_2 = (int) Math.pow(x, 2);
        int y_2 = (int) Math.pow(y, 2);

        if( r_2 >= x_2 + y_2){
            ist_im_kreis = true;
        }
        else{
            ist_im_kreis = false;
        }

        System.out.println("Die Koordinaten liegen im Kreis = "+ist_im_kreis);
    }

    public static void kreisRechnerArray(){
        System.out.println("Die Kreisgleichung im Koordinatensystem lautet= r^2=x^2+y^2");
        int kreiswerte_array [][] = {{4,2,3}, {3,2,3}, {3,-2,1}, {7,-3,-4}, {7,-4,-6}};

        for(int i = 0; i < kreiswerte_array.length; i++){
            System.out.println(kreiswerte_array[i][0] +", "+ kreiswerte_array[i][1] +", "+ kreiswerte_array[i][2]);
            kreisRechner(kreiswerte_array[i][0], kreiswerte_array[i][1], kreiswerte_array[i][2]);
        }
    }
}