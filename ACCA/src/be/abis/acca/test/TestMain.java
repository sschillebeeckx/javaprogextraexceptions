package be.abis.acca.test;

import be.abis.acca.exception.AgeException;
import be.abis.acca.model.*;

public class TestMain {

    public static void main(String[] args) {
        Address a = new Address("Diestsevest","32 bus 4B","3000","Leuven","Belgium","BE");
        Company c = new Company("Abis",a);
        Person p1 = new Person("Ann","Smits",35,c);
        Person p2 = new Person("Yvette","Van den Acker",70);
        Person p3 = new Person("John","Doe",17);

        System.out.println("----------------------Persons-----------------------------------");
        Person[] persons = {p1,p2,p3};
        for (Person p:persons){
            try {
                System.out.println(p.getFirstName() + " is " + p.calculateAge() + " years old.");
            } catch (AgeException e) {
                System.out.println(p.getFirstName() + ": " +e.getMessage());
            }
        }







    }
}
