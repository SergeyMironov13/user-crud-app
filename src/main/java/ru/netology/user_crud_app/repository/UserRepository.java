package ru.netology.user_crud_app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.netology.user_crud_app.model.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByNameIgnoreCase(String name);

    List<User> findByAge(Integer age);

    List<User> findByAgeGreaterThan(Integer age);

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
