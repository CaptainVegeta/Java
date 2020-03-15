/**
 * Testings
 */

import java.net.InetAddress;

public class Testings {

    public static void main(String[] args) throws Exception {
        
        String ipAdresse = "google.ch";
        int timeout = 500;

        InetAddress ip_numerisch = InetAddress.getByName(ipAdresse);
        boolean ipErreichbar =ip_numerisch.isReachable(timeout);
        System.out.println("Die IP ist erreichbar: "+ipErreichbar);

        String [] listeMitIps = {"20min.ch", "nzz.ch", "init7.net", "lalalalalala.ch", "amazon.com", "8.8.8.8", "4.4.4.4"};
        ipTester(listeMitIps);
    }

    public static void ipTester(String [] ipListe) throws Exception{
        boolean ipErreicht;

        for (int i = 0; i < ipListe.length; i++) {
            ipErreicht = InetAddress.getByName(ipListe[i]).isReachable(250);
            System.out.println("Die IP " + InetAddress.getByName(ipListe[i]) +" ist erreichbar: "+ipErreicht);
        }
    }
}