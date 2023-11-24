package chapters.twoThreeForAndFive.challenges.health;

import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    private String name;
    private String lastName;
    private int year;
    private int month;
    private int day;
    private int age;
    private double weight;
    private double height;
    private CalculatorImc imc;
    private HeartRates heartRates;


    public HealthProfile(String name, String lastName, int year, int month, int day, double weight, double height) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.month = month;
        this.day = day;
        this.weight = weight;
        this.height = height;

        this.age = calculateAge();

        imc = new CalculatorImc(weight, height);
        heartRates = new HeartRates(age);
    }

    private int calculateAge() {
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        return age.getYears();
    }

    public CalculatorImc getImc() {
        return imc.clone();
    }

    public HeartRates getHeartRates() {
        return heartRates.clone();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
