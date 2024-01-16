package controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/store/order")
public class OnlineStroreController {
    private final com.onlinestore.onlineStore.service.OnlineStroeService onlineStoreControllerService;

    public OnlineStoreController(com.onlinestore.onlineStore.service.OnlineStroeService onlineStoreControllerService){
        this.onlineStoreControllerService = onlineStoreControllerService;
    }
    @GetMapping(path = "add")
    public List<Integer> add(@RequestParam(value = "ID", required = false) String id){
        return onlineStoreControllerService.add(id);
    }

    @GetMapping(path = "get")
    public List<Integer> get(){
        return onlineStoreControllerService.get();
    }

}
