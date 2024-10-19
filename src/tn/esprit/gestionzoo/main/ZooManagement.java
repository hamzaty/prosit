package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public ZooManagement() {
    }

    public static void main(String[] args) {
        // Création de quelques animaux
        Animal lion = new Animal("Feline", "Lion", 4, true);
        Zoo zoo = new Zoo("MyZoo", "Marsa");
        Zoo zoo1 = new Zoo("Belvedere", "Tunis");

        // Ajout d'animaux aux zoos
        zoo.addAnimal(new Animal("Canine", "Kalb", 4, true));
        zoo.addAnimal(new Animal("Feline", "Tiger", 5, true));

        zoo1.addAnimal(new Animal("Canine", "Wolf", 3, true));
        zoo1.addAnimal(new Animal("Feline", "Leopard", 2, true));

   
        Animal a = new Animal("Canine", "Fox", 4, true);
        Animal b = new Animal("Feline", "Jaguar", 6, true);
        zoo.addAnimal(a);
        zoo.addAnimal(b);

    
        zoo.displayAnimals();

       
        System.out.println("Nombre d'animaux dans le zoo: " + zoo.getNbrAnimals());

       
        zoo.deleteAnimal(b);
        System.out.println("Nombre d'animaux après suppression: " + zoo.getNbrAnimals());

       
        System.out.println("Le zoo est-il plein? " + zoo.isZooFull());

       
        Zoo.comparerZoo(zoo, zoo1);
    




        /*zoo.displayZoo();
        System.out.println(zoo);
        System.out.println(zoo.toString());*/
    }
}
