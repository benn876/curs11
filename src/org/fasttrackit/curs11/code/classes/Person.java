package org.fasttrackit.curs11.code.classes;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    class Address{
        private final String street;
        private final String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        public void showAddress(){
            System.out.printf("The address of %s is: %s, %s%n", Person.this.name, street, city);
        }
    }

    static class School{
        private final String schoolName;

        School(String schoolName) {
            this.schoolName = schoolName;
        }

        public String getSchoolName() {
            return schoolName;
        }
    }
}
