import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {
    private ArrayList<Animal> animales;

    public Zoologico() {
        animales = new ArrayList<>();
    }

    // Métodos
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void modificarAnimal(int index, Animal nuevoAnimal) {
        if (index >= 0 && index < animales.size()) {
            animales.set(index, nuevoAnimal);
        } else {
            System.out.println("Índice no válido");
        }
    }

    public void eliminarAnimal(int index) {
        if (index >= 0 && index < animales.size()) {
            animales.remove(index);
        } else {
            System.out.println("Índice no válido");
        }
    }

    public void consultarAnimal(int index) {
        if (index >= 0 && index < animales.size()) {
            System.out.println(animales.get(index).getInfo());
        } else {
            System.out.println("Índice no válido");
        }
    }

    public void imprimirAnimales() {
        if (animales.isEmpty()) {
            System.out.println("No hay animales registrados en el zoológico.");
            return;
        }

        for (int i = 0; i < animales.size(); i++) {
            System.out.println("Índice " + i + ": " + animales.get(i).getInfo());
        }
    }

    // Setters y Getters
    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

}
