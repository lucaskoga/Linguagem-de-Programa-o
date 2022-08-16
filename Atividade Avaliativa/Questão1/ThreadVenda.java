public class ThreadVenda implements Runnable{
  private String nome;
  private int poltrona;
  private static Onibus bus;

  public ThreadVenda(String nome, int poltrona, Onibus onibus){
    this.nome = nome;
    this.poltrona = poltrona;

    bus = onibus;
    //new Thread(this, nome).start();
  }
  public void run(){
    System.out.println(this.nome + " iniciou");
    bus.comprarLugar(poltrona, this.nome);
    //bus.ConsultarLugares();
    System.out.println(this.nome + " terminou");
    
    /*try{
    }catch(InterrupException ex)*/
  }
