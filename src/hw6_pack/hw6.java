package hw6_pack;

public class hw6 {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik",210);
        Cat cat1 = new Cat("Catzan",10);
        Cat cat2 = new Cat("Kuzya", 199);
        Dog dog = new Dog("Bobik", 300,6);
        Dog dog2 = new Dog("Jack", 400,3);
        Dog dog3 = new Dog("Tuzik", 600,11);


        Animals[] catsAndDogs = {cat,cat1,cat2,dog,dog2,dog3};

        for (int i=0;i < catsAndDogs.length; i++){
            if (catsAndDogs[i] instanceof Cat){
                ((Cat)catsAndDogs[i]).run();
            } else {
                ((Dog)catsAndDogs[i]).run();
                ((Dog)catsAndDogs[i]).swim();
            }
        }

        System.out.println("Создано животных: " + Animals.countAnimals());
        System.out.println("Создано котов: " + Cat.countCats());
        System.out.println("Создано собак: " + Dog.countDogs());
    }
}
