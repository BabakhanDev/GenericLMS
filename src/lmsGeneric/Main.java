package lmsGeneric;

import lmsGeneric.model.Animal;
import lmsGeneric.model.Gender;
import lmsGeneric.model.Person;
import lmsGeneric.service.GenericService;
import lmsGeneric.service.impl.AnimalServiceImpl;
import lmsGeneric.service.impl.PersonServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//     todo   Срок сдачи : 18.09.2024 / 06:00
//        1) Жаны проект тузунуз.
//        2) 3 жаны пакет тузунуз - model, dao, service
//        3) model пакеттин ичине Person, Animal деген класс тузунуз, свойствалары - id, name, age, Gender .
//                - Genderди enum кылып башка пакетке тузуп койсонуз болот.
//        5) service пакеттин ичине GenericService деген generic interface тузунуз жана impl деген пакет тузуп коюнуз.
//        6) GenericServiceтин ичинде 7 метод болот:
//        String add(List<T>t);
//        T getById(Long id);
//        List<T> getAll();
//        List<T> sortByName(); 1 ди басканда ascending, 2 ни басканда descending кылып сорттосун
//        List<T> filterByGender(); 1 ди басканда female, 2 ни басканда male кылып фильтрлесин
//        List<T> clear();
//        7) impl пакеттин ичине PersonServiceImpl, AnimalServiceImpl деген класстарды тузунуз, бул класстар GenericService интерфейсин ишке ашырат .
//        9) Main класста бардык методдорду чакырып иштетиниз.

        GenericService genericServiceAnimal = new AnimalServiceImpl();
        genericServiceAnimal.add( new Animal(1L,"Dog",5, Gender.MALE));
        genericServiceAnimal.add( new Animal(2L,"Cat",3,Gender.FEMALE));
        genericServiceAnimal.add( new Animal(3L,"Hourse",5, Gender.MALE));
        genericServiceAnimal.add( new Animal(4L,"Cow",3,Gender.FEMALE));

//        System.out.println(genericService.getAll());
//        System.out.println(".........................................");
//        System.out.println(genericService.getById(2L));
//        System.out.println(".........................................");
//        System.out.println(genericService.sortByName());
//        System.out.println(".........................................");
//        System.out.println(genericService.filterByGender(Gender.MALE));
//        System.out.println(".........................................");
//        System.out.println("Выберите 1 - FEMALE, 2 - MALE");
//        System.out.println(genericService.filterByGender(2));
//        System.out.println(".........................................");
//        System.out.println(genericService.filterByGender(1));
//        System.out.println(".........................................");
//        System.out.println(genericService.clear());
//        System.out.println(genericService.getAll());


        GenericService genericServicePerson = new PersonServiceImpl();
        genericServicePerson.add(new Person(1L,"Khan",25,Gender.MALE));
        genericServicePerson.add(new Person(2L,"Aida",27,Gender.FEMALE));
        genericServicePerson.add(new Person(3L,"Nurs",35,Gender.MALE));
        genericServicePerson.add(new Person(4L,"Bekjan",19,Gender.MALE));
        System.out.println(".........................................");
//        System.out.println(genericServicePerson.getAll());
//        System.out.println(".........................................");
//        System.out.println(genericServicePerson.getById(3L));
//        System.out.println(".........................................");
////        System.out.println(genericServicePerson.sortByName());
//        System.out.println(".........................................");
//        System.out.println("Выберите 1 - FEMALE, 2 - MALE");
//        System.out.println(genericServicePerson.filterByGender(1));
//        System.out.println(".........................................");
//        System.out.println(genericServicePerson.filterByGender(2));
//        System.out.println(".........................................");
//        System.out.println(genericServicePerson.clear());
//        System.out.println(".........................................");


    }
}
