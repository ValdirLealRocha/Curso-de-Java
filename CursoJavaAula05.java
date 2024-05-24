// Aula 05 - https://youtu.be/CSEGE9Ie1Rc?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Tipos de Loops em Java, For, While e Do While - Curso de Java - Aula 05
//import java.util.Scanner; // Pacote para uso da coleta de dados vindas do teclado

public class CursoJavaAula05 {
  // estas barras serve para comentar a linha ou no fim do comando
  /*
    barra asterisco inicia um comentário e asterisco barr finaliza o comentário
    comentar assim para várias linhas.
  */
  /* barra asterisco inicia um comentário e asterisco barr finaliza o comentário de 1 linha*/

  public static void main(String[] args) {
    // Loop FOR - Use o FOR quando se sabe a quantidade de vezes que se deseja executar o loop
    //  cont++ <=> cont=cont+1 <=> conta+=1
    /*
    for(int cont=0; cont < 5; cont++){
    //for(int cont=10; cont > 0; cont--){
      //System.out.println("CFB Cursos");
      System.out.println(cont + " - CFB Cursos");
      //System.out.printf("%d CFB Cursos\n", cont);
    }
    System.out.println("Fim do Programa!!!");
    */
    //
    // Loop WHILE - Enquanto a condição for satisfeita o loop While continua, 
    // caso contrário para o loop, se a condição não for satisfatória pode não haver loop.

    //Scanner scan = new Scanner(System.in); // Declaração de um objeto e Instancia uma classe

    //int max = scan.nextInt();

    //int cont=0;
   
    //while(cont < 5){
    //while(cont < max){
    //  System.out.println(cont + " - CFB Cursos");
    //  cont++;
    //}
    //System.out.println("Fim do Programa!!!");

    int cont=0;
    // Loop DO WHILE - Executa pelo menos uma vez antes de avaliar a condição.
    do{
      System.out.println(cont + " - CFB Cursos");
      cont++;
    }while(cont <= 0);
    System.out.println("Fim do Programa!!!");

    //scan.close(); // Fecha o objeto instanciado, tirar da memória. Todo objeto deve ser fechado/destuído...
  } 
}
