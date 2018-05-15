package lk.ijse.pos.service;

import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.dto.ItemDTO;

import java.util.List;

/**
 * @author lakitha
 */
public interface ItemService {

    public boolean save(ItemDTO itemDTO);

    public ItemDTO findByID (int id);

    public boolean update (ItemDTO itemDTO);

    public boolean delete (int id);

    public List<ItemDTO> getAll ();

}
