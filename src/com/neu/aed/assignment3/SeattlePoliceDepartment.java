package com.neu.aed.assignment3;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    ArrayList<Person> persons;
    String notifyCrime;

    public SeattlePoliceDepartment(){
        this.persons = new ArrayList<>();
    }

    public void notifyCitizens(String notifyCrime){
        this.notifyCrime = notifyCrime;
        for(Person person : persons){
            person.getNotification(this);
        }
    }
}
