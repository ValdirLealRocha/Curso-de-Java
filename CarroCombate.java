// A nova classe CarroCombate herda da classe de Carro, através do extends.
public class CarroCombate extends Carro {

  private final int MAX_ARMAMENTO = 100;
  private final int MIN_ARMAMENTO = 0;
  private int qtdeArmamento;

  public CarroCombate(String nome, int blindagem) {
    // super acessa a classe pai CARRO
    super(nome);
    super.setArmamento(true);
    super.setBlindagem(blindagem);
    this.qtdeArmamento = 100;
  }

  public void setQtdeArmamento( int qtdeArmamento) {
    this.qtdeArmamento += qtdeArmamento;
    // valida armamento
    if(this.qtdeArmamento > MAX_ARMAMENTO) {
      this.qtdeArmamento = MAX_ARMAMENTO;
    }
    // valida armamento
    if(this.qtdeArmamento < MIN_ARMAMENTO) {
      this.qtdeArmamento = MIN_ARMAMENTO;
    }
  }

  public int getQtdeArmamento() {
    return this.qtdeArmamento;
  }

  // valida se tem armamento pra atirar
  public void atirar() {
    if(this.qtdeArmamento > MIN_ARMAMENTO) {
      setQtdeArmamento(-1); // atirou...
    }else {
      System.out.println("Sem munição/Sem armamento!");
    }
  }

  // mostra informações pro usuario
  public void info() {
    super.info();
    System.out.printf("Qtde.Arma...: %d%n", this.qtdeArmamento);
  }
}
