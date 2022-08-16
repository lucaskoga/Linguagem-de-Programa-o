public class Lugar{
  private boolean ocupado;
  private String dono;

  public Lugar(){
    ocupado = false;
    dono = "";
  }

  public boolean isOcupado(){
    return ocupado;
  }

  public void setOcupado(){
    ocupado = true;
  }

  public String getDono(){
    return dono.toString();
  }

  public void setDono(String dono){
    this.dono = dono;
  }
  
}
