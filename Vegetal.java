public class Vegetal {
  //Definição de atributos - modificados somente dentro da classe...
  private Boolean vivo;
  private int massa;

  // Construtor recebe uma massa do vegetal
  public Vegetal(int massa) {
    this.vivo = true;
    this.massa = massa;
  };

  // Retorna o status da massa do vegetal
  public int getMassa() {
    return this.massa;
  };

  // Define se vivo sim ou não
  public void setVivo(Boolean vivo) {
    this.vivo = vivo;
  };
  
  // Continuamos na Aula 21...
  // Mostra as informações e status dos vegetal...
  public void info() {
    System.out.println("------------------------------------------");
    System.out.printf("Tipo..: %s%n", getClass().toGenericString());
    System.out.printf("Vivo..: %s%n", this.vivo ? "Sim" : "Não");
    System.out.printf("Massa.: %d%n", this.massa);
    System.out.println("------------------------------------------");
  };
}
