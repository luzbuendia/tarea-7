package clase1;


import javax.swing.JOptionPane;
public class Matriz
{
  public int matrizA[][];
  public int matrizB[][];
  public int filas;
  public int columnas;
  public int valores;
  public int matrizSuma[][];

  
 public Matriz()
 {
    filas=Integer.parseInt(JOptionPane.showInputDialog("Digita las filas de las matrices"));
    columnas=Integer.parseInt(JOptionPane.showInputDialog("Digita las columnas de las matrices"));
    this.matrizA=new int[filas][columnas];
    this.matrizB=new int[filas][columnas];
    this.matrizSuma=new int[filas][columnas];
    
        
  }
  public void agregarMatrizA()
  {

    for(int filas=0;filas<this.matrizA.length;filas++)
    {
      for(int columnas=0;columnas<this.matrizA.length;columnas++)
     {
      this.valores=Integer.parseInt(JOptionPane.showInputDialog("Digita un número para la posición: a["+filas+"]["+columnas+"]"+" de la matriz A"));
      
      this.matrizA[filas][columnas]=this.valores;
      

     }
   }
  }
  public void mostrarMatrizA()
  {
    for(int filas=0; filas<this.matrizA.length;filas++)
    {
      for(int columnas=0; columnas <this.matrizA.length;columnas++)
      {
        System.out.print(this.matrizA[filas][columnas]+" ");
      } 
      System.out.println(); 
    }
    

  }
  public void agregarMatrizB()
  {
  
    for(int filas=0;filas<this.matrizB.length;filas++)
    {
      for(int columnas=0;columnas<this.matrizB.length;columnas++)
      {
        this.valores=Integer.parseInt(JOptionPane.showInputDialog("Digita un número para la posición: a["+filas+"]["+columnas+"]"+" de la matriz B"));
        
        this.matrizB[filas][columnas]=this.valores;
        
  
      }
    }

  }
  
  public void mostrarMatrizB()
  {
    for(int filas=0; filas <this.matrizB.length;filas++)
    {
      for(int columnas=0; columnas <this.matrizB.length;columnas++)
      {
        System.out.print(this.matrizB[filas][columnas]+" ");
      } 
      System.out.println(); 
    }
    

  }
  public void matrizSuma()
  { 
   for(int filas=0;filas<this.matrizA.length;filas++)
   {
     for(int columnas=0;columnas<this.matrizA.length;columnas++)
     {
       matrizSuma[filas][columnas]=matrizA[filas][columnas]+ matrizB[filas][columnas];                            
       System.out.print(this.matrizSuma[filas][columnas]+" ");
     }
     System.out.println();
   }
    
  }
  public static void main(String[] args)
 {
   Matriz matrizA = new Matriz();
   matrizA.agregarMatrizA();
   matrizA.mostrarMatrizA();
   matrizA.agregarMatrizB();
   matrizA.mostrarMatrizB();
   matrizA.matrizSuma();
  
 }

} 





  
