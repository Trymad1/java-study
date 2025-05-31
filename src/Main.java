public class Main {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Dog dog = new Dog("dogname");
        Cat cat = new Cat("catname");

        Animal animal = new Dog("animalname");

    }
}
