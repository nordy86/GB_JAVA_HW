package hw5_pack;

import hw5_pack.Employee;

public class Hw5 {

    public static void main(String[] args) {
        System.out.println("*********************** Задание №1-3 ***********************");
        Employee employee1 = new Employee("Mike Robert Vazovsky", "chief executive",
                "email@employee.com", "786523434897", 29, 350);

        System.out.println(employee1.getEmployeeInfo());

        Employee[] emplArr = new Employee[5];
        emplArr[0] = new Employee("Mike Robert Vazovsky", "chief executive", "email@employee.com",
                "786523434897", 29, 350);
        emplArr[1] = new Employee("Robert", "clerk", "123@employee.com", "78656744897",
                54, 450);
        emplArr[2] = new Employee("Jack", "night clerk", "jack@employee.com", "7222222897",
                41, 400);
        emplArr[3] = new Employee("Bob", "manager", "bob@employee.com", "7243422897",
                20, 100);
        emplArr[4] = new Employee("Garry", "manager", "garry@employee.com", "347888897",
                18, 100);
        System.out.println("*********************** Задание №4 список сотрудников ***********************");
        allEmployee(emplArr);
        System.out.println("*********************** Задание №5 список сотрудников старше 40 лет ***********************");
        oldEmployee(emplArr);

    }

    private static void oldEmployee(Employee[] emplArr) {
        for (int i = 0; i < emplArr.length; i++) {
            if (emplArr[i].getAge() > 40) {
                System.out.println(emplArr[i].getEmployeeInfo());
            }
        }
    }

    private static void allEmployee(Employee[] emplArr) {
        for (int i = 0; i < emplArr.length; i++) {
            System.out.println(emplArr[i].getEmployeeInfo());
        }
    }
}

