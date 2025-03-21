import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static BufferedReader miBuffer = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {

        for (int i =0; i < 100; i++) {
            switch (i){
                case 1:{
                    System.out.println("1");
                    break;
                }
                case 10:{
                    System.out.println("10");
                    break;
                }
                case 20:{
                    System.out.println("30");
                    break;
                }
                case 40:{
                    System.out.println("40");
                    break;
                }
                case 60:{
                    System.out.println("60");
                    break;
                }
            }
        }

        String midato="";
      do {
          try {
              midato=miBuffer.readLine();
              System.out.println("Dato Leido: "+midato);
          } catch (IOException e) {
              throw new RuntimeException(e);
          }
      }while (midato.compareTo("0")!=0);

        System.out.println("Esto lo edito en github");

    }
}
