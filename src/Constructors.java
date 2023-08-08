import java.util.NoSuchElementException;

public class Constructors {
    public static void main(String[] args) {
        Man man1 = new Man("bob", 40);

    }
}

class Man {
    private String name;
    private int age;

    public Man(){
        /*
         При создании объекта new Human,
         создается этот конструктор, который невидим.
         Мы его прописали для видимости,
         но по сути он не имеет смысла,
         так как не содержит аттрибутов.

         Не имеет типа возвращаемого значения (void).
         Имя должно совпадать с именем класса Human.
         */
        System.out.println("Привет из первого конструктора.");
    }

    public Man(String name){
        this.name = name;
        System.out.println("Второй конструктор.");
    } // Перегрузка метода
    // Можно иметь несколько методов с одинаковым названием,
    // но разными параметрами.

    public Man(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Третий конструктор.");
    }


    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
}

/*
Контрукторы - это методы которые вызываются при создании объекта.

 */
