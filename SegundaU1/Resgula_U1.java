package SegundaU1;

import java.util.ArrayList;
import java.util.Scanner;


public class Regula_U1 {
    ArrayList Lista= new ArrayList();
    Scanner leer =new Scanner(System.in);
    int Arreglo[];
    int num,dato,num2,i;
     boolean respuesta= true;
    String respuesta1;
    public static void main(String[] args){
    Regula_U1 obj=new Regula_U1();
     obj.IngresarDatos();
    obj.MostrarArreglo();
    obj.PasarAlista();
    obj.MostrarLista();
    }
    
    public void IngresarDatos(){
        System.out.println("DE CUANTOS NUMERO QUIERES EL ARREGLO");
        num=leer.nextInt();
        Arreglo=new int[num];
        for(int i=0;i<Arreglo.length;i++){
            System.out.println("DIGITAME NUMEROS PARA EL ARREGLO");
            dato=leer.nextInt();
            Arreglo[i]=dato;
        
        }
    }
    
    public void MostrarArreglo(){
        System.out.println("LOS DATOS QUE CONTIENE EL ARREGLO SON:");
   for(int i=0;i<Arreglo.length;i++){
       System.out.println(" ["+Arreglo[i]+" ]");
   
    }
  }
    
   public void PasarAlista(){
      
      
      
 
                while(respuesta==true){
                    for(int i=0;i<Arreglo.length;i++){
           
           num2=Arreglo[i];
           Lista.add(num2);}
                    
                System.out.println("DESEAS INGRESAR MAS DATOS SI /NO");
                respuesta1=leer.next();
               if(!respuesta1.equals("NO")){
           System.out.println("DIGITAME NUMEROS PARA EL LA LISTA");
            dato=leer.nextInt();
         
    Lista.add(dato);
               }
               respuesta=false;
           }
       }
           
      

 
           
           
   public ArrayList MostrarLista(){
       for(int i=0;i<Arreglo.length;i++){
        System.out.println(Lista);
    }
        return Lista;
   }
       }
   
 

