package lk.ijse.pos.service.Impl;

import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.dto.ItemDTO;
import lk.ijse.pos.entity.Item;
import lk.ijse.pos.repository.CustomerRepository;
import lk.ijse.pos.repository.ItemRepository;
import lk.ijse.pos.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lakitha
 */
@Service
@Transactional
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public boolean save(ItemDTO itemDTO) {
        Serializable save = itemRepository.save(new Item(itemDTO.getName(), itemDTO.getPrice(), itemDTO.getQty()));
        if (save != null){
            return true;
        }
        return false;
    }

    @Override
    public ItemDTO findByID(int id) {
        Item item=null;
        if(itemRepository.findByID(id)!=null){
            item = itemRepository.findByID(id);
            return new ItemDTO(item.getId(),item.getName(), item.getPrice(), item.getQty());
        }
        return null;
    }

    @Override
    public boolean update(ItemDTO itemDTO) {
        return itemRepository.update(new Item(itemDTO.getId(), itemDTO.getName(), itemDTO.getPrice(), itemDTO.getQty()));
    }

    @Override
    public boolean delete(int id) {
        ItemDTO itemDTO=findByID(id);
        if(itemDTO!=null){
            itemRepository.delete(new Item(itemDTO.getId(), itemDTO.getName(), itemDTO.getPrice(), itemDTO.getQty()));
            return true;
        }
        return false;
    }

    @Override
    public List<ItemDTO> getAll() {
        List<ItemDTO> allCustomers = new ArrayList<>();
        if(itemRepository.getAll()!= null){
            for (Item item  : itemRepository.getAll()) {
                ItemDTO itemDTO = new ItemDTO(item.getId(), item.getName(), item.getPrice(), item.getQty());
                allCustomers.add(itemDTO);
            };
            return allCustomers;
        }
        return null;
    }
}
