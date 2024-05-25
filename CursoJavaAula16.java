// Aula 16 - https://youtu.be/nwZ_8dibnG4?list=PLx4x_zx8csUjFC5WWjoNUL7LOOD7LCKRW
// PROTECTED em Java, como usar este modificador de acesso - Curso de Java - Aula 16
// public posso acessar de qualquer classe.
// private somente posso acessar dentro da classe.
// o protected permite acesso fora da classe, 
// mas somente de classe sque estão no mesmo pacote "pasta", 
// ou extendão aquela classe "Herança".
public class CursoJavaAula16 {

  public static void main(String[] args) {
    // para entendimento de protected nesta aula, foi mostrado da seguinte forma.
    // a classe veiculo e a classe aviao, porém, 
    // a classe veiculo foi movida para uma pasta a partir do raiz
    // pasta VEICULOS e dentro foi copiado os arquivos veicuo.java e veiculo.class 
    // no cabeçalho do arquivo classe de veiculo foi adicionado "package veiculos"
    // sendo assim as propriedades nome e tipo da classe veiculos que eram private, 
    // passaram a ser protected e descendo um nivel, ou seja, saindo da pasta de 
    // veiculos e voltando ao raiz, 
    // foi adicionado no cabeçalho da classe aviao "import veiculos.veiculo" 
    // ou poderia ser "import veiculos.*" assim pegaria tudo o que esta dentro da pasta
    // veiculos. Assim as propriedades nome e tipo, agora podem ser vistas nas classes
    // dos raiz e onde tem a herança, na super classe veiculo e na sub classe aviao.
    //
    // Preferi descrever pra ficar mais claro o entendimento, pois ainda será 
    // melhor assistir a aula 16 mesmo pra fixar melhor.
    //
  }
}