package pubHerencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Refresco cola= new Refresco("cola" , "Coca-Cola" , 2.5 , 100.0 , 0.5);
        Bebida ginebra= new Bebida("ginebra" , "Ginebra" , 5.0 , 100.0);
        Bebida tonica=new Bebida("tonica" , "Tonica" , 2.0 , 100.0);
        Bebida ron=new Bebida("Ron" , "Ron" , 4.0 , 100.0);
        Combinado combinado=new Combinado(ginebra , tonica);
        //Camarero Paco=new Camarero("Paco" , "Marzo" , 10.0 , 100.0);
        //Mixologo Elena=new Mixologo("Elena", "Enero", 15.0, new ArrayList<>());
        Camarero Paco=new Camarero();
        Paco.setNombre("Paco");
        Mixologo Elena=new Mixologo();
        Elena.setNombre("Elena");
        Elena.setCartaEspecialidades(new ArrayList<>());


        Coctel lagunaAzul=new Coctel("Laguna Azul" , "De la Casa" , 10.0 , 100.0);
        lagunaAzul.getIngredientes().add(cola);
        lagunaAzul.getIngredientes().add(ron);
        Elena.getCartaEspecialidades().add(lagunaAzul);


        Boolean bandera= true;
        do{
            System.out.println("Elige una opcion:");
            System.out.println("1) Pedir un Refresco de Cola a Paco \n" +
                    "2)Pedir un Combinado (Ginebra + Tónica) a Paco \n" +
                    "3)Intentar pedir el Cóctel \"Laguna Azul\" a Paco \n" +
                    "4)Pedir el Cóctel \"Laguna Azul\" a Elena \n" +
                    "5)Cambia el precio base del Ron a 8.0€  \n" +
                    "6)Cerrar el bar. ");
            int opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    Paco.servir(cola);
                    break;
                case 2:
                    Paco.servir(combinado);
                    break;
                case 3:
                    Paco.servir(lagunaAzul);
                    break;
                case 4:
                    Elena.servir(lagunaAzul);
                    break;
                case 5:
                    ron.setPrecioBase(8.0);
                    System.out.println("He cambiado el precio del ron a 8€");
                    break;
                case 6:
                    System.out.println("Bebidas totales servidas esta noche: "+Bebida.getTotalBebidasServidas());
                    System.out.println("Recaudacion total de la caja: "+Bebida.getRecaudacionTotalBar()+"€");
                    System.out.println("Las propinas de paco fueron: "+Paco.getPropinasAcumuladas()+"€");
                    System.out.println("Las propinas de elena fueron: "+Elena.getPropinasAcumuladas()+"€");
                    System.out.println("Cerrando el bar");
                    bandera=false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while(bandera);


    }
}
