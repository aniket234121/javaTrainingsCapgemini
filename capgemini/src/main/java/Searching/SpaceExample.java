package Searching;

import java.util.Arrays;

public class SpaceExample {
    public static void main(String[] args) {
       String [][] satellite={{"Sat-01","12:00:01","SIG-AB123"},
               {"Sat-02","12:00:02","SIG-X9873"},
               {"Sat-03","12:00:03","SIG-YY451"},
               {"Sat-04","12:00:04","SIG-ZZ002"},
               {"Sat-05","12:00:05","SIG-X9873"}
               };
       String suspectedSignal="SIG-X9873";
       for(int i=0; i<satellite.length; i++){
           if(satellite[i][satellite[i].length-1].equals(suspectedSignal)){
               System.out.println(Arrays.toString(satellite[i]));
               return;
           }
       }
    }
}
