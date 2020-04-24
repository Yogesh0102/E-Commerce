package shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import shopping.model.OrderHistory;
import shopping.model.Users;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderHistoryRepository  extends MongoRepository<OrderHistory , String>
{
    List<OrderHistory> findAllByUser(Optional<Users> users);
}
