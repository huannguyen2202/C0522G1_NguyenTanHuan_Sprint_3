package sprint3_watch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sprint3_watch.model.WatchType;
import sprint3_watch.repository.IWatchTypeRepository;
import sprint3_watch.service.IWatchTypeService;


import java.util.List;

@Service
public class WatchTypeService implements IWatchTypeService {
    @Autowired
    private IWatchTypeRepository iWatchTypeRepository;

    @Override
    public List<WatchType> findAll() {
        return iWatchTypeRepository.findAll();
    }
}
