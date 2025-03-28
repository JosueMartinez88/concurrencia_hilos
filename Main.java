//Martínez Vera Josué Aldair
//Solís Contreras Darian Giselle

package Hilos;


public class Main {
    public static void main(String[] args) {
        //Le decimos al usuario cual es la función del programa
        System.out.println("Este programa funciona por 2 hilos, uno comienza en 0"
                + " y va de 2 en 2 hasta llegar a 100 y otro comienza de 99 y"
                + " va de -2 en -2 hasta llegar a 1");
        
        
        //Instanciamos un objeto de la clase Hilo_1
        Hilo_1 hilo_1 = new Hilo_1();
        //Instanciamos un objeto de la clase Hilo_2
        Hilo_2 hilo_2 = new Hilo_2();
        
        
        //A cada objeto vamos a usar el método start, ya que este hará que el hilo comienze a funcionar
        hilo_1.start();
        hilo_2.start();
        
    }
}
