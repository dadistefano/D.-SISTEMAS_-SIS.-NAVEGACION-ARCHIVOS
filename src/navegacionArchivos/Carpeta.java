package navegacionArchivos;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements ISisArchivosComponent {

    private String name;
    private List<ISisArchivosComponent> children = new ArrayList<>();
    
    public Carpeta(String name) {
        this.name = name;
    }
    
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
        int totalSize = 0;
        for (ISisArchivosComponent component : children) {
            totalSize += component.getSize();
        }
        return totalSize;
	}

    public void addComponent(ISisArchivosComponent component) {
        children.add(component);
    }
    
	@Override
	public void print() {
        System.out.println("Carpeta: " + name + ", Tamaño: " + getSize() + " bytes");
        for (ISisArchivosComponent component : children) {
            component.print();
        }
	}

}
