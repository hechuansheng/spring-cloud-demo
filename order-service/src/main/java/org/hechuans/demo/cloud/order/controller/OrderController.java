package org.hechuans.demo.cloud.order.controller;

import org.hechuans.demo.cloud.order.model.vo.OrderVO;
import org.hechuans.demo.cloud.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:24
 * @since : version-1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("getById")
    public OrderVO getById(Integer id) {
        return orderService.getOne(id);
    }
}
