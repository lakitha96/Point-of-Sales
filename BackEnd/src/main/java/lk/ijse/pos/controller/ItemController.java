package lk.ijse.pos.controller;

import lk.ijse.pos.dto.ItemDTO;
import lk.ijse.pos.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lakitha
 */

@RestController
@RequestMapping(value = "item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping(value = "/save")
    public boolean saveItem(@RequestBody ItemDTO itemDTO){
        return itemService.save(itemDTO);
    }

    @GetMapping(value = "all")
    public List<ItemDTO> getAll(){
        return itemService.getAll();
    }

    @PutMapping(value = "update")
    public boolean updateItem(@RequestBody ItemDTO itemDTO){
        return itemService.update(itemDTO);
    }

    @GetMapping(value = "search")
    public ItemDTO findItemById(@RequestParam int id){
        return itemService.findByID(id);
    }

    @DeleteMapping(value = "delete")
    public boolean deleteItem(@RequestParam int id){
        return itemService.delete(id);
    }


}
