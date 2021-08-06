
package test;

import dominio.Persona;
import dominio.jDiscapacidad;
import dominio.jPatronal;
import dominio.jVejez;
import dominio.listaPersonas;
import java.util.Scanner;


public class testJubilacion {

    public static void main(String[] args) {
        String cedula, nombre; 
        float salario;
        int anios;
        listaPersonas lista = new listaPersonas();
        int opcion;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("\nMenu");
            System.out.println("1.- Ingresar jubilado por vejez");
            System.out.println("2.- Ingresar jubilado por discapacidad");
            System.out.println("3.- Ingresar jubilado patronal");
            System.out.println("4.- Mostrar reporte de todos");
            System.out.println("5.- Salir");
            System.out.println("Ingrese la opcion que desea: ");
            opcion = Integer.parseInt(scan.nextLine());
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese la cedula");
                    cedula = scan.nextLine();
                    System.out.println("Ingrese los nombres");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese el salario de la persona");
                    salario = Float.parseFloat(scan.nextLine());
                    System.out.println("Ingrese los anios de servicio");
                    anios = Integer.parseInt(scan.nextLine());
                    Persona persona = new jVejez(cedula, nombre, salario, anios);
                    lista.adicionarPersona(persona);
                    break;
                }
                case 2:{
                    float dis;
                    System.out.println("Ingrese la cedula");
                    cedula = scan.nextLine();
                    System.out.println("Ingrese los nombres");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese el salario de la persona");
                    salario = Float.parseFloat(scan.nextLine());
                    System.out.println("Ingrese los anios de servicio");
                    anios = Integer.parseInt(scan.nextLine());
                    System.out.println("Ingrese el porcentja de discapacidad");
                    dis = Float.parseFloat(scan.nextLine());
                    Persona persona = new jDiscapacidad(dis, cedula, nombre, salario, anios);
                    lista.adicionarPersona(persona);
                    break;
                }
                case 3:{
                    float patronal;
                    String empresa;
                    System.out.println("Ingrese la cedula");
                    cedula = scan.nextLine();
                    System.out.println("Ingrese los nombres");
                    nombre = scan.nextLine();
                    System.out.println("Ingrese el salario de la persona");
                    salario = Float.parseFloat(scan.nextLine());
                    System.out.println("Ingrese los anios de servicio");
                    anios = Integer.parseInt(scan.nextLine());
                    System.out.println("Ingrese el porcentja de inflacion");
                    patronal = Float.parseFloat(scan.nextLine());
                    System.out.println("Ingrese el tipo de empresa");
                    empresa = scan.nextLine();
                    Persona persona = new jPatronal(patronal, empresa, cedula, nombre, salario, anios);
                    lista.adicionarPersona(persona);
                    break;
                }
                case 4:{
                    lista.mostrarLista();
                    break;
                }
                case 5:{
                    System.out.println("Saliendo....");
                    scan.next();
                    break;
                }
                default:{
                    System.out.println("Opcion erronea");
                    System.out.println("");
                    scan.next();
                    break;
                }
            }
        }while(opcion!=5);
    }
    
}


