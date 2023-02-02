package sprint3_watch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sprint3_watch.model.WatchProducer;


public interface IWatchProducerRepository extends JpaRepository<WatchProducer, Integer> {
}
