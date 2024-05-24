public class Carro {
  // propriedades da classe private
  private String nome;
  private Boolean ligado;
  private Boolean destruido;
  private int blindagem;
  private Boolean armamento;

  // Contrutor da classe
  public Carro(String nome) {
    this.nome = nome;
    this.ligado = false;
    this.destruido = false;
    this.blindagem = 0;
    this.armamento = false;
  }

  // Retorna o nome e não permite alterar o nome
  public String getNome() {
    return this.nome;
  }

 // Reorna se esta ligado/desligado
  public Boolean getLigado() {
    return this.ligado;
  }

  // permite setar se estará ligado/desligado
  public void setLigado(Boolean ligado) {
    this.ligado = ligado;
  }

  // retorna o status de destruido
  public Boolean getDestruido() {
    return this.destruido;
  }

  // public void setDestruido(Boolean destruido) {
  //   this.destruido = destruido;
  // }

  // retorna a status do armamento
  public Boolean getArmamento() {
    return this.armamento;
  }

  // permite setar o status do armamento
  public void setArmamento(Boolean armamento) {
    this.armamento = armamento;
  }

  // retorna o status da blindagem
  public int getBlindagem() {
    return this.blindagem;
  }

  // permite setar o status da blindagem
  public void setBlindagem(int blindagem) {
    this.blindagem = blindagem;
  }

  // verifica se sofreu dano
  public void sofrerDano(int dano) {
    this.blindagem -= dano;

    if(this.blindagem <= 0) {
      this.blindagem = 0;
      this.ligado = false;
      this.destruido = true;
    }
  }

  // mostra informações pro usuario
  public void info() {
    System.out.println("-----------------------------------");
    System.out.printf("Nome........: %s%n", this.nome);
    System.out.printf("Ligado......: %s%n", (this.ligado ? "Sim" : "Não"));
    System.out.printf("Destruído...: %s%n", (this.destruido ? "Sim" : "Não"));
    System.out.printf("Blindagem...: %d%n", this.blindagem);
    System.out.printf("Armamento...: %s%n", (this.armamento ? "Sim" : "Não"));
  }
}
