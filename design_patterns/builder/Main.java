package dhanush_ldp.design_patterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Fake", "Me")
                .setAge(25)
                .setAddress("123 Fake Address")
                .setPhoneNumber("1234567890")
                .setEmail("FakeMe@yopmail.com")
                .setOccupation("Engineer")
                .setNationality("Indian")
                .setMarried(false)
                .build();

        System.out.println(person.toString());
    }
}
