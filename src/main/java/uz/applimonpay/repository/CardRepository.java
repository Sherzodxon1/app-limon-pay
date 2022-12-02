package uz.applimonpay.repository;

import org.springframework.stereotype.Repository;
import uz.applimonpay.base.BaseRepository;
import uz.applimonpay.entity.Card;

import java.util.Optional;

@Repository
public interface CardRepository extends BaseRepository<Card> {
}
