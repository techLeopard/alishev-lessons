/*
публичный класс = главный класс
может быть только один
 */

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-1);

        Person person2 = new Person();
        person2.setName("Kate");
        person2.setAge(20);
        System.out.println("Выводим значение в main методе: "+ person1.getName());
        System.out.println("Выводим значение в main методе: "+ person1.getAge());

    }
}

/*
Что такое класс?
это шаблон (например, homo sapiens).
Это тип данных, который вы создали сами.
 */
    /*
    У класса могут быть:
    1. Данные (поля)
    2. Действия, которые он может совершать (методы)

    Класс может что-то делать (методы).
    метод нужно вызвать в main.
    методы пишем с маленькой.
     */

class Person {
    private String name;
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("Ты ввел пустое имя.");
        } else{
            name = userName;
        }
        name = userName;
    }
    public String getName(){
        return name;
    }

    public void setAge(int userage){
        if (userage < 0){
            System.out.println("Введите пол-й возраст.");
        } else {
            age = userage;
        }
        age = userage;
    }

    public int getAge(){
        return age;
    }


    void greet(){
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
    }


    /*
        17. Параметры метода.
        () без доп параметров.

         */

    /*
    void - у методов это тип возвращаемого значения.
    void - пустота, ничто
     */

}
