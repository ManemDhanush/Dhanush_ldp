package dhanush_ldp.design_patterns.builder;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final String phoneNumber;
    private final String email;
    private final String occupation;
    private final String nationality;
    private final boolean isMarried;

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.occupation = builder.occupation;
        this.nationality = builder.nationality;
        this.isMarried = builder.isMarried;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean isMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(firstName).append("\n");
        sb.append("Last Name: ").append(lastName).append("\n");
        sb.append("Age: ").append(age).append("\n");
        sb.append("Address: ").append(address).append("\n");
        sb.append("Phone Number: ").append(phoneNumber).append("\n");
        sb.append("Email: ").append(email).append("\n");
        sb.append("Occupation: ").append(occupation).append("\n");
        sb.append("Nationality: ").append(nationality).append("\n");
        sb.append("Married: ").append(isMarried).append("\n");

        return sb.toString();
    }

    public static class PersonBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String address;
        private String phoneNumber;
        private String email;
        private String occupation;
        private String nationality;
        private boolean isMarried;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder setOccupation(String occupation) {
            this.occupation = occupation;
            return this;
        }

        public PersonBuilder setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public PersonBuilder setMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}