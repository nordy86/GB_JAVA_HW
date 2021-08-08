package hw6_pack;

public class Cat extends Animals {
    private static int cats=0;

    public Cat(String name, int runDst) {
        super(name, runDst);
        cats++;
    }

    @Override
    public void run() {
        if (runDst > 200) {
            System.out.println("Коты не могут бежать больше 200 метров. Кот " + name + " не добежал :(");
        } else {
            System.out.println(name + " пробежал " + runDst + " метров.");
        }
    }
    @Override
    public void swim() {
        System.out.println("Коты не умеют плавать.Кот "+name+" не доплыл:(");
    }
    public static int countCats(){
        return cats;
    }
}
