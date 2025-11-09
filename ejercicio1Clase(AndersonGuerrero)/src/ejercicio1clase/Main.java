package ejercicio1clase;

public class Main {
    public static void main(String[] args) {
        Impresora impresora = new Impresora();
        
        Documento documento = new Documento();
        documento.titulo = "Mi Primer Documento";
        documento.cuerpo = "Este es el contenido del documento.";
        
        System.out.println("Titulo del documento: " + documento.getTitulo());
        
        impresora.imprimir(documento);
        
        impresora.encender();
        impresora.imprimir(documento);
        
        
        Documento doc1 = new Documento();
        doc1.titulo = "";
        doc1.cuerpo = "Tiene cuerpo pero no titulo";
        System.out.println("\nDocumento sin titulo:");
        impresora.imprimir(doc1);
        
        Documento doc2 = new Documento();
        doc2.titulo = "Documento sin cuerpo";
        doc2.cuerpo = "";
        System.out.println("\nDocumento sin cuerpo:");
        impresora.imprimir(doc2);
        
        System.out.println("\nSin documento:");
        impresora.imprimir(null);
    }
}
