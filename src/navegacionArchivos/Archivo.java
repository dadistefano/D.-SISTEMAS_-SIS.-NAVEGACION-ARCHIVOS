package navegacionArchivos;

public class Archivo implements ISisArchivosComponent {
	
    private String name;
    private int size;
    
    public Archivo(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void print() {
		System.out.println("	Archivo: " + name + ", Tamaño: " + size + " bytes");
		
	}

}
