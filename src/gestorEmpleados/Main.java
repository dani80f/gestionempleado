/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorEmpleados;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Main {

    //Atributos accesibles desde cualquier método
    private static Empleado empleados[];
    private static Scanner sc=new Scanner(System.in);
    
    private static int menu(){
        
      
        
        System.out.println("Selecciona opción del menú");
        System.out.println("1.Introducir datos de los empleados \n"
        
            + "2.Mostrar datos de los empleados \n"
            + "3.Generar nóminA DE LOS EMPLEADOS \n"
            + "4,Salir de la aplicación");
        
        int  op=sc.nextInt();
        return op;
        
        
    }
    
    private static void cargaEmpleados(){
        
        System.out.println("Introduce el número de empleados");
        
        empleados = new Empleado[sc.nextInt()];
        sc.nextLine();
        for (int i =0; i<empleados.length;i++) {
            //Instancio un empleado sin datos en la posición
            empleados[i]=new Empleado();
            System.out.println("Datos del " + i+1 + "empleado");
            System.out.println("Nombre:");
            empleados[i].setNombre(sc.nextLine());
            System.out.println("Apellidos:");
            empleados[i].setApellidos(sc.nextLine());
            System.out.println("DNI:");
            empleados[i].setDni(sc.nextLine());
            System.out.println("Direccion:");
            empleados[i].setDireccion(sc.nextLine());
            System.out.println("Código Postal");
            empleados[i].setCodigoPostal(sc.nextInt());
            sc.nextLine();
            
            System.out.println("Población:");
            empleados[i].setPoblacion(sc.nextLine());
            System.out.println("Provincia");
            empleados[i].setProvincia(sc.nextLine());
            System.out.println("Edad:");
            empleados[i].setEdad(sc.nextInt());
            
            //sc.nextLine();
            System.out.println("Categoría: A.Director B.Tecnico superior C. Tecnico Medio D.Auxiliar");
            String categoriaInput = sc.next();
            char categoria = categoriaInput.charAt(0);
            
          
            empleados[i].setCategoria(categoria);
            
            System.out.println("Número de hijos");
            empleados[i].setNhijos(sc.nextInt());
            sc.nextLine();
        }
        
        
    }
    
     public static void listaEmpleados(){
         
         System.out.println("DATOS DE LOS EMPLEADOS");
         System.out.println("");
         
         for (int i =0;i<empleados.length;i++){
             
             
             System.out.println(empleados[i].toString());
             System.out.println("-----------------------------------");
             
         }
         
         
     }
     
     
     public static void generaNominas(){
         
         System.out.println("DATOS DE LOS EMPLEADOS");
         System.out.println("");
         double nomina=0;
         for (int i =0;i<empleados.length;i++){
             
             
             System.out.println(empleados[i].toString());
             System.out.println("-----------------------------------");
             nomina=empleados[i].sueldoBase()-(empleados[i]. retencionIrpf()*empleados[i].sueldoBase()/100);
             System.out.println("El sueldo total es: " + nomina);
             
         }
         
     }
     
    
   
    public static void main(String[] args) {
        
        boolean salir=false;
        do {
             switch (menu()){
            
            case 1:cargaEmpleados();break;
            case 2:listaEmpleados();break;
            case 3:generaNominas();break;
            case 4: salir=true;
            default: System.out.println("Opción no válida");
            
        }
            
        }while (!salir);
       
        
        
    }
    
}
