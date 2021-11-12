package sky.pro.base;

import sky.pro.base.Employee;

import static sky.pro.base.Employee.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1800, 1);
        employees[1] = new Employee("Петров Петр Петрович", 1900, 2);
        employees[2] = new Employee("Сидоров Сидр Сидорович", 1850, 3);
        employees[3] = new Employee("Васильев Василий Васильевич", 2000, 4);
        employees[4] = new Employee("Растаргуев Виталий Михайлович", 2100, 5);
        employees[5] = new Employee("Грушев Анатолий Николаевич", 1750, 1);
        employees[6] = new Employee("Задорнов Владислав Петрович", 1720, 2);
        employees[7] = new Employee("Фролова Антонина Мечиславовна", 1740, 3);
        employees[8] = new Employee("Климович Вера Сергеевна", 1690, 4);
        employees[9] = new Employee("Федотова Наталья Алексеевна", 2200, 5);

        printList(employees);
        getEmployeeMaxSum(employees);
        getEmployeeMinSum(employees);
        calculateTotalSum(employees);
        printTotalSum(calculateTotalSum(employees));
        double sum = calculateTotalSum(employees);
        calculateAverageSum(sum, employees);
        printFullName(employees);
    }

    public static void printList(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            int id = countAdd();
            System.out.println(id + " " + " " + employees[i].getFullName() + " " + employees[i].getDepartment() + " " + employees[i].getSalary());
        }
    }

    public static void getEmployeeMaxSum(Employee[] employees) {
        int maxSum = 0;
        String luckyEmployee = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSum) {
                luckyEmployee = employees[i].getFullName();
                maxSum = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой" + " " + maxSum + " " + luckyEmployee);
    }

    public static void getEmployeeMinSum(Employee[] employees) {
        int minSum = employees[0].getSalary();
        String unluckyEmployee = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSum) {
                minSum = employees[i].getSalary();
                unluckyEmployee = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудник с минимальноой зарплатой" + " " + minSum + " " + unluckyEmployee);
    }

    static double calculateTotalSum(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    static void printTotalSum(double sum) {
        System.out.println("Cумма затрат на зарплаты в месяц " + sum);
    }

    static void calculateAverageSum(double sum, Employee[] employees) {
        double averageAmount = sum / employees.length;
        System.out.println("Cреднее значение зарплат " + averageAmount);
    }

    public static void printFullName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }
}
