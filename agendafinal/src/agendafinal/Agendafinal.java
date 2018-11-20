/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendafinal;

import java.util.Scanner;

/**
 *
 * @author DRA69
 */
public class Agendafinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opc;
        boolean salir=false;
        Agenda agenda = new Agenda("David");
        while (!salir) {
            Menu.mostrarMenu();
            /*el leer lo pongo aqui para que cada vez que se repita limpie la posicion de memoria */
             Scanner leer= new Scanner(System.in);
             
        
            switch(opc=leer.nextInt()){
                case 1: /*edad nombre telefono solo funciona en case 1*/
                leer= new Scanner(System.in);
                int edad=0;
                String nombre="";
                String telefono="";
                        System.out.println("Añadir Contacto:\n ***********************************************************\n");
                        System.out.println("indique el nombre del Contacto:");
                        nombre=leer.nextLine();
                        System.out.println("indique el numero de telefono del Contacto:");
                        telefono=leer.nextLine();
                        System.out.println("indique la edad del Contacto:");
                        edad=leer.nextInt();
               
                        Persona p = new Persona(nombre, telefono, edad);
                        agenda.añadirPersona(p);
                        System.out.println("Se añadio correctamente");
                    break;
                case 2:
                    leer= new Scanner(System.in);
                    System.out.println("Mostrar Contacto:\n ***********************************************************\n");
                    System.out.println("Indique el nombre del Contacto a buscar");
                     agenda.mostrarPersona(leer.nextLine());
                    break;
                case 3:
                     System.out.println("Mostrar Todos los Contacto:\n ***********************************************************\n");
                    agenda.mostrarTodosPersona();
                    break;
                case 4:
                    leer= new Scanner(System.in);
                     System.out.println("Eliminar Contacto:\n ***********************************************************\n");
                    System.out.println("Indique el nombre del Contacto a Eliminar");
                    agenda.eliminarPersona(leer.nextLine());
                    break;
                case 5:
                    leer= new Scanner(System.in);
                     System.out.println("Mostrar Contacto Mayores de Edad:\n ***********************************************************\n");
                     agenda.contarMayoresEdad();
                    ;
                    break;
                case 6: 
                    leer= new Scanner(System.in);
                    Persona[] vPer;
                    int minima;
                    int maxima;
                    System.out.println("Mostrar Contacto entre las edades:\n ***********************************************************\n");
                    System.out.println("Indique la edad minima,maxima ");
                    minima=leer.nextInt();
                    maxima=leer.nextInt();
                    vPer=agenda.contarRangoEdad(minima, maxima);
                    for (Persona aux:vPer) {
                        if (aux!=null) {
                         System.out.println(aux);   
                        }
                        
                    }
                    break;
                case 0:
                    System.out.println("Adios");
                    salir=true;
                    break;
            }
        }
        
    }
    
}
