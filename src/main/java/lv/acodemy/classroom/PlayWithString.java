package lv.acodemy.classroom;

public class PlayWithString {
    public static void main(String[] args) {
        String name = "Vitolds";
        String surname = "Galilejevs";

        // My name is: Vitolds Galilejevs

        // Concatenation

        String myText = "My name is: " + name + " " + surname;
        System.out.println(myText);

        // Interpolation
        // %s for text: %d for number

        String interpolation = String.format("My name is: %s %s", name, surname);
        System.out.println(interpolation);

        String firstname = "John";
        String lastname = "Doe";
        int age = 25;
        String city = "New York";
        System.out.println(firstname + " " + lastname);
        // John Doe is 25 years old and lives in New York

        System.out.println(firstname + " " + lastname + " is " + age + "years old and lives in" + city);
        System.out.println(String.format("%s %s is %d years old and lives in %s", firstname, lastname, age, city));

    }
}
