package ejercicio1clase;

public class Impresora {
    public boolean estaEncendida;
    
    public Impresora() {
        this.estaEncendida = false;
    }
    
    public void encender() {
        this.estaEncendida = true;
        System.out.println("Estado: ENCENDIDA");
    }
    
    public void supervision() {
        System.out.println("Supervision de Impresora ");
        if (estaEncendida == true) {
            System.out.println("Estado: ENCENDIDA");
        } else {
            System.out.println("Estado: APAGADA");
        }
    }
  
    public void imprimir(Documento documento) {
        if (estaEncendida == false) {
            System.out.println("No se pudo imprimir.");
            System.out.println("Por que: La impresora esta apagada.");
            return;
        }
       
        if (documento == null) {
            System.out.println("No se pudo imprimir.");
            System.out.println("Por que: No hay documento.");
            return;
        }
        
        String titulo = documento.getTitulo();
        String cuerpo = documento.getCuerpo();
        
        if (titulo == null || titulo.equals("")) {
            System.out.println("No se pudo imprimir.");
            System.out.println("Por que: El documento esta incompleto, no tiene titulo.");
            return;
        }
        
        if (cuerpo == null || cuerpo.equals("")) {
            System.out.println("No se pudo imprimir.");
            System.out.println("Por que: El documento esta incompleto, no tiene cuerpo.");
            return;
        }
        
        System.out.println("Imprimiendo: " + titulo);
        System.out.println(cuerpo);
    }
}
