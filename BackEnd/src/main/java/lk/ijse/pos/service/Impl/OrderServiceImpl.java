package lk.ijse.pos.service.Impl;


import lk.ijse.pos.dto.OrderDetailDTO;
import lk.ijse.pos.dto.PlacOrderDTO;
import lk.ijse.pos.entity.*;
import lk.ijse.pos.repository.CustomerRepository;
import lk.ijse.pos.repository.OrderDetailsRepository;
import lk.ijse.pos.repository.OrderRepository;
import lk.ijse.pos.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author lakitha
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;


    @Override
    @Transactional
    public boolean save(PlacOrderDTO placOrderDTO) {
        OrderDetails orderDetails = new OrderDetails();
        Optional<Customer> byId = customerRepository.findById(placOrderDTO.getOrderDTO().getCusID());
        Customer customer = new Customer(byId.get().getCid(), byId.get().getName(), byId.get().getAddress(), byId.get().getContacts());

        Orders orders = new Orders(placOrderDTO.getOrderDTO().getOid(), placOrderDTO.getOrderDTO().getDate(), customer);

        if (orderRepository.save(orders) != null){
            for (OrderDetailDTO orderDetailDTO: placOrderDTO.getAllOrderDetailsDTO()) {
                Item item = new Item(orderDetailDTO.getItemDTO().getIid(), orderDetailDTO.getItemDTO().getName(), orderDetailDTO.getItemDTO().getPrice(), orderDetailDTO.getItemDTO().getQty());
                orderDetails=new OrderDetails(orderDetailDTO.getSold_order_qty(), orders, item, new OrderDetail_PK(orders.getOid(), item.getIid()) );
                orderDetailsRepository.save(orderDetails);
            }
            return true;
        }
        return false;
    }
}
