public class Application {
    public static void main(String[] args) {
        Person person = new Person("Adam", 40.5, 178);
        person.checkAge();
    }
}

class Person {

    private String name;
    private double age;
    private double height;

    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkNameAndAge(){
        if(this.name != null){
            if(this.getAge() > 30 && this.getHeight() > 160){
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}
