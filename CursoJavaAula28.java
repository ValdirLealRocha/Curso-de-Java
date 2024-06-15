// Aula 28 - https://youtu.be/25hU1275aXM?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Passagem por valor e por referência em Java. Será que existe em Java? - Curso de Java - Aula 28
//
// Passagem por VALOR é passado uma cópia da variável, e não muda a origem...
// Passagem por REFERENCIA é passado o endereço da variável, pode alterar a origem...
//
public class CursoJavaAula28 {

  public static void main(String[] args) {
    // declaração de variáveis
    int[] notas = {10, 85, 62, 45, 98, 78, 88, 60, 67, 82};
    //int ap = 0, rp = 0; // ap = rp = 0; // Passagem por VALOR
    int[] resultado = {0,0}; // 0-Aprovado e 1=Reprovado para passagem por referencia..

    // chama função/método para validar a nota...
    // conferirNotas(notas, ap, rp); // Passagem por VALOR
    conferirNotas(notas, resultado); // Passagem por referencia...

    // mostra mensagens 
    // System.out.printf("Aprovado.: %d%n", ap);
    // System.out.printf("Reprovado: %d%n", rp);
    System.out.printf("Aprovado.: %d%n", resultado[0]);
    System.out.printf("Reprovado: %d%n", resultado[1]);
  }

  // função/método para validar a nota...
  //public static void conferirNotas(int[] nt, int a, int r) { // por valor
  public static void conferirNotas(int[] nt, int[] r) { // por referencia
    // percorre o array e valida nota...
    for(int n : nt) {
      if(n >= 60) {
        // a++; // aprovado
        r[0]++; // aprovado
      }else {
        // r++; // reprovado
        r[1]++; // reprovado
      }
    }
  }
}