import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        System.out.println("Задача1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека не равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице ниже 5 градусов,нужно надеть шапку");
        }
        if (temperature >= 5) {
            System.out.println("На улице  5 градусов,можно идти без шапки");
        }

    }

    public static void task3() {
        System.out.println("Задание3");
        int speed = 60;
        if (speed < 60) {
            System.out.println("Если скорость больше " + speed + " , то придется заплатить штраф ");
        }
        if (speed <= speed) {
            System.out.println("Если скорость " + speed + " , то   можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задание4");
        int age = 2;
        int age1 = 6;
        int age2 = 7;
        int age3 = 18;
        int age4 = 24;
        int age5 = 60;
        if (age <= age) {
            System.out.println("если человеку меньше " + age + " лет, то ему пора спать");
        }
        if (age == 2 && age1 == 6) {
            System.out.println("Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.");
        }
        if (age2 >= 7 || age3 == 18) {
            System.out.println("Если человеку от 7 до 18 лет, то ему нужно ходить в школу.");
        }
        if (age3 >= 18 || 23 <age4) {
            System.out.println("Если человеку больше 18 лет, но меньше 24, то его место в университете");
        }
        if (age4 >= age4) {
            System.out.println("А если человеку больше 24, то ему пора ходить на работу.");
        }
        if (age5 >= 60) {
            System.out.println("А если человеку больше 60, то он может отдохнуть.");
        }


    }

    public static void task5() {
        System.out.println("Задание5");
        int age = 9;
        int age1 = 14;
        if (age < 5) {
            System.out.printf("Если возраст ребенка меньше " + age +" нельзя кататься на аттракционе");
        }
        else if (age > 5 && age  < age1){
            System.out.printf(" Если ребенку ровно " + age + " лет или больше, но меньше "+ age1 + " лет, то он может кататься только в сопровождении взрослого");
        }
        else  {
            System.out.println("Если возраст ребенка равен "+ age1 + " то он может кататься без сопровождения взрослого.");
        }

    }
    public static void task6() {
        System.out.println("Задание6");
     int trainCar= 102;
     int places= 60;
     int standing = trainCar - places;
     int peremen = 60;
     if (places < 60 ){
        System.out.printf("В вагоне есть места"+ (peremen-places)+ " сидяч мест");
     } else if (places < standing){
        System.out.printf("стоячих мест");
     } else  {
            System.out.printf("вагон полностью забит");
        }
    }
     public static void task7() {
        System.out.println("Задание7");
        int one=1;
        int two=2;
        int three=3;
        if (one > two || one > three) {
            System.out.printf("One");
        }
        else if (two > three) {
            System.out.printf("two");
        } else {
            System.out.printf("three");
        }
    }
}