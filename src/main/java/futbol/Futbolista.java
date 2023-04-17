package futbol;

public abstract class Futbolista implements Comparable<Object>{
  private String nombre;
  private int edad;
  private String posicion;
  
  public Futbolista(){
    this("Maradona", 30, "delantero");
  }

  public Futbolista(String nombre, int edad, String posicion){
    this.nombre=nombre;
    this.edad=edad;
    this.posicion=posicion;
  }

  public String toString (){
    return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion();
  }
  
  public String getNombre(){
    return this.nombre;
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }

  public int getEdad(){
    return this.edad;
  }

  public void setEdad(int edad){
    this.edad=edad;
  }

  public String getPosicion(){
    return this.posicion;
  }

  public boolean equals(Futbolista f1, Futbolista f2){
    return f1.equals(f2);
  }

  public abstract boolean jugarConLasManos();
}
