
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "ivan ";// Для хранения имени
        String middleName = "ivanovich "; // для хранения отчества
        String lastName = "ivanov "; // для хранения фамилии
        String fullName; // для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
        fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2");
        String fullName = "ivanov ivan ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}



