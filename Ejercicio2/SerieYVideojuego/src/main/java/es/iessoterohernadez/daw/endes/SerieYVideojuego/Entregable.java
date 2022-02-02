package es.iessoterohernadez.daw.endes.SerieYVideojuego;

public interface Entregable {
	  
    public void entregar();
  
    public void devolver();
  
    public boolean isEntregado();
  
    public int compareTo(Object a);
}