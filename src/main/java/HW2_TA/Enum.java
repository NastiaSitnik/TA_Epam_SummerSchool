package HW2_TA;

import java.util.ArrayList;

import java.util.Scanner;

public enum Enum {
    ADD,
    REMOVE,
    SORT,
    GETALL,
    GETTBRAND,
    EXIT;
}

class Main {
    static Enum option;

    public Main(Enum option) {
        this.option = option;
    }

    public static void removeCar(ArrayList<Car> cars, String model) {
        for (int i = 0; i < cars.size(); i++) {

            if (cars.get(i).getModel().equals(model)) {
                cars.remove(i);
            }

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<BMW> bmw = new ArrayList<>();
        ArrayList<Mercedes> mercedes = new ArrayList<>();

        System.out.println("What brand do you choose? 1- BMW  2-Mercedes");
        int choice = scanner.nextInt();
        boolean tepm = true;
        if (choice == 1) {
            do {
                String brand = "BMW";
                System.out.println("what do you want to do? ADD,REMOVE,SORT or EXIT ? ");
                Enum option = Enum.valueOf(scanner.next());

                switch (option) {
                    case ADD:
                        System.out.println("Now write a model of car that you add : ");
                        String model = scanner.next();
                        cars.add(new BMW(model));
                        break;
                    case REMOVE:
                        System.out.println("Car with wich model do you want to delete? ");
                        String Model = scanner.next();
                        removeCar(cars, Model);
                    case SORT:
                        for (int i = 0; i < cars.size(); i++) {

                            if (cars.get(i).getBrand().equals(brand)) {
                                bmw.add((BMW) cars.get(i));
                            }
                        }
                        // sort
                    case GETALL:
                        for (int i = 0; i < cars.size(); i++) {
                            System.out.println(cars.get(i).toString());
                        }
                        break;
                    case GETTBRAND:
                        for (int i = 0; i < bmw.size(); i++) {
                            System.out.println(bmw.get(i).toString());
                        }
                        break;
                    case EXIT:
                        tepm = false;
                        break;
                }
            } while (tepm);
        } else if (choice == 2) {
            String brand = "Mercedes";
            System.out.println("what do you want to do? ADD,REMOVE,SORT or EXIT ? ");
            Enum option = Enum.valueOf(scanner.next());

            switch (option) {
                case ADD:
                    System.out.println("Now write a model of car that you add : ");
                    String model = scanner.next();
                    cars.add(new Mercedes(model));
                    break;
                case REMOVE:
                    System.out.println("Car with wich model do you want to delete? ");
                    String Model = scanner.next();
                    removeCar(cars, Model);
                case SORT:
                    for (int i = 0; i < mercedes.size(); i++) {

                        if (cars.get(i).getBrand().equals(brand)) {
                            mercedes.add((Mercedes) mercedes.get(i));
                        }

                    }
                    //mercedes.sort();
                case GETALL:
                    for (int i = 0; i < bmw.size(); i++) {
                        System.out.println(bmw.get(i).toString());
                    }
                    break;
                case GETTBRAND:
                    for (int i = 0; i < mercedes.size(); i++) {
                        System.out.println(mercedes.get(i).toString());
                    }
                case EXIT:
                    tepm = false;
                    break;
            }
        }
        while (tepm) ;
    }


}


