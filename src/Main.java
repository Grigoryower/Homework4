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
        int maxspeed = 65;
        if (speed > maxspeed) {
            System.out.println("Если скорость больше " + speed + " , то придется заплатить штраф ");
        }
        if (speed <= maxspeed) {
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
        int x = 11;
        if (age <= x) {
            System.out.println("если человеку меньше " + age + " лет, то ему пора спать");
        }
        if (age == 2 && age1 == 6) {
            System.out.println("Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.");
        }
        if (age2 >= 7 && age3 == 18) {
            System.out.println("Если человеку от 7 до 18 лет, то ему нужно ходить в школу.");
        }
        if (age3 >= 19 && x <age4) {
            System.out.println("Если человеку больше 18 лет, но меньше 24, то его место в университете");
        }
        if (age4 > x) {
            System.out.println("А если человеку больше 24, то ему пора ходить на работу.");
        }
        if (age5 >= x) {
            System.out.println("А если человеку больше 60, то он может отдохнуть.");
        }


    }

    public static void task5() {
        System.out.println("Задание5");
        int x = 12;
        if (x < 5) {
            System.out.printf("Если возраст ребенка меньше " + x +" нельзя кататься на аттракционе\n");
        }
        else if (x > 5 && x  < 14){
            System.out.printf(" Если ребенку ровно " + x + " лет или больше, но меньше 14 лет, то он может кататься только в сопровождении взрослого\n");
        }
        else  {
            System.out.println("Если возраст ребенка равен "+ x + " то он может кататься без сопровождения взрослого.\n");
        }

    }
    public static void task6() {
        System.out.println("Задание6");
     int trainCar= 102;
     int places= 60;
     int standing = trainCar - places;
     int peremen = 60;
     int standingB= 26;
     if (places < peremen ){
        System.out.printf("В вагоне есть места"+ (places-standingB)+ " сидяч мест");
     } else if (places < standing){
        System.out.printf("В вагоне все еще есть"+ (places - standingB)+ "стоячих мест\n");
     } else  {
            System.out.printf("вагон полностью забит\n");
        }
    }
     public static void task7() {
        System.out.println("Задание7");
        int one=1;
        int two=2;
        int three=3;
        if (one > two && one > three) {
            System.out.printf("One");
        }
        else if (two > three && two > one) {
            System.out.printf("two");
        } else if (three > two && three > one)
            System.out.printf("three");
        }
    }
