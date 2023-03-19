public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
       // task4();
    }

    // заголовки задач
    public static void taskHeader(int number, String caption) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("|| Задача " + number + ": " + caption + " ||");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void task1() {
        taskHeader(1, "Ф.И.О.");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println(fullName);
    }

    public static void task2() {
        taskHeader(2, "Upper case");
        String firstName = "Petr";
        String middleName = "Viktorovich";
        String lastName = "koshkin";
        String fullName = lastName+" "+firstName+" "+middleName;
        String upCaseFullName = fullName.toUpperCase();
        System.out.println(upCaseFullName);
    }

    public static void task3() {
        taskHeader(3, "Нет букве Ё!");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName+" "+firstName+" "+middleName;
        String fixedFullName = fullName.replace("ё", "е");
        System.out.println(fixedFullName);
    }


    public static void task4() {
        taskHeader(4, "Массив задом наперёд");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}