package creational.builder.externalClass;

import creational.builder.Address;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String firstName);

    UserDTOBuilder withLastName(String lastName);

    UserDTOBuilder withAddress(Address address);

    UserDTOBuilder withAge(LocalDate age);

    UserDTO build();

    UserDTO getUserDTO();
}
