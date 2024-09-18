package lmsGeneric.dao.impl;

import lmsGeneric.dao.GenericDao;
import lmsGeneric.model.Animal;
import lmsGeneric.model.Gender;


import java.util.*;

import static lmsGeneric.db.Database.animals;

public class AnimalDaoImpl implements GenericDao<Animal> {
    @Override
    public String add(Animal t) {
        return String.valueOf(animals.add(t));
    }

    @Override
    public Animal getById(Long id) {
        for (Animal animal : animals) {
            if (animal.getId().equals(id)) {

                return animal;
            }
        }
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return animals;

    }

    @Override
    public List<Animal> sortByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВЫберите 1 - asc, 2 - desc: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            animals.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
            return animals;
        } else {
            if (choice == 2) {
                animals.sort((a1, a2) -> a2.getName().compareTo(a1.getName()));
                return animals;
            }
        }

        return null;
    }

    @Override
    public List<Animal> filterByGender(int gender) {
        List<Animal> filteredList = new ArrayList<>();
        for (Animal animal : animals) {
            if (gender == 1 && animal.getGender() == Gender.FEMALE) {
                filteredList.add(animal);
            } else if (gender == 2 && animal.getGender() == Gender.MALE) {
                filteredList.add(animal);
            }
        }
        return filteredList;
    }


@Override
public List<Animal> clear() {
    animals.clear();
    System.out.println("Тизме тазаланды.");
    return animals;
}


//    @Override
//    public String add(List t) {
//        return String.valueOf(Database.animals.add((Animal) t));
//    }
//
//    @Override
//    public Object getById(Long id) {
//        for (Animal animal : Database.animals) {
//            animal.getId().equals(id); {
//                return animal;
//            }
//        }
//        return null;
//
//    }
//
//    @Override
//    public List getAll() {
//        return Database.animals;
//    }
//
////     if (ascOrDesc.equalsIgnoreCase("asc")) {
////        Collections.sort(movies, Comparator.comparing(Movie::getName));
////    } else {
////        Collections.sort(movies, Comparator.comparing(Movie::getName).reversed());
//
//
//
//
//    @Override
//    public List sortByName() {
//        Collections.sort(Database.animals, new Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        return Database.animals;
//    }
//
//    @Override
//    public List filterByGender() {
//        Scanner scanner = new Scanner(System.in);
//         int number1 = 1;
//         int number2 = 2;
//         if (scanner)
//        for (Animal animal : Database.animals) {
//            if (animal.getGender()== Gender.MALE)
//
//        }
//        return List.of();
//    }
//
//    @Override
//    public List clear() {
//        return List.of();
//    }
}
