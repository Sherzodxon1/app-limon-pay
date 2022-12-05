package uz.applimonpay.repository;

import org.springframework.stereotype.Repository;
import uz.applimonpay.base.BaseRepository;
import uz.applimonpay.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends BaseRepository<User> {
    List<User> findAllByUuid(UUID userUid);

    Optional<User> findByUuid(UUID userUid);

    User findByUuid(String uuid);
}