package lmsGeneric.dao.impl;

import lmsGeneric.dao.GenericDao;
import lmsGeneric.db.Database;
import lmsGeneric.model.Animal;
import lmsGeneric.model.Gender;
import lmsGeneric.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lmsGeneric.db.Database.animals;
import static lmsGeneric.db.Database.people;

public class PersonDaoImpl implements GenericDao <Person> {


    @Override
    public String add(Person person) {
               Database.people.add(person);
        return " Successfully added: ";
    }

    @Override
    public Person getById(Long id) {
        for (Person person : Database.people) {
            if (person.getId().equals(id)){
                return person;
            }

        }
        return null;
    }

    @Override
    public List<Person> getAll() {
        return Database.people;
    }

    @Override
    public List<Person> sortByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВЫберите 1 - asc, 2 - desc: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Database.people.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
            return people;
        } else {
            if (choice == 2) {
               people.sort((a1, a2) -> a2.getName().compareTo(a1.getName()));
                return people;
            }
        }

        return null;
    }

    @Override
    public List<Person> filterByGender(int gender) {
        List<Person> filteredList = new ArrayList<>();
        for (Person person : people) {
            if (gender == 1 && person.getGender() == Gender.FEMALE) {
                filteredList.add(person);
            } else if (gender == 2 && person.getGender() == Gender.MALE) {
                filteredList.add(person);
            }
        }
        return filteredList;
    }

    @Override
    public List<Person> clear() {
       people.clear();
        System.out.println("Тизме тазаланды.");
        return people;
    }
}
