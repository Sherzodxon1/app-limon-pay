package uz.com.applimonpay.repo;

import org.springframework.stereotype.Repository;
import uz.com.applimonpay.base.BaseRepository;
import uz.com.applimonpay.entity.User;

@Repository
public interface UserRepo extends BaseRepository<User> {
}
