package lk.ijse.pos.service.Impl;

import lk.ijse.pos.dto.ItemDTO;
import lk.ijse.pos.entity.Item;
import lk.ijse.pos.repository.ItemRepository;
import lk.ijse.pos.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public ItemDTO findByID(int iid) {
        Optional<Item> byId = itemRepository.findById(iid);
        if(byId.isPresent()){
            return new ItemDTO(byId.get().getIid(),byId.get().getName(), byId.get().getPrice(), byId.get().getQty());
        }
        return null;
    }

    @Override
    public boolean update(ItemDTO itemDTO) {
        if((findByID(itemDTO.getIid()))!=null) {
            Item save = itemRepository.save(new Item(itemDTO.getIid(), itemDTO.getName(), itemDTO.getPrice(), itemDTO.getQty()));
            if (save != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        ItemDTO itemDTO=findByID(id);
        if(itemDTO!=null){
            itemRepository.delete(new Item(itemDTO.getIid(), itemDTO.getName(), itemDTO.getPrice(), itemDTO.getQty()));
            return true;
        }
        return false;
    }

    @Override
    public List<ItemDTO> getAll() {
        List<ItemDTO> allCustomers = new ArrayList<>();
        if(itemRepository.findAll()!= null){
            for (Item item  : itemRepository.findAll()) {
                ItemDTO itemDTO = new ItemDTO(item.getIid(), item.getName(), item.getPrice(), item.getQty());
                allCustomers.add(itemDTO);
            };
            return allCustomers;
        }
        return null;
    }
}
