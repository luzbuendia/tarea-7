package clase2;

import javax.swing.JOptionPane;


public class MultiDeMatriz 
{
  public int matriz1[][];
  public int matrizQ[][]; 
  public int fila;
  public int columna;
  public int valores;
  public int resulDeLaMatriz3[][];

 public MultiDeMatriz()
 {
  fila=Integer.parseInt(JOptionPane.showInputDialog("ingresar fila de las matrices" ));
  columna=Integer.parseInt(JOptionPane.showInputDialog("ingresar columna de las matrices " ));
  this.matriz1= new int [fila][columna];
  fila=Integer.parseInt(JOptionPane.showInputDialog("ingresar fila de las matricesQ" ));
  columna=Integer.parseInt(JOptionPane.showInputDialog("ingresar columna de las matricesQ " ));
  this.matrizQ= new int [fila][columna];
  this.resulDeLaMatriz3= new int[fila][columna];
    
    
  }
  public void agregarMatriz1()
  {
    for(int fila=0; fila < this.matriz1.length;fila++)
    {
      for(int columna=0; columna < this.matriz1.length; columna++)
      {
        this.valores=Integer.parseInt(JOptionPane.showInputDialog("ingresar los numeros de a["+fila+"]["+columna+"] "+" de la matriz1"));
        this.matriz1[fila][columna]=this.valores;
      }
      
    }
  }
  public void mostrarMatriz1()
  {

     for(int fila=0; fila < this.matriz1.length;fila++)
     {
      for(int columna=0; columna < this.matriz1.length; columna++)
      {
        System.out.printf(this.matriz1[fila][columna]+" ");
      } 
      System.out.println(); 
     }
  } 
 public void agregarMatrizQ()
 {
   for(int fila=0; fila < this.matrizQ.length;fila++)
   {
     for(int columna=0; columna< this.matrizQ.length; columna++)
     {
       this.valores=Integer.parseInt(JOptionPane.showInputDialog("ingresar los numeros de a["+fila+"]["+columna+"]"+" de la matrizQ"));
       this.matrizQ[fila][columna]=this.valores;
     }
     
   }
 }
 public void mostrarMatrizQ()
 {

    for(int fila=0; fila < this.matrizQ.length;fila++)
    {
     for(int columna=0; columna< this.matrizQ.length; columna++)
     {
       System.out.print(this.matrizQ[fila][columna]+" ");
     } 
     System.out.println(); 
    }
 }
 public void resulDeLaMatriz3()
 {
    for(int fila=0;fila<this.matriz1.length;fila++)
    {
     for(int columna=0;columna<this.matriz1.length;columna++)
     {
        for ( int r = 0; r <this.matrizQ.length; r++ )
       
        { 
         resulDeLaMatriz3[ fila][columna] = matriz1[fila][r]*matrizQ[r][columna];
        
         System.out.print(this.resulDeLaMatriz3[fila][columna]+" ");
        }
        
      }
      System.out.println();  
    }
  }
 
  public static void main(String[]args)
  {
    MultiDeMatriz matriz1=new MultiDeMatriz();
    matriz1.agregarMatriz1();
    matriz1.mostrarMatriz1();
    matriz1.agregarMatrizQ();
    matriz1.mostrarMatrizQ();
    matriz1.resulDeLaMatriz3();
  }

 
  
 

    
}
