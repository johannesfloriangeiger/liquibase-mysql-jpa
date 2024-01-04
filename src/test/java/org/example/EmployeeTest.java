package org.example;

import jakarta.persistence.Persistence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void shouldFindEmployee() {
        try (final var entityManagerFactory = Persistence.createEntityManagerFactory("test");
             final var entityManager = entityManagerFactory.createEntityManager()) {
            final var expected = new Employee(1, "Alice");
            final var actual = entityManager.find(Employee.class, 1);
            assertEquals(expected, actual);
        }
    }
}