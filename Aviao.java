// Veiculo é a SUPER CLASSE da CLASSE AVIAO
// Aviao herda de Veiculo
public class Aviao extends Veiculo {
  // para acessar elementos private da classe de veiculo, ´preciso ter os métodos pra isso.
  private int categoria;

  public Aviao(String nome, int categoria) {
    // como a classe veiculo tem um construtor que recebe parametros, repasso para o super...
    super(nome, 10);
    this.categoria = categoria;
  }

  public void info() {
    super.info();
    System.out.printf("Categoria: %d%n", this.categoria);
  }
}
