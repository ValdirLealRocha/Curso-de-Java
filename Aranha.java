// A classe aranha implementa a classe abstrata animal...
public class Aranha extends Animal {
  // Aranha tem uma característica diferente da formiga, o veneno..
  private int veneno;

  // Construtor
  public Aranha(int vel, int massa, int forca, int veneno){
    // Recebe a velocidade, a massa e a força e repassa para aclasse Animal SUPER
    super(vel, massa, forca);
    this.veneno = veneno;
  };

  // Métodos desta classe, que define que um animal vai atacar todo animal...
  // recebe um tipo d Animal.
  //
  // Para o caso do Veneno da aranha vamos sobre-escrever o método atacar...
  @Override
  public void atacar(Animal a) {
    // testa se está vivo
    if(this.getVivo()) {
      // verifica se a forca desta aranha 
      // é maior da forca do animal que está sendo atacado
      if(this.getForca() <= a.getForca()) {
        // a aranha que está atacando vai ficar mais forte,
        // ele vai pegar a massa do animal que ele está atacando
        // e ficará mais forte...
        this.setForca(this.getForca() + a.getMassa());
      };
      if((this.getForca() + this.veneno) > a.getForca()) {
        // a aranha que está atacando vai ficar mais forte,
        // ele vai pegar a massa do animal que ele está atacando
        // e ficará mais forte...
        //this.setForca(this.getForca() + a.getMassa()); // teste de tirar a força aumentada...
        a.setVivo(false);
      }else{
        a.setVivo(false);

      };
    }else {
      // Se não está vivo...
      System.out.println("---------------------------------------------");
      System.out.println(" está animal está morto! Não pode atacar! :( ");
      System.out.println("---------------------------------------------");
    };
  };
}
