package by.epam.jwdsc.entity;

import java.util.List;

public interface UserBuilder<S extends UserBuilder, T> {

    S id(long id);

    S firstName(String firstName);

    S secondName(String secondName);

    S patronymic(String patronymic);

    S address(Address address);

    S phones(List<String> phones);

    S email(String email);

    S userRole(UserRole email);

    T build();
}
