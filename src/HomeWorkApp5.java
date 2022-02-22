/**
 * JavaLevel1.Lesson5
 * @author IrinaK
 * @version 22.02.2022
 */
class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee(
                "Миронов Андрей Петрович",
                "Директор",
                "mirra789@mail.ru",
                "8-919-339-70-61",
                25000,
                56
        );
        employeesArray[1] = new Employee(
                "Урюпова Надежда Ивановна",
                "Главный бухгалтер",
                "uni44@mail.ru",
                "8-982-351-65-14",
                20000,
                37
        );
        employeesArray[2] = new Employee(
                "Корякина Ирина Владимировна",
                "Старший инженер",
                "irina_koryakina@mail.ru",
                "8-902-869-55-00",
                18000,
                48
        );
        employeesArray[3] = new Employee(
                "Андронов Михаил Васильевич",
                "Инженер",
                "andropov_micha@mail.ru",
                "8-902-869-66-90",
                15000,
                46
        );
        employeesArray[4] = new Employee(
                "Кононов Владимир Вениаминович",
                "Помощник инженера",
                "masterok@mail.ru",
                "8-904-339-03-20",
                10000,
                21
        );
        for (Employee employee : employeesArray) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}

class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + "; \nДолжность: " + position + "; \nДля связи: email " + email + ", телефон " +
                phone + "; \nЗарплата: " + salary + "; \nВозраст: " + age;
    }

    public int getAge() {
        return age;
    }
}
