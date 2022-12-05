package uz.applimonpay.repository;

import org.springframework.stereotype.Repository;
import uz.applimonpay.base.BaseRepository;
import uz.applimonpay.entity.Card;
import uz.applimonpay.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CardRepository extends BaseRepository<Card> {
    List<Card> findAllByUuid(UUID cardUid);

    Optional<Card> findByUuid(UUID cardUid);
}
