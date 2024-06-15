// Aula 29 - https://youtu.be/YSizy7UHbwA?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Quantos parâmetros podem ser passados para uma mesma função? - Curso de Java - Aula 29

public class CursoJavaAula29 {

  public static void main(String[] args) {
    // declaração de variáveis
    System.out.print("\n*********************************\n");

    int res = soma(10, 5); // chama função soma...
    System.out.printf("%d%n", res);

    System.out.print("\n*********************************\n");

    // Arrya com n indices para passar pra função
    int[] valores = {10, 5, 2, 3, 1, 9, 4};
    // função passa um array pra somatoria
    res = soma1(valores); // chama função soma1...
    System.out.printf("%d%n", res);

    System.out.print("\n*********************************\n");

    res = soma2(10, 5, 2, 3, 1, 9, 4); // chama função soma2...
    System.out.printf("%d%n", res);

    System.out.print("\n*********************************\n");

    int n1 = 2, n2 = 5, n3 = 100;
    // agora na função indefinida passamos variáveis...
    res = soma2(n1, n2, n3); // chama função soma3...
    System.out.printf("%d%n", res);

    System.out.print("\n*********************************\n");
  }

  // somatória com 2 parametros...
  public static int soma(int n1, int n2) {
    return n1 + n2;
  }

  // somatória com com array como parametro...
  public static int soma1(int[] n) {
    int res = 0;
    for(int v:n) {
      res += v;
    }
    return res;
  }

  // Passar n parametros indefinido...
  public static int soma2(int... n) {
    int res = 0;
    for(int v:n) {
      res += v;
    }
    return res;
  }
}