package creational.builder.externalClass;

import creational.builder.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private UserDTO userDTO;
    private String firstName;
    private String lastName;
    private String address;
    private String age;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet()
                + "\n" + address.getCity() + ", " + address.getState()
                + "\n" + address.getZipcode();
        return this;
    }

    @Override
    public UserDTOBuilder withAge(LocalDate date) {
        Period period = Period.between(date, LocalDate.now());
        this.age = Integer.toString(period.getYears());
        return this;
    }

    @Override
    public UserDTO build() {
        this.userDTO = new UserWebDTO(firstName + " " + lastName, address, age);
        return userDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userDTO;
    }
}
