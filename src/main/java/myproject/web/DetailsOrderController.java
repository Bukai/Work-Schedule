package myproject.web;

import myproject.entity.Order;
import myproject.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/order/details")
public class DetailsOrderController {

    private final OrderService orderService;

    public DetailsOrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping("/{id}")
    public String DetailsOrder(Model model, @PathVariable long id){
        List<Order> ordersList = orderService.listAll();
        model.addAttribute("ordersList", ordersList);
        return "detailsOrder";
    }
}
