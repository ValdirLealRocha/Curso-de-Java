// RESUMÃO:
// Todos os elementos static, atributos ou propriedades, tem o mesmo endereço de memória
// E vão ser comum para todos os objetos da classe
// e não precisa instanciar uma classe para chamar um método ou atributo static.
public class JogadorAula13 {

  private final int MAX_VIDAS = 3;

  private int num = 0;
  private int vidas = 0;

  // Variaveis státicas são alocadas de forma fixa na memória, quem as usar terá acesso
  // a esta memória que foi alocada na criação da variável.
  static boolean alerta = false;
  static int qtdJogadores = 0;
  static int pontosJogadores = 0; // controle de pontos global

  public JogadorAula13(int num) {
    this.num = num; 
    this.vidas = 1;
    System.out.printf("Jogador número %d criado%n", num);
    qtdJogadores++;
  }

  public int getVidas() {
    return this.vidas;
  }

  public void addVidas() {

    if(this.vidas < MAX_VIDAS){
      this.vidas++;
    }
  }

  static void pontos() {
    pontosJogadores += 10;
  }

  public void info() {
    System.out.printf("%nJogador..........: %d", this.num);
    System.out.printf("%nVidas............: %d", this.vidas);
    System.out.printf("%nAlerta...........: %s", (alerta ? "Sim" : "Não"));
    System.out.printf("%nJogadores........: %d", qtdJogadores);
    System.out.printf("%nPontos Jogadores.: %d", pontosJogadores);
    System.out.printf("%n-------------------------------------------");
  }
}
