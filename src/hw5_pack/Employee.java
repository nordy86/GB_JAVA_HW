package hw5_pack;

public class Employee {

    private String name;
    private String position;
    private String eMail;
    private String tel;
    private int age;
    private int salary;

    public Employee (String name, String position, String eMail, String tel, int age, int salary){
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.tel = tel;
        this.age = age;
        this.salary = salary;
    }

    int getAge(){
        return age;
    }
    public String getEmployeeInfo(){
        return "Имя сотрудника: " + this.name +
        ",Должность: " + this.position +",Почта: " + eMail + ",Телефон: " + tel +
        ",Возраст: " + age + ",Зарплата: " + salary;
    }

}
