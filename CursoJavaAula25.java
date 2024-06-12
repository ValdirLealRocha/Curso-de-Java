// Aula 25 - https://youtu.be/050M60OUHFE?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Como criar Array de tipo personalizado [Aprenda nesta aula] - Curso de Java - Aula 25
public class CursoJavaAula25 {

  public static void main(String[] args) {
    // declaração de variáveis
    final int numCarros = 5;
    Carro[] carros = new Carro[numCarros]; // Array do tipo Carro 'Classe Carro'

    // inicialização manual...
    carros[0] = new Carro("HRV"); // Instanciando... Colocar carros dentro do array...
    carros[1] = new Carro("Golf"); // Instanciando... Colocar carros dentro do array...
    carros[2] = new Carro("Camaro"); // Instanciando... Colocar carros dentro do array...
    carros[3] = new Carro("Mustang"); // Instanciando... Colocar carros dentro do array...
    carros[4] = new Carro("Toro"); // Instanciando... Colocar carros dentro do array...

    // inicialização do for tradicional...
    for(int i = 0; i < numCarros; i++) {
      carros[i].info();
    }

    System.out.print("\n==============================================\n");

    // Array de string de carros...
    String[] nomesCarros = {"HRV", "Golf", "Camaro", "Mustang", "Toro"};

    // Inicialização do array carros
    for(int i = 0; i < numCarros; i++) {
      carros[i] = new Carro(nomesCarros[i]);
    }

    // imprimir os carros
    for(Carro c: carros) {
      c.info();
    }

  }

}