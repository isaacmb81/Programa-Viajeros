import java.util.Scanner;
public class Ejercicioviajes {
    public static void main(String[] args) {
        Scanner escaneo = new Scanner(System.in);
        int numeroviajeros = 0;
        double devolucion1;
        double devolucion2;
        double devolucion3;
        double devolucion4;
        double devolucion5;
        double totalcoste;
        double suma1=0;
        double suma2=0;
        double suma3=0;
        double suma4=0;
        double suma5=0;
        double totalviaje;
        System.out.println("Dime cuanto a pagado el viajero 1: ");
        double viajero1 = escaneo.nextDouble();
        if (viajero1==-1){
            suma1=0;
        }
        else {
            numeroviajeros=numeroviajeros+1;
            suma1=viajero1;
        }
        System.out.println("Dime cuanto a pagado el viajero 2: ");
        double viajero2 = escaneo.nextDouble();
        if (viajero2==-1){
            suma2=0;
        }
        else {
            numeroviajeros=numeroviajeros+1;
            suma2=viajero2;
        }
        System.out.println("Dime cuanto a pagado el viajero 3: ");
        double viajero3 = escaneo.nextDouble();
        if (viajero3==-1){
            suma3=0;
        }
        else {
            numeroviajeros=numeroviajeros+1;
            suma3=viajero3;
        }
        System.out.println("Dime cuanto a pagado el viajero 4: ");
        double viajero4 = escaneo.nextDouble();
        if (viajero4==-1){
            suma4=0;
        }
        else {
            numeroviajeros=numeroviajeros+1;
            suma4=viajero4;
        }
        System.out.println("Dime cuanto a pagado el viajero 5: ");
        double viajero5 = escaneo.nextDouble();
        if (viajero5==-1){
            suma5=0;
        }
        else {
            numeroviajeros=numeroviajeros+1;
            suma5=viajero5;
        }


        totalviaje=suma1+suma2+suma3+suma4+suma5;
        totalcoste= totalviaje/numeroviajeros;


        if (viajero1>=totalcoste){
            devolucion1=viajero1-totalcoste;
            System.out.println("Al viajero 1 le deben: "+devolucion1);
            System.out.println("---------------------------------------");
        }
        else{
            if (viajero1==-1){
                System.out.println("El viajero 1 no ha ido");
                System.out.println("---------------------------------------");

            }
            else{
            devolucion1=totalcoste-viajero1;
            System.out.println("El viajero 1 debe pagar: "+devolucion1);
            System.out.println("---------------------------------------");}
        }


        if (viajero2>=totalcoste){
            devolucion2=viajero2-totalcoste;
            System.out.println("Al viajero 2 le deben: "+devolucion2);
            System.out.println("---------------------------------------");
        }
        else{
            if (viajero2==-1){
                System.out.println("El viajero 2 no ha ido");
                System.out.println("---------------------------------------");

            }
            else{
            devolucion2=totalcoste-viajero2;
            System.out.println("El viajero 2 debe pagar: "+devolucion2);
            System.out.println("---------------------------------------");
        }}


        if (viajero3>=totalcoste){
            devolucion3=viajero3-totalcoste;
            System.out.println("Al viajero 3 le deben: "+devolucion3);
            System.out.println("---------------------------------------");
        }
        else{
            if (viajero3==-1){
                System.out.println("El viajero 3 no ha ido");
                System.out.println("---------------------------------------");

            }
            else{
            devolucion3=totalcoste-viajero3;
            System.out.println("El viajero 3 debe pagar: "+devolucion3);
            System.out.println("---------------------------------------");
        }}


        if (viajero4>=totalcoste){
            devolucion4=viajero4-totalcoste;
            System.out.println("Al viajero 4 le deben: "+devolucion4);
            System.out.println("---------------------------------------");
        }
        else{
            if (viajero4==-1){
                System.out.println("El viajero 4 no ha ido");
                System.out.println("---------------------------------------");

            }
            else{
            devolucion4=totalcoste-viajero4;
            System.out.println("El viajero 4 debe pagar: "+devolucion4);
            System.out.println("---------------------------------------");
        }}
        if (viajero5>=totalcoste){
            devolucion5=viajero5-totalcoste;
            System.out.println("Al viajero 5 le deben: "+devolucion5);
            System.out.println("---------------------------------------");
        }
        else{
            if (viajero5==-1){
                System.out.println("El viajero 5 no ha ido");
                System.out.println("---------------------------------------");

            }
            else{
            devolucion5=totalcoste-viajero5;
            System.out.println("El viajero 5 debe pagar: "+devolucion5);
            System.out.println("---------------------------------------");
        }}

        System.out.println("El total del viaje es: "+totalviaje);
        System.out.println("El número de viajeros es: "+numeroviajeros);
        System.out.println("Cada Viajero debe de pagar: "+totalcoste);
}
}