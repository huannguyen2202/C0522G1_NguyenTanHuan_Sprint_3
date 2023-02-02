package sprint3_watch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sprint3_watch.repository.IWatchProducerRepository;
import sprint3_watch.service.IWatchProducerService;


import java.util.List;

@Service
public class WatchProducer implements IWatchProducerService {
    @Autowired
    private IWatchProducerRepository iWatchProducerRepository;

    @Override
    public List<sprint3_watch.model.WatchProducer> findAll() {
        return iWatchProducerRepository.findAll();
    }
}
