// Aula 11 - https://youtu.be/4y4muX4Cd1A?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Diferença entre public e private - Curso de Java - Aula 11
public class CursoJavaAula11 {

  public static void main(String[] args) {
    
    int num = 0; // num está em escopo diferente das classes e não causa erro de duplicidade

    // Instanciar um objeto, é como iniciar uma variável.
    // j1 está recebendo um novo objeto da classe Jogador,
    // a palavra new é quem cria a instancia da classe e aloca,
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

    //inicialização do atributo public num fora da classe... 
    // Private não poderia ser visto de fora da classe.
    // j1.num = 10;
    // j2.num = 5;
    // System.out.printf("%n j1 - %d",j1.num);
    // System.out.printf("%n j2 - %d",j2.num);
  }
}