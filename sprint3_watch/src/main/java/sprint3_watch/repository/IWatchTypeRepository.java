package sprint3_watch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sprint3_watch.model.WatchType;


public interface IWatchTypeRepository extends JpaRepository<WatchType, Integer> {
}
