public class AnimalRunner {
        public static void main(String[] args) {
            Animal animal = new Cat();
            animal.eat();
            animal.sleep();
            animal.sound();
            animal.run();
            animal.breathe();

            System.out.println("-----------------");
            Cat cat=new Cat();
            cat.eat();
            cat.sleep();
            cat.sound();
            cat.run();
            cat.breathe();

        }
}
