class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Onibus onibus = new Onibus();
    ThreadVenda v1 = new ThreadVenda("#1",7, onibus);
    ThreadVenda v2 = new ThreadVenda("#2",2,onibus);
    ThreadVenda v3 = new ThreadVenda("#3",8,onibus);
    ThreadVenda v4 = new ThreadVenda("#4",13,onibus);
    ThreadVenda v5 = new ThreadVenda("#5",17,onibus);
    ThreadVenda v6 = new ThreadVenda("#6",7,onibus);
    ThreadVenda v7 = new ThreadVenda("#7",20,onibus);
    ThreadVenda v8 = new ThreadVenda("#8",2,onibus);

    Thread t1 = new Thread(v1);
    Thread t2 = new Thread(v2);
    Thread t3 = new Thread(v3);
    Thread t4 = new Thread(v4);
    Thread t5 = new Thread(v5);
    Thread t6 = new Thread(v6);
    Thread t7 = new Thread(v7);
    Thread t8 = new Thread(v8);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();
    t8.start();
    
    
    try{
      t1.join();
      t2.join();
      t3.join();
      t4.join();
      t5.join();
      t6.join();
      t7.join();
      t8.join();
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    System.out.println("\nLugares:");
    onibus.ConsultarLugares();
    
   /* onibus.ConsultarLugares();
    onibus.comprarLugar(3);
    onibus.comprarLugar(7);
    onibus.comprarLugar(13);
    System.out.println("\n");
    onibus.ConsultarLugares();*/
    
    //Lugar[] lugar = new Lugar();
    //System.out.println(lugar.isOcupado());
  }
}
