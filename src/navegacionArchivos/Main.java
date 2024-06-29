package navegacionArchivos;

public class Main {

	public static void main(String[] args) {
		
        Carpeta root = new Carpeta("Raíz");
        
        Archivo file1 = new Archivo("documento.txt", 1024);
        Archivo file2 = new Archivo("imagen.jpg", 2048);
        
        Carpeta folder1 = new Carpeta("Carpeta 1");
        folder1.addComponent(new Archivo("presentacion.ppt", 512));
        
        Carpeta folder2 = new Carpeta("Carpeta 2");
        folder2.addComponent(new Archivo("hojaCalculo.xls", 768));
        
        root.addComponent(file1);
        root.addComponent(file2);
        root.addComponent(folder1);
        root.addComponent(folder2);
        
        root.print(); // Imprimir la estructura del sistema de archivos

	}

}
