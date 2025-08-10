package MaasHesaplama;

public class Employee {
    // Nitelikler
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu Metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Bonus hesaplama
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Maaş zammı hesaplama
    public double raiseSalary() {
        int currentYear = 2021;
        int workYears = currentYear - hireYear;

        if (workYears < 10) {
            return salary * 0.05;
        } else if (workYears < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    // Bilgileri yazdırma
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = salary - tax + bonus;
        double totalSalary = salary + raise;

        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaaş Artışı: " + raise +
                "\nVergi ve Bonuslar ile Maaş: " + salaryWithTaxAndBonus +
                "\nToplam Maaş (Zamlı): " + totalSalary;
    }
}
