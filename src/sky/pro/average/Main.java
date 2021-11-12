package sky.pro.average;

import static sky.pro.average.Employee.*;
import static sky.pro.base.Employee.countAdd;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1800, 1);
        employees[1] = new Employee("Петров Петр Петрович", 1900, 2);
        employees[2] = new Employee("Сидоров Сидр Сидорович", 1850, 1);
        employees[3] = new Employee("Васильев Василий Васильевич", 2000, 4);
        employees[4] = new Employee("Растаргуев Виталий Михайлович", 2100, 5);
        employees[5] = new Employee("Грушев Анатолий Николаевич", 1750, 1);
        employees[6] = new Employee("Задорнов Владислав Петрович", 1720, 2);
        employees[7] = new Employee("Фролова Антонина Мечиславовна", 1740, 3);
        employees[8] = new Employee("Климович Вера Сергеевна", 1690, 4);
        employees[9] = new Employee("Федотова Наталья Алексеевна", 2200, 5);
        int kindDepartment = 1;
        int indexInterest = 12;
        double sum = calculateTotalSum(employees, kindDepartment);
        double pargSalary = 1800;
        indexSum(employees, indexInterest);
        printList(employees, kindDepartment);
        getEmployeeMaxSum(employees, kindDepartment);
        getEmployeeMinSum(employees, kindDepartment);
        calculateTotalSum(employees, kindDepartment);
        printTotalSum(calculateTotalSum(employees, kindDepartment));
        calculateAverageSum(sum, employees, kindDepartment);
        indexSumDepartment(employees, indexInterest, kindDepartment);
        listMorePargSalary(employees, pargSalary);
        listLessPargSalary(employees, pargSalary);
    }

    public static void indexSum(Employee[] employees, int indexInterest) {
        for (int i = 0; i < employees.length; i++) {
            double indexSum = (employees[i].getSalary()) + (employees[i].getSalary() * indexInterest / 100);
            System.out.println(employees[i].getFullName() + " " + indexSum);
        }
    }
    public static void printList(Employee[] employees, int kindDepartment) {
        for (int i = 0; i < employees.length; i++) {
            int id = countAdd();
            if (employees[i].getDepartment() == kindDepartment) {
                System.out.println(id + " " + " " + employees[i].getFullName() + " " + employees[i].getSalary());
            }
        }
    }

    public static void getEmployeeMaxSum(Employee[] employees, int kindDepartment) {
        int maxSum = 0;
        String luckyEmployee = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == kindDepartment && employees[i].getSalary() > maxSum) {
                luckyEmployee = employees[i].getFullName();
                maxSum = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой" + " " + maxSum + " " + luckyEmployee);
    }

    public static void getEmployeeMinSum(Employee[] employees, int kindDepartment) {
        int minSum = employees[0].getSalary();
        String unluckyEmployee = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == kindDepartment && employees[i].getSalary() < minSum) {
                minSum = employees[i].getSalary();
                unluckyEmployee = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудник с минимальноой зарплатой" + " " + minSum + " " + unluckyEmployee);
    }

    static double calculateTotalSum(Employee[] employees, int kindDepartment) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == kindDepartment) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    static void printTotalSum(double sum) {
        System.out.println("Cумма затрат на зарплаты в месяц " + sum);
    }

    static void calculateAverageSum(double sum, Employee[] employees, int kindDepartment) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            boolean isNeedDepartment = employees[i].getDepartment() == kindDepartment;
            if (isNeedDepartment == true) {
                count++;
            }
        }
        double averageAmount = sum / count;
        System.out.println("Cреднее значение зарплат " + averageAmount);
    }

    static void indexSumDepartment(Employee[] employees, int indexInterest, int kindDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == kindDepartment) {
                double indexSum = (employees[i].getSalary()) + (employees[i].getSalary() * indexInterest / 100);
                System.out.println(employees[i].getFullName() + " " + indexSum);
            }
        }
    }

    public static void listMorePargSalary(Employee[] employees, double pargSalary) {
        for (int i = 0; i < employees.length; i++) {
            int id2 = countAdd() - 10;
            if (employees[i].getSalary() >= pargSalary) {
                System.out.println(id2 + " " + " " + employees[i].getFullName() + " " + employees[i].getSalary());
            }
        }
    }

    public static void listLessPargSalary(Employee[] employees, double pargSalary) {
        for (int i = 0; i < employees.length; i++) {
            int id2 = countAdd() - 20;
            if (employees[i].getSalary() < pargSalary) {
                System.out.println(id2 + " " + " " + employees[i].getFullName() + " " + employees[i].getSalary());
            }
        }
    }
}


