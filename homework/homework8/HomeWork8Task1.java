package homework8;

public class HomeWork8Task1 {

    public static void main(final String[] args) {
        Student yegor = new Student();
        yegor.setName("Yegor");
        yegor.setAge(20);
        yegor.setGender("male");
        yegor.setWeight(83.2);
        yegor.setYearOfStudy(2022);
        yegor.addYearOfStudy(1);

        System.out.println(yegor.getName() + " " + yegor.getAge() + " " + yegor.getGender() + " " + yegor.getYearOfStudy() + " " + yegor.getWeight());
    }

}

class Man {
    private String name, gender;
    private int age;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}

class Student extends Man {
    private int yearOfStudy;

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void addYearOfStudy(int years) {
        this.yearOfStudy += years;
    }

}