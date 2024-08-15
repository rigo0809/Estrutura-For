import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

//Fazer um programa que le o valor inteiro N depois  N numeros inteiros. Ao final, mostra a soma dos N numeros lidos.

    /*for ( int i = 0 ;i < 5 ; i++ ){
System.out.println(i);
    }
    for(int j = 4; j >= 0;j--){
      System.out.println(j);
    }
    //for(inicio ; condição ; incremento){
    //comandos;
    //}
    */
System.out.println("Digite  quantos numeros serao somandos: ");

    int soma = 0;
    int N = sc.nextInt();
for (int i = N; i > 0 ; i--){
  System.out.println("O numero a ser somado: ");
  int y = sc.nextInt();
  soma += y ;
  
}
System.out.println("A soma dos Números é :" + soma);



    
    sc.close();

  }


}