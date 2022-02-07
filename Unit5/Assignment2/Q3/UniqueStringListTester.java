package Assignment2.Q3;

public class UniqueStringListTester {
    public static void main(String[] args) {
        UniqueStringList names = new UniqueStringList();
        names.setCaseSensitive(false);
        names.add("Bob");
        names.add("Jill");
        names.add("John");
        names.add("Jill");
        names.add("jill");
        System.out.println(names);

        UniqueStringList names2 = new UniqueStringList();
        names2.setCaseSensitive(true);
        names2.add("Bob");
        names2.add("Jill");
        names2.add("John");
        names2.add("Jill");
        names2.add("jill");
        names2.remove("John");
        System.out.println(names2);
    }

}
