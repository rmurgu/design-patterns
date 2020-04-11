package creational.builder;

import creational.builder.immutabe.UserImmutableDTO;

import java.time.LocalDate;

public class AppImmutableBuilder {

    public static void main(String[] args) {
        User user = createUser();
        UserImmutableDTO userImmutableDTO = UserImmutableDTO.getBuilder()
                .withFirstName(user.getFirstName())
                .withFirstName(user.getLastName())
                .withAddress(user.getAddress())
                .withAge(user.getBirthday())
                .build();
        System.out.println(userImmutableDTO);
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }
}
