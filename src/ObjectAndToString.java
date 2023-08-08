public class ObjectAndToString {
    public static void main(String[] args) {
        Human2 h1  = new Human2("Bob", 40);
        System.out.println(h1);
        h1.toString();
    }
}

class Human2 {
    private String name;
    private int age;

    public Human2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name+','+age;
    }
}

/*
Любой класс в java наследуется от класса Object.

 toString() возвращает hash-код. Human2@a09ee92
 Уникальный номер присвоенный каждому объекту.

System.out.println(h1); = System.out.println(h1.toString());

Смысл метода toString() - чтобы представить объект в виде строки.

Метод toString() может быть переопределен.

 */