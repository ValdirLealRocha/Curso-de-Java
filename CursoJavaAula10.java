// Aula 10 - https://youtu.be/Xr9kjsra1Sw?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// Aprendendo sobre classes em Java #P1 - Curso de Java - Aula 10
public class CursoJavaAula10 {

  public static void main(String[] args) {
    
    // Instanciar um objeto, é como iniciar uma variável.
    // j1 está recebendo um novo objeto da classe Jogador,
    // a palavra new é quem cria a instancia da classe e aloca
    // memória 'heap' para execução do objeto.
    // tipo - Jogador
    // nome - j1
    // recebe valor - = new Jogador();
    // 3 Objetos j1, j2 e j3 instanciados separadamente.
    Jogador j1 = new Jogador(1);
    Jogador j2 = new Jogador(2);    
    Jogador j3 = new Jogador(3);
  }
}