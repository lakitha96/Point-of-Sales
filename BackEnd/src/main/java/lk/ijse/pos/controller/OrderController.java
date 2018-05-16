package lk.ijse.pos.controller;

import lk.ijse.pos.dto.OrderDTO;
import lk.ijse.pos.dto.OrderDetailDTO;
import lk.ijse.pos.dto.PlacOrderDTO;
import lk.ijse.pos.entity.OrderDetails;
import lk.ijse.pos.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lakitha
 */

@RestController
@RequestMapping( value = "order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "save")
    public boolean placeOrder(@RequestBody PlacOrderDTO placOrderDTO){
        System.out.println("customer check controller" + placOrderDTO.getOrderDTO().getCusID());
        return orderService.save(placOrderDTO);
    }

}
