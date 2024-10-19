package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int nbrAnimals = 0;


    public Zoo(String name, String city) {
        setName(name);  // 
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : Le nom d'un zoo ne peut pas être vide.");
            this.name = "Zoo sans nom"; 
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

   
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Le zoo est plein. Impossible d'ajouter l'animal : " + animal.getName());
            return false;
        }

        if (searchAnimal(animal) == -1) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        } else {
            System.out.println("L'animal " + animal.getName() + " est déjà dans le zoo.");
            return false;
        }
    }

   
    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }


    private int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    
    public boolean deleteAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
           
            for (int i = index; i < nbrAnimals - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbrAnimals - 1] = null; 
            nbrAnimals--;
            return true;
        }
        return false;
    }

 
    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }

  
    public static void comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            System.out.println(z1);
        } else {
            System.out.println(z2);
        }
    }

 

    public String toString() {
        return "Zoo Name: " + this.name + ", city: " + this.city + ", Number of cages: " + this.nbrCages + ", Animals: " + this.nbrAnimals;
    }
}
