// Boa praticas de programação, as classes criamos com a primeira letra em maíuscula
// classe é uma representação dos objetos, são regras que aquele objeto vai seguir 
// quando for instanciado, e os métodos são as funcionalidades que este objeto, 
// classe vai ter, e teremos os atributos, que são as características que o objeto terá.
// Instanciar uma classe é criar um objeto usável da classe e daí poder utilizar o objeto no programa
// De uma classe poderá se originar vários objetos. 
// Da classe jogador, poderei ter vários objetos Jogadores, e cada um estará separado,
// independente de outros objetos jogadores, porém, todos seguem a mesma regra definida na classe jogador.
public class Jogador {

  // cria o atributo como public, acessado fora da classe também.
  //public int num = 0;
  private int num = 0;
  private int vidas = 0;

  private final int MAX_VIDAS = 3;

  // método construtor é "executado automaticamente" sempre que a classe for instanciada,
  // o método construtor nunca terá retorno, e terá o mesmo nome da classe
  // public Jogador(int n){
  //   System.out.printf("Jogador número %d criado%n", n);
  // }
  public Jogador(int num) {
    // num private da classe recebe o num do método cronstrutor
    this.num = num; 
    this.vidas = 1;
    //this.setVidas(3);
    System.out.printf("Jogador número %d criado%n", num);
  }

  // Método para obter/ler "get" os atributos da classe fora da classe
  // o tipo de retorno do método deve ser o mesmo tipo da propriedade/atributo na classe 
  public int getVidas() {
    return this.vidas;
  }

  // Método para atribuir/gravar "set" os atributos da classe fora da classe
  // set não retorna nada.
  //public void setVidas(int vidas) {
  //   private void setVidas(int vidas) {
  //     // this se refere ao atributo da classe, e recebe o argument/parametro do método em questão
  //   // valida a quantidade de vidas através do método
  //   if(vidas > MAX_VIDAS){
  //     this.vidas = MAX_VIDAS;
  //   }else if(vidas < 0){
  //     this.vidas = 0;
  //   }else{
  //     this.vidas = vidas;
  //   }
  // }

  // Método para atribuir/gravar "add" os atributos da classe fora da classe
  // add não retorna nada.
  // public void addVidas(int vidas) {
  //   // this se refere ao atributo da classe, e recebe o argument/parametro do método em questão
  //   // valida a quantidade de vidas através do método
  //   if(vidas > MAX_VIDAS){
  //     this.vidas = MAX_VIDAS;
  //   }else if(vidas < 0){
  //     this.vidas = 0;
  //   }else{
  //     this.vidas = vidas;
  //   }
  // }

  // Método para atribuir/gravar "add" os atributos da classe fora da classe
  // add não retorna nada.
  public void addVidas() {
    // this se refere ao atributo da classe, e recebe o argument/parametro do método em questão
    // valida a quantidade de vidas através do método
    if(this.vidas < MAX_VIDAS){
      this.vidas++;
    }
  }}
