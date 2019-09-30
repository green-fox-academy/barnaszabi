package garden;

public class main {
  public static void main(String[] args) {
    Flower flower1 = new Flower(0, "yellow");
    Flower flower2 = new Flower(0, "blue");
    Tree tree1 = new Tree(0, "orange");
    Tree tree2 = new Tree(0, "purple");

    Garden garden = new Garden();

    garden.addPlant(flower1);
    garden.addPlant(flower2);
    garden.addPlant(tree1);
    garden.addPlant(tree2);

    System.out.println(garden.plants.get(0).toString());
    System.out.println(garden.plants.get(1).toString());
    System.out.println(garden.plants.get(2).toString());
    System.out.println(garden.plants.get(3).toString());

    garden.watering(40);

    System.out.println(garden.plants.get(0).toString());
    System.out.println(garden.plants.get(1).toString());
    System.out.println(garden.plants.get(2).toString());
    System.out.println(garden.plants.get(3).toString());

    garden.watering(70);

    System.out.println(garden.plants.get(0).toString());
    System.out.println(garden.plants.get(1).toString());
    System.out.println(garden.plants.get(2).toString());
    System.out.println(garden.plants.get(3).toString());
  }
}
