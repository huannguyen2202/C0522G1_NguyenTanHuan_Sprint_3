package sprint3_watch.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sprint3_watch.dto.IWatchDto;


import java.util.Optional;

public interface IWatchService {
    Page<IWatchDto> searchWatch(String nameSearch, Pageable pageable);
    Optional<IWatchDto> findById(Integer id);
}
