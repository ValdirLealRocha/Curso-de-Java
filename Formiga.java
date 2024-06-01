// A classe firmiga implementa a classe abstrata animal...
public class Formiga extends Animal {
  
  // Construtor
  public Formiga(int vel, int massa, int forca){
    // Recebe a velocidade, a massa e a força e repassa para aclasse Animal SUPER
    super(vel, massa, forca);
  };
}
