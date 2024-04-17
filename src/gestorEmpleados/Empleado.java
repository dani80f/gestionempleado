/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorEmpleados;

/**
 *
 * @author Daniel
 */
public class Empleado {
    
    
    //Atributos
    
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private int codigoPostal;
    private String poblacion;
    private String provincia;
    private int  edad;
    private char categoria;
    private int nhijos;
    private int nIngles;
    private int antiguedad;
    

    //Constructores

    public Empleado(String nombre, String apellidos, String dni, String direccion, int codigoPostal, String poblacion, String provincia, int edad, char categoria, int nhijos, int nIngles, int antiguedad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.edad = edad;
        this.categoria = categoria;
        this.nhijos = nhijos;
        this.nIngles = nIngles;
        this.antiguedad = antiguedad;
    }

    public Empleado(String nombre, String apellidos, String dni, String direccion, int codigoPostal, String poblacion, String provincia, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.edad = edad;
    }

    public Empleado() {
    }
    
    
    
    
    //métodos del empleado
    
    public String categoria(){
        
        String cat="";
        switch (this.categoria){
            
            case 'A': cat="Director"; break;
            case 'B': cat="Tecnico Superior";break;
            case 'C': cat="Tecnico Medio";break;
            case 'D': cat="Auxiliar";break;
            
        }
        
        return cat;
        
        
    }
    
     public double sueldoBase(){
        
        double plus=1;
        double sueldo=1;
        
        if(this.antiguedad>=5){
            
            plus=1.1;
            
        }
        
        switch (this.categoria){
            
            case 'A': sueldo=2500; break;
            case 'B': sueldo=2000;break;
            case 'C': sueldo=1500;break;
            case 'D': sueldo=1000;break;
            
        }
        
        return sueldo*plus;
        
        
    }
    
     
     public int retencionIrpf(){
         
         int ret=0;
         
         if(this.nhijos>=2){
             
             ret=14;
             
         }else if(this.nhijos==1){
               ret=16;
         }else{
             
             ret=18;
             
         }
         
         return ret;  
         
     }
     
     public String nivelIngles(){
         
         String nivel="";
         
          switch (this.nIngles){
            
            case 1: nivel="Inicial"; break;
            case 2: nivel="Medio";break;
            case 3: nivel="Avanzado";break;
            default:nivel = "No registrado";
            
        }
         
         return nivel;
     }
     
     public String toString(){
         
         String datos=" Nombre: "+ this.nombre + "Apellidos: " + this.apellidos
         + "\n DNI:" + this.dni+ "\n Direccion " + this.direccion
         +"\n  C.P." + this.codigoPostal + "Provincia " + this.provincia + "Población" + this.poblacion;
         
         return datos;
     }
     
     
  
    //geters && setters

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getEdad() {
        return edad;
    }

    public char getCategoria() {
        return categoria;
    }

    public int getNhijos() {
        return nhijos;
    }

    public int getnIngles() {
        return nIngles;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    
    
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public void setNhijos(int nhijos) {
        this.nhijos = nhijos;
    }

    public void setnIngles(int nIngles) {
        this.nIngles = nIngles;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
     
     
    
    
}
