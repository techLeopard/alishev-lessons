public class StaticWord {
    public static void main(String[] args) {

        Man1 m1 = new Man1("Bob", 40);
        Man1 m2 = new Man1("Jack", 30);
        m1.printNumberOfPeople();
        m2.printNumberOfPeople();
        Man1 m3 = new Man1("Kate", 20);
        m1.printNumberOfPeople();
        m2.printNumberOfPeople();
        m3.printNumberOfPeople();

        /*
        Man1.description = "Nice";
        m1.getAllFields();
        m2.getAllFields();
        Man1.description = "Bad";
        m1.getAllFields();
        m2.getAllFields();
        */
    }
}

class Man1 {
    private String name;
    private int age;
    private static int countPeople; // = 0


    public static String description;
    public static int x;

    public Man1(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}

    public void printNumberOfPeople(){
        System.out.println("Number of people is: "+countPeople);
    }
}

/*
Внутри класса Man1 такие аттрибуты как name, age и методы
setName и setAge являются переменными и методами объекта.

А бывают переменные и методы класса обозначаются словом static.

Статический метод - он один.
Статический метод не может работать с переменными объекта. У каждого объекта свои.
Стат метод он один на класс и общий на все объекты.
Зачем они нужны?
1. Если вашему методу не нужно знать переменные объекта.
например функция. Math.
 */

