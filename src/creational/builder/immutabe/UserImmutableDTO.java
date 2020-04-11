package creational.builder.immutabe;

import creational.builder.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserImmutableDTO {

    private String name;
    private String address;
    private String age;

    private UserImmutableDTO() {
    }

    public static UserImmutableDTOBuilder getBuilder() {
        return new UserImmutableDTOBuilder();
    }

    public static class UserImmutableDTOBuilder {

        private String firstName;
        private String lastName;
        private String address;
        private String age;

        public UserImmutableDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserImmutableDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserImmutableDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", " + address.getStreet()
                    + "\n" + address.getCity() + ", " + address.getState()
                    + "\n" + address.getZipcode();
            return this;
        }

        public UserImmutableDTOBuilder withAge(LocalDate birthday) {
            Period period = Period.between(birthday, LocalDate.now());
            this.age = Integer.toString(period.getYears());
            return this;
        }

        public UserImmutableDTO build() {
            UserImmutableDTO userImmutableDTO = new UserImmutableDTO();
            userImmutableDTO.setName(firstName + " " + lastName);
            userImmutableDTO.setAddress(address);
            userImmutableDTO.setAge(age);
            return userImmutableDTO;
        }

    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserImmutableDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
