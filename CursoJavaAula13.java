// Aula 13 - https://youtu.be/TW5FthKNr50?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Métodos e atributos STATIC - Curso de Java - Aula 13
public class CursoJavaAula13 {

  public static void main(String[] args) {
    
    int num = 0; // num está em escopo diferente das classes e não causa erro de duplicidade

    // Instanciar um objeto, é como iniciar uma variável.
    // j1 está recebendo um novo objeto da classe Jogador,
    // a palavra new é quem cria a instancia da classe e aloca 
    // memória 'heap' para execução do objeto.
    // tipo - Jogador
    // nome - j1
    // recebe valor - = new Jogador();
    // 3 Objetos j1, j2 e j3 instanciados separadamente.
    // Jogador j1 = new Jogador(1);
    // Jogador j2 = new Jogador(2);  
    // Jogador j1 = new Jogador(num++); // pós incremento
    // Jogador j2 = new Jogador(num++);  
    // Jogador j3 = new Jogador(num++);  
    Jogador j1 = new Jogador(++num); // pré incremento
    Jogador j2 = new Jogador(++num);  
    Jogador j3 = new Jogador(++num);  

    // vidas sendo inicializada fora da classe, através do método setVidas
    // validação das vidas, não deve ser maior que 3...
    j1.addVidas(); // outra fora de inicializar a propriedade da classe através de incremento em addVidas
    j1.addVidas(); // outra fora de inicializar a propriedade da classe através de incremento em addVidas
    j1.addVidas(); // outra fora de inicializar a propriedade da classe através de incremento em addVidas
    j1.addVidas(); // outra fora de inicializar a propriedade da classe através de incremento em addVidas
    j2.addVidas(); // outra fora de inicializar a propriedade da classe através de incremento em addVidas
    j3.addVidas(); // outra fora de inicializar a propriedade da classe através de incremento em addVidas

    System.out.printf("%nVidas do jogador 1: %d",j1.getVidas());
    System.out.printf("%nVidas do jogador 2: %d",j2.getVidas());
    System.out.printf("%nVidas do jogador 3: %d",j3.getVidas());
  }
}