package hw6_pack;

public class Animals {

    protected String name;
    protected int runDst;
    protected int swimDst;

    private static int counter = 0;

    public Animals(String name,int runDst){
        this.name = name;
        this.runDst = runDst;
        counter++;
    }
    public static int countAnimals(){
        return counter;
    }
    public void run(){
        System.out.println(name + " пробежал " + runDst + " метров.");
    }
    public void swim(){
        System.out.println(name + " проплыл " + swimDst + " метров.");
    }
}
