import java.util.*;

public class Matriz1{

    /*
        Gui Francisco 
        Fábio William
        Rafael da Silva
        Murilo de Lima
        Esther Caroline
        Henrique Marques
        
     */

   public static void main(String[] args){
      //variaveis
      Scanner leia = new Scanner(System.in);   
   
      int l1[] = {0,0,0};
      int l2[] = {0,0,0};
      int l3[] = {0,0,0};
      
      int r1[] = {0,0,0};
      int r2[] = {0,0,0};
      int r3[] = {0,0,0};
      
      int det = 0;
      
      System.out.println("Calculadora de Matriz");

      //pegar os valores
      for(int i = 0;i < 3;i++){
         System.out.println("Escreva um número por vez; "+(i+1));
         switch(i){

            case 0:
               for(int c = 0; c < 3;c++){
                  System.out.print("Número "+(c+1)+":");
                  l1[c] = leia.nextInt();
               }
               System.out.println();
               break;

            case 1:
               for(int c = 0; c < 3;c++){
                  System.out.print("Número "+(c+1)+":");
                  l2[c] = leia.nextInt();
               }
               System.out.println();
               break;

            case 2:
               for(int c = 0; c < 3;c++){
                  System.out.print("Número "+(c+1)+":");
                  l3[c] = leia.nextInt();
               }
               System.out.println();
               break;
         
         }
      }
      
      //tabela normal
      System.out.println("\n("+l1[0]+","+l1[1]+","+l1[2]+")");
      System.out.println("("+l2[0]+","+l2[1]+","+l2[2]+")");
      System.out.println("("+l3[0]+","+l3[1]+","+l3[2]+")");
      
      det = ((l1[0]*l2[1]*l3[2])+(l1[1]*l2[2]*l3[0])+(l1[2]*l2[0]*l3[1])-(l3[0]*l2[1]*l1[2])-(l3[1]*l2[2]*l1[0])-(l3[2]*l2[0]*l1[1]));
      
      if(det != 0){
        System.out.println("\nDeterminante de cada linha:\n");
      
      //Resuldado do 1
        r1[0] = ((l2[1]*l3[2])-(l2[2]*l3[1]));
        r1[1] = ((l2[0]*l3[2])-(l2[2]*l3[0]));
        r1[2] = ((l2[0]*l3[1])-(l2[1]*l3[0]));
        System.out.println("("+r1[0]+","+r1[1]+","+r1[2]+")");

      //Resuldado do 2
        r2[0] = ((l1[1]*l3[2])-(l1[2]*l3[1]));
        r2[1] = ((l1[0]*l3[2])-(l1[2]*l3[0]));
        r2[2] = ((l1[0]*l3[1])-(l1[1]*l3[0]));
        System.out.println("("+r2[0]+","+r2[1]+","+r2[2]+")");

      //Resuldado do 3
        r3[0] = ((l1[1]*l2[2])-(l1[2]*l2[1]));
        r3[1] = ((l1[0]*l2[2])-(l1[2]*l2[0]));
        r3[2] = ((l1[0]*l2[1])-(l1[1]*l2[0]));
        System.out.println("("+r3[0]+","+r3[1]+","+r3[2]+")\n");
      
      //inverter os sinais 
      //[+,-,+]
      //[-,+,-]
      //[+,-,+]
        System.out.println("[+,-,+]\n[-,+,-]\n[+,-,+]\n");

      //Invertendo
        r1[0] = +r1[0];
        r1[1] = -r1[1];
        r1[2] = +r1[2];
        System.out.println("("+r1[0]+","+r1[1]+","+r1[2]+")");
      
        r2[0] = -r2[0];
        r2[1] = +r2[1];
        r2[2] = -r2[2];
        System.out.println("("+r2[0]+","+r2[1]+","+r2[2]+")");
      
        r3[0] = +r3[0];
        r3[1] = -r3[1];
        r3[2] = +r3[2];
        System.out.println("("+r3[0]+","+r3[1]+","+r3[2]+")\n");

      //Furmula
        System.out.println("A*A^-1=X\n");

      //Resultado a exibir
        System.out.println("("+(r1[0]*l1[0])+","+(r1[1]*l1[1])+","+(r1[2]*l1[2])+")");
        System.out.println("("+(r2[0]*l2[0])+","+(r2[1]*l2[1])+","+(r2[2]*l2[2])+")");
        System.out.println("("+(r3[0]*l3[0])+","+(r3[1]*l3[1])+","+(r3[2]*l3[2])+")");
      }

      else{

        //Resposta caso a variavel Det seja 0
         System.out.println("\nDeterminante igual a 0\nNão existe matriz inversa");
      }
      
         
   }

}