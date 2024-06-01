// ****************************************************************************
// Este bloco abaixo foi utilizado na aula 18
// Nesta aula 19, será criado outro código e vou manter um hitórico comentado...
// Classe Animal
/* ****************************************************************************
public class Animal implements SerVivo {

  // declaração e inicialização das propriedades
  //public Boolean vivo = true;
  // mudando pra private irem os inicializar dentro do construtor da classe..
  private Boolean vivo;

  public Animal(){
    this.vivo = false;
  };
  
  public void mover(){};
  public void comer(int massa){};
  public void info(){
    System.out.printf("Vivo: %s%n", this.vivo ? "Sim" : "Não");
  };
}
*/
// ****************************************************************************

// Nesta aula vamos implementar a Interface SerVivo e vamos criar uma classe abstrata
abstract class Animal implements SerVivo {
  //Definição de atributos - modificados somente dentro da classe...
  private Boolean vivo;
  private int massa;
  private int x; // Implementar o método mover devido a posição X
  private int y; // Implementar o método mover devido a posição Y
  private int vel; // velocidade
  private int forca;
  
  // Construtor - recebe: velocidade, massa e força.
  public Animal(int vel, int massa, int forca) {
    this.vivo = true;
    this.massa = massa;
    this.x = 0;
    this.y = 0;
    this.vel = vel;
    this.forca = forca;
  };

  // Define se vivo sim ou não
  public void setVivo(Boolean vivo) {
    this.vivo = vivo;
  };

  // Retorna o status de vivo
  public Boolean getVivo() {
    return this.vivo;
  };

  // Define a força do animal
  public void setForca(int forca) {
    this.forca = forca;
  };

  // Retorna o status da froça do animal
  public int getForca() {
    return this.forca;
  };

  // Define a massa do animal
  public void setMassa(int massa) {
    this.massa = massa;
  };

  // Retorna o status da massa do animal
  public int getMassa() {
    return this.massa;
  };

  // Métodos desta classe, que define que um animal vai atacar todo animal...
  // recebe um tipo d Animal.
  public void atacar(Animal a) {
    // testa se está vivo
    if(this.vivo) {
      // verifica se a forca deste animal 
      // é maior da forca do animal que está sendo atacado
      if(this.forca > a.forca) {
        // o animal que está atacando vai ficar mais forte,
        // ele vai pegar a massa do animal que ele está atacando
        // e ficará mais forte...
        this.forca += a.getMassa();
        // e o animal que está sendo atacado vai morrer...
        a.vivo = false;
      }else{
        // Caso contrário, se o animal que está atacando é fraca, ele morre...
        this.vivo = false;
      };
    }else {
      // Se não está vivo...
      System.out.println("------------------------------------------");
      // this.getClass().toGenericString() - retorna o tipo da classe...
      System.out.println(this.getClass().toGenericString() + " está morto! Não pode atacar! :(");
      System.out.println("------------------------------------------");
    };
  };

  // Métodos da Interface SerVivo, implementados aqui...
  //
  public void mover() {

    if(this.vivo) {
      this.x += this.vel;
      this.y += this.vel;
    }else {
      // Se não está vivo...
      System.out.println("------------------------------------------");
      // this.getClass().toGenericString() - retorna o tipo da classe...
      System.out.println(this.getClass().toGenericString() + " está morto! Não pode se mover! :(");
      System.out.println("------------------------------------------");
    };

  };

  // Métodos da Interface SerVivo, implementados aqui...
  //
  public void comer(int massa) {
    // Verifica se está vivo
    if(this.vivo) {
      // a força deste animal recebe a massa que irá comer...
      this.forca += massa;
    }else {
      // Se não está vivo...
      System.out.println("------------------------------------------");
      // this.getClass().toGenericString() - retorna o tipo da classe...
      System.out.println(this.getClass().toGenericString() + " está morto! Não pode comer! :(");
      System.out.println("------------------------------------------");
    };
  };

  // Métodos da Interface SerVivo, implementados aqui...
  // Mostra as informações e status dos animal...
  public void info() {
    System.out.println("------------------------------------------");
    System.out.printf("Tipo..: %s%n", this.getClass().toGenericString());
    System.out.printf("Vivo..: %s%n", this.getVivo() ? "Sim" : "Não");
    System.out.printf("Massa.: %d%n", this.massa);
    System.out.printf("Vel...: %d%n", this.vel);
    System.out.printf("Força.: %d%n", this.forca);
    System.out.print("------------------------------------------");
  };
}