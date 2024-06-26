package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List handWrittenLoadOfData() {
        ArrayList<Person> students = new ArrayList<>();

        Person newPerson = new Person("Teddy", "Archibald");
        newPerson.setFavDrink("Half&Half");
        newPerson.setFavColor("Red");
        newPerson.setMonth("March");
        newPerson.setHasPet(false);
        students.add(newPerson);

        Person newPerson1 = new Person("Peter", "Van Beeve");
        newPerson1.setFavDrink("Latte");
        newPerson1.setFavColor("Purple");
        newPerson1.setMonth("February");
        newPerson1.setHasPet(true);
        students.add(newPerson1);

        Person newPerson2 = new Person("Tim", "Linkous");
        newPerson2.setFavDrink("water");
        newPerson2.setFavColor("Green");
        newPerson2.setMonth("September");
        newPerson2.setHasPet(false);
        students.add(newPerson2);

        Person newPerson3 = new Person("Qian ", "Wang");
        newPerson3.setFavDrink("Water");
        newPerson3.setFavColor("Blue");
        newPerson3.setMonth("august");
        newPerson3.setHasPet(false);
        students.add(newPerson3);

        Person newPerson4 = new Person("Diptika", "Devi");
        newPerson4.setFavDrink("Tea");
        newPerson4.setFavColor("Orange");
        newPerson4.setMonth("June");
        newPerson4.setHasPet(false);
        students.add(newPerson4);

        Person newPerson5 = new Person("Ian", "Gordon");
        newPerson5.setFavDrink("water");
        newPerson5.setFavColor("green");
        newPerson5.setMonth("april");
        newPerson5.setHasPet(true);
        students.add(newPerson5);

        Person newPerson6 = new Person("Tim", "Nguyen");
        newPerson6.setFavDrink("Bubble Tea");
        newPerson6.setFavColor("white");
        newPerson6.setMonth("November");
        newPerson6.setHasPet(true);
        students.add(newPerson6);

        Person newPerson7 = new Person("Bryan", "Smith");
        newPerson7.setFavDrink("water");
        newPerson7.setFavColor("brown");
        newPerson7.setMonth("May");
        newPerson7.setHasPet(false);
        students.add(newPerson7);

        Person newPerson8 = new Person("Jonathan ", "Diehl");
        newPerson8.setFavDrink("Coffee");
        newPerson8.setFavColor("Green");
        newPerson8.setMonth("February");
        newPerson8.setHasPet(true);
        students.add(newPerson8);

        Person newPerson9 = new Person("Jared", "Thacker");
        newPerson9.setFavDrink("water");
        newPerson9.setFavColor("green");
        newPerson9.setMonth("december");
        newPerson9.setHasPet(true);
        students.add(newPerson9);

        Person newPerson10 = new Person("Robbie", "Niemeyer");
        newPerson10.setFavDrink("Water");
        newPerson10.setFavColor("Blue");
        newPerson10.setMonth("January");
        newPerson10.setHasPet(false);
        students.add(newPerson10);

        Person newPerson11 = new Person("Mohammed", "n");
        newPerson11.setFavDrink("snapple");
        newPerson11.setFavColor("green");
        newPerson11.setMonth("august");
        newPerson11.setHasPet(false);
        students.add(newPerson11);


        Person newPerson12 = new Person("Josue", "Castro");
        newPerson12.setFavDrink("coffee");
        newPerson12.setFavColor("blue");
        newPerson12.setMonth("june");
        newPerson12.setHasPet(true);
        students.add(newPerson12);

        Person newPerson13 = new Person("Corey", "Ross");
        newPerson13.setFavDrink("Water");
        newPerson13.setFavColor("Black");
        newPerson13.setMonth("October");
        newPerson13.setHasPet(false);
        students.add(newPerson13);

        Person newPerson14 = new Person("Will", "Chapman");
        newPerson14.setFavDrink("Water");
        newPerson14.setFavColor("Purple");
        newPerson14.setMonth("December");
        newPerson14.setHasPet(false);
        students.add(newPerson14);


        // and so on for EACH person in the cohort.

        return students;
    }

//    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "FakeData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

        List listOfStudents = programObject.handWrittenLoadOfData();

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(listOfStudents.get(i).toString());
        }
    }
}

//    private List loadCSVFile(String student_source) {
//        ArrayList<Person> records = new ArrayList<>();
//
//        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);
//
//        try (Scanner scanner = new Scanner(inputStream)) {
//            while (scanner.hasNextLine()) {
//                records.add(this.getRecordFromLine(scanner.nextLine()));
//            }
//        } catch (Exception e) {
//            System.out.println("File NOT FOUND.");
//            e.printStackTrace();
//        }
//        return records;
//    }

//    private Person getRecordFromLine(String line) {
//        // take the String of lastname,firstname and create a new Person object with it.
//        String[] values = line.split(COMMA_DELIMITER);
//        Person newPerson = new Person(values[0], values[1]);
//        return newPerson;
//    }

//};
