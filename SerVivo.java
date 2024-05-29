// Interface SerVivo
public interface SerVivo {
  // Pode ser criado atributos, não é muito comum, e estes dever sem inicializados...
  // Quando se inicializa aqui não podemos inicializar fora da classe... Neste caso...
  //public Boolean vivo = true;

  // Métodos a serem implementados na classe que usar esta Interface...
  public void mover();
  public void comer(int massa);
  public void info();
}
