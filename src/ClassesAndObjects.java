import java.util.Objects;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static class Dog {
        final String name;

        Dog(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || !(o instanceof Dog)) return false;

            Dog dog = (Dog) o;

            return name != null ? name.equals(dog.name) : dog.name == null;
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }
    }


    public static void main(String args[]) {
        Dog fido = new Dog("Fido");
        Dog fido2 = new Dog("Fido");

        System.out.println("fido == fido2: " + (fido == fido2));

        System.out.println("fido.equals(fido2): " + fido.equals(fido2));
        Person yoki = new Person();
        yoki.setName("yoki");

        Person nikkie= new Person();
        nikkie.setName("nikkie");

        Cat garfield = new Cat();
        garfield.setName("garfield");
        garfield.setFavoriteFood("Lasagna");
        garfield.setAge(12);
        garfield.setOwner(nikkie);

        Cat pinkPanther = new Cat();
        pinkPanther.setName("pink panther");
        pinkPanther.setFavoriteFood("pizza");
        pinkPanther.setAge(11);
        pinkPanther.setOwner(yoki);

        Cat catwomen = new Cat();
        catwomen.setName("catwomen");
        catwomen.setFavoriteFood("cheeseburger");
        catwomen.setAge(10);
        Person george = new Person();
        george.setName("george");
        isOlder(pinkPanther, catwomen);
        System.out.println(isOlder(garfield, pinkPanther));
        adoption(garfield, george);
        System.out.println(isSibling(pinkPanther,garfield));

    }

    public static boolean isOlder(Cat cat1, Cat cat2) {
        return cat1.getAge() > cat2.getAge();
    }

    public void makeBestFriends(Cat cat1, Cat cat2) {
        if (cat1 != cat2) {
            cat2.setFavoriteFood(cat1.getFavoriteFood());
        }
        System.out.println(cat2.getFavoriteFood());
    }

    public Cat makeKitten(Cat cat1, Cat cat2) {
        Cat childCat = new Cat();
        if (!cat1.equals(cat2)) {
            childCat.setName(cat1.getName() + cat2.getName());

        }
        return childCat;
    }

    public static void adoption(Cat cat1, Person person1) {
        cat1.setOwner(person1);
        System.out.println(cat1.getOwner() + " is now " + cat1.getName() + "'s owner");
        if (Objects.equals(cat1.getName(), "catwoman")) {
            System.out.println(cat1 + " is nobodies owner");

        }

    }
    public static boolean isSibling(Cat cat1, Cat cat2){

        return cat1.getOwner().equals(cat2.getOwner());
    }

}
