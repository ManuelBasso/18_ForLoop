/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e 
restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.*/

public class MyClass {
    public static void main(String args[]) {
      int num=7;
      tabellina(num);
    }
    
    public static void tabellina(int a) {
        for (int i=1; i<=10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}