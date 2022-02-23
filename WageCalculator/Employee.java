package WageCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        System.out.println(this);
    }

    int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else return 0;
    }

    double raiseSalary() {
        int year = 2021 - this.hireYear;
        if (year < 10) return this.salary * 0.05;
        else if (year < 20) return this.salary * 0.1;
        else return this.salary * 0.15;
    }

    double tax() {
        if (this.salary < 1000) return 0;
        else return (this.salary * 0.03);
    }

    @Override
    public String toString() {
        return "Adı            : " + this.name + "\n" +
                "Maaşı         : " + this.salary + "\n" +
                "Çalışma saati : " + this.workHours + "\n" +
                "Başlangıç Yılı: " + this.hireYear + "\n" +
                "Vergi         : " + tax() + "\n" +
                "Bonus         : " + bonus() + "\n" +
                "Maaş Artışı   : " + raiseSalary() + "\n" +
                "Vergiler ve Bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()) + "\n" +
                "Toplam Maaş   : " + (this.salary+raiseSalary());

    }
}
