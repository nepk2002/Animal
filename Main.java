

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Gazelle(1,"Газелька",3,6);
        Animal animal2 = new Rabbit(1,"Петя",1,1);
        Animal animal3 = new Animal(3,"Зверь");
        Animal animal4 = new Volf(1,"Вова",2,4);
        Animal animal5 = new Fox(1,"Алиса",2,3);
        Animal animal6 = new Beer(1,"Алиса",4,6);

        extrakt(animal1);
        System.out.println();
        extrakt(animal2);
        System.out.println();
        extrakt(animal4);
        System.out.println();
        extrakt(animal5);
        System.out.println();
        extrakt(animal6);
        System.out.println();
        extrakt(animal3);
        System.out.println();
    }

    private static void extrakt(Animal animal3) {
        animal3.move();
        animal3.sleep();
        animal3.voice();
    }
}
    class Animal{
        int age;
        String name;

        public Animal(int age,String name) {
            this.age = age;
            this.name = name;
        }

        public void move(){
            System.out.println("Moving...");
        }
        public void sleep(){
            System.out.println("Sleeping...");
        }
        public void voice(){
            System.out.println("Voice...");
        }
    }

class Herbivores extends Animal{
    int whight;
    int height;

    public Herbivores(int age, String name, int whight, int height) {
        super(age, name);
        this.whight = whight;
        this.height = height;
    }
}
class Predator extends Animal{
    int whight;
    int height;

    public Predator(int age, String name, int whight, int height) {
        super(age, name);
        this.whight = whight;
        this.height = height;
    }
}
class Omnivorous extends Animal{
    int whight;
    int height;

    public Omnivorous(int age, String name, int whight, int height) {
        super(age, name);
        this.whight = whight;
        this.height = height;
    }
}

class Rabbit extends Herbivores{
    public Rabbit(int age, String name, int whight, int height ) {
        super(age,name, whight,height);
    }

    @Override
    public void move() {
        System.out.println("Rabbit jumpe");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping in a hole");
    }

    @Override
    public void voice() {
        System.out.println("AAA...");
    }
}
class Gazelle extends Herbivores{
    public Gazelle(int age, String name, int whight, int height ) {
        super(age,name, whight,height);
    }

    @Override
    public void move() {
        System.out.println("Gazelle Run");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping in a savannah");
    }

    @Override
    public void voice() {
        System.out.println("IIII...");
    }
}

class Volf extends Predator{
    public Volf(int age, String name, int whight, int height ) {
        super(age,name, whight,height);
    }

    @Override
    public void move() {
        System.out.println("Volf Run");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping in a hole");
    }

    @Override
    public void voice() {
        System.out.println("Auuu...");
    }
}
class Fox extends Predator{
    public Fox(int age, String name, int whight, int height ) {
        super(age,name, whight,height);
    }

    @Override
    public void move() {
        System.out.println("Fox Sneaks");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping in a hole");
    }

    @Override
    public void voice() {
        System.out.println("a-a-a...");
    }
}

class Beer extends Omnivorous{
    public Beer(int age, String name, int whight, int height ) {
        super(age,name, whight,height);
    }

    @Override
    public void move() {
        System.out.println("Beer clubfoot");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping in a den");
    }

    @Override
    public void voice() {
        System.out.println("uuuu...");
    }
}