package sprint3_watch.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sprint3_watch.dto.IWatchDto;
import sprint3_watch.model.WatchProducer;
import sprint3_watch.model.WatchType;
import sprint3_watch.service.IWatchProducerService;
import sprint3_watch.service.IWatchService;
import sprint3_watch.service.IWatchTypeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/watch")
@CrossOrigin("*")
public class WatchController {

    @Autowired
    private IWatchService iWatchService;

    @Autowired
    private IWatchTypeService iWatchTypeService;

    @Autowired
    private IWatchProducerService iWatchProducerService;

//    @GetMapping("/list")
//    public ResponseEntity<Page<IWatchDto>> getAllProductPaging(
//            @PageableDefault(value = 5) Pageable pageable,
//            @RequestParam(value = "nameSearch", defaultValue = "", required = false) String nameSearch) {
//        Page<IWatchDto> watchDtos = iWatchService.searchWatch(nameSearch, pageable);
//        return new ResponseEntity<>(watchDtos, HttpStatus.OK);
//    }

    @GetMapping("/list")
    public ResponseEntity<Page<IWatchDto>> getAllProduct(@RequestParam(value = "nameSearch") String nameSearch,
                                                         @PageableDefault(value = 8) Pageable pageable) {
        System.out.println(nameSearch);
        Page<IWatchDto> watchPage = iWatchService.searchWatch(nameSearch, pageable);
        if (watchPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(watchPage, HttpStatus.OK);
    }

    @GetMapping("/type-list")
    public ResponseEntity<List<WatchType>> getAllWatchType() {
        List<WatchType> watchTypes = iWatchTypeService.findAll();
        if (watchTypes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(watchTypes, HttpStatus.OK);
    }

    @GetMapping("/producer-list")
    public ResponseEntity<List<WatchProducer>> getAllWatchProducer() {
        List<WatchProducer> watchProducers = iWatchProducerService.findAll();
        if (watchProducers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(watchProducers, HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<IWatchDto> getInfo(@PathVariable int id) {
        Optional<IWatchDto> watch = iWatchService.findById(id);
        if (watch.isPresent()) {
            return new ResponseEntity<>(watch.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
