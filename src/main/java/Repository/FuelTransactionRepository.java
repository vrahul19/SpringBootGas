package Repository;

import Entity.FuelTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuelTransactionRepository extends JpaRepository<FuelTransaction, Long> {
}
