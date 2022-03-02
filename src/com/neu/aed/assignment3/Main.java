package com.neu.aed.assignment3;

public class Main {
    public static void main(String[] args) {
        SeattlePoliceDepartment seattlePoliceDepartment = new SeattlePoliceDepartment();
        Person person1 = new Person("Greg", 29);
        Person person2= new Person("Robin", 55);
        Person person3 = new Person("Lilly", 30);
        Person person4 = new Person("Suzi", 45);
        Person person5 = new Person("Anna", 25);

        person1.subscribe(seattlePoliceDepartment);
        person2.subscribe(seattlePoliceDepartment);
        person3.subscribe(seattlePoliceDepartment);
        person4.subscribe(seattlePoliceDepartment);
        person5.subscribe(seattlePoliceDepartment);

        seattlePoliceDepartment.notifyCitizens("Robbery");

        person5.unsubscribe(seattlePoliceDepartment);
        person4.unsubscribe(seattlePoliceDepartment);
        person3.unsubscribe(seattlePoliceDepartment);

        /*
        Will return person greg and robin
         */
        seattlePoliceDepartment.notifyCitizens("Threats");



    }
}
