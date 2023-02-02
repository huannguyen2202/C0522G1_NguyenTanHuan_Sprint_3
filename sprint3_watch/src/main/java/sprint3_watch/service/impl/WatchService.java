package sprint3_watch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import sprint3_watch.dto.IWatchDto;
import sprint3_watch.repository.IWatchRepository;
import sprint3_watch.service.IWatchService;


import java.util.Optional;

@Service
public class WatchService implements IWatchService {
    @Autowired
    private IWatchRepository iWatchRepository;

    @Override
    public Page<IWatchDto> searchWatch(String nameSearch, Pageable pageable) {
        return iWatchRepository.searchWatch(nameSearch, pageable);
    }

    @Override
    public Optional<IWatchDto> findById(Integer id) {
        return iWatchRepository.searchWatchDetail(id);
    }


}
