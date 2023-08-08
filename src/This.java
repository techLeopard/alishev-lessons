public class This {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Jack");
        human1.setAge(30);
        human1.getInfo();

        Human human2 = new Human();
        human2.setName("John");
        human2.setAge(20);
        human2.getInfo();
    }
}

class Human {
    String name;
    int age;

    // Делаем set и get методы.

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name+" "+age);
    }
}

// Слово this указывает на поле класса.
