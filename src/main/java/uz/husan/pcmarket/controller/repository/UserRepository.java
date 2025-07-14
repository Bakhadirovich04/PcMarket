package uz.husan.pcmarket.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.husan.pcmarket.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
