
//Martínez Vera Josué Aldair
//Solís Contreras Darian Giselle

package Hilos;

//importamos los metodos de la clase util para poder hacer uso de la excepción
import java.util.logging.Level;
import java.util.logging.Logger;

//Martínez Vera Josué Aldair
//Solís Contreras Darian Giselle

//Decimos que nuestra clase va a heredar los metodos de la clase "Thread"
public class Hilo_2 extends Thread{
    
    //Usamos el método "run" de la clase "Thread", para eso tenemos que sobreescribir el método
    @Override
    public void run(){
        //Queremos que esta clase comienze en 99 y termine cuando llegue al 1 y se le resta 2 sucesivamente
        for (int i = 99; i>= 1; i = i - 2){
            //Usamos una try-catch para poder usar el metodo sleep de la clase "Thread" si no se ocupa
            //no nos permite usar el método
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
