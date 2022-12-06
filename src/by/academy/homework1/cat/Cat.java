package by.academy.homework1.cat;

public class Cat {
    int age ;
    String nickname;

    int money;

    char initials;

    boolean isHomeAnimal;

    public void grow(){
        age++;
    }

    public void sleep(){
        System.out.println("Кот спит");
    }

    public void eat(){
        System.out.println("Кот ест");
    }

    public void walk(){
        System.out.println("Кот гуляет");
    }

    public Cat() {
    }

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }
}
