package hw6_pack;

public class Dog extends Animals {
    private static int dogs=0;

    public Dog(String name, int runDst, int swimDst) {
        super(name, runDst);
        this.swimDst = swimDst;
        dogs++;
    }
    @Override
    public void run() {
        if (runDst > 500) {
            System.out.println("Собаки не могут бежать больше 500 метров. Пес " + name + " не добежал :(");
        } else
            System.out.println(name + " пробежал " + runDst + " метров.");
    }

    @Override
    public void swim() {
        if (swimDst > 10){
            System.out.println("Собаки не могут плыть больше 10 метров. Пес " + name + " не доплыл :(");
        } else
        System.out.println(name + " проплыл " + swimDst + " метров.");
    }

    public static int countDogs(){
        return dogs;
    }
}