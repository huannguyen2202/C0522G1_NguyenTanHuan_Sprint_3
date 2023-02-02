package sprint3_watch.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import sprint3_watch.dto.IWatchDto;
import sprint3_watch.model.Watch;


import java.util.Optional;

@Transactional
public interface IWatchRepository extends JpaRepository<Watch, Integer> {
    @Query(value = "select watch.id as id, " +
            "watch.name as name, " +
            "watch.price as price, " +
            "watch.discount as discount, " +
            "watch.image as image, " +
            "watch.detail as detail, " +
            "watch_type.name as type, " +
            "watch_producer.name as producer " +
            "from watch " +
            "join watch_type on watch.watch_type_id = watch_type.id " +
            "join  watch_producer on watch.watch_producer_id = watch_producer.id " +
            "where watch.name like %:nameSearch% " +
            "and watch.is_delete = 0",
            countQuery = "select count(*) " +
                    "from watch " +
                    "join watch_type on watch.watch_type_id = watch_type.id " +
                    "join watch_producer on watch.watch_producer_id = watch_producer.id " +
                    "where watch.name like %:nameSearch% " +
                    "and watch.is_Delete = 0", nativeQuery = true)
    Page<IWatchDto> searchWatch(@Param("nameSearch") String nameSearch, Pageable pageable);

    @Query(value = "select watch.id as id, " +
            "watch.name as name, " +
            "watch.price as price, " +
            "watch.discount as discount, " +
            "watch.image as image, " +
            "watch.detail as detail, " +
            "watch_type.name as type, " +
            "watch_producer.name as producer " +
            "from watch " +
            "join watch_type on watch.watch_type_id = watch_type.id " +
            "join  watch_producer on watch.watch_producer_id = watch_producer.id " +
            "where watch.id = :id " +
            "and watch.is_delete = 0",
            nativeQuery = true)
    Optional<IWatchDto> searchWatchDetail(@Param("id") int id );
}
