class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Миронов Андрей Петрович", "Директор", "mirra789@mail.ru",
                                    "8-919-339-70-61", 25000, 56);
        emplArray[1] = new Employee("Урюпова Надежда Ивановна", "Главный бухгалтер",
                                    "uni44@mail.ru", "8-982-351-65-14", 20000, 41);
        emplArray[2] = new Employee("Корякина Ирина Владимировна", "Старший инженер",
                                    "irina_koryakina@mail.ru", "8-902-869-55-00", 18000, 48);
        emplArray[3] = new Employee("Андронов Михаил Васильевич", "Инженер",
                                    "andropov_micha@mail.ru", "8-902-869-66-90", 15000, 36);
        emplArray[4] = new Employee("Кононов Владимир Вениаминович", "Помощник инженера",
                                    "masterok@mail.ru", "8-904-339-03-20", 10000, 21);
        for (Employee empl : emplArray) {
            if (empl.getAge() > 40) {
                System.out.println(empl);
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