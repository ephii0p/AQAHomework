public class Person {
    String FIO;
    String position;
    String email;
    String phoneNumber;
    int payment;
    int age;

    public Person(String FIO, String position, String email, String phoneNumber, int payment, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.payment = payment;
        this.age = age;
    }

    public void info() {

        System.out.println("ФИО:" + FIO + " " + "Должность: " + position + " " + "email: " + email + " " +
                "Телефон: " + phoneNumber + " " + "Зарплата: " + payment + " " + "Возвраст: " + age);
    }

    public static void main(String[] args) {
        Person Person = new Person("Иванов Иван Иванович", "Менеджер", "test@mail.ru", "+7123456789", 150000, 42);
        Person.info();
    }

    public static void worker() {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Петров Петр Петрович", "Тестировщик", "test2@mail.ru", "+7123456788", 123123, 32);
        persArray[1] = new Person("Петров Алексей Алексеевич", "Лид", "test3@mail.ru", "+7123456777", 123123, 34);
        persArray[2] = new Person("Петров Андрей Андреевич", "Сеньор", "test4@mail.ru", "+7123456666", 123123, 312);
        persArray[3] = new Person("Петров Валентин Валентинович", "Помидор", "test5@mail.ru", "+7123455555", 123123, 33);
        persArray[4] = new Person("Петров Федор Федорвич", "Начальник", "test6@mail.ru", "+712344444", 123123, 23);

    }
}