package org.hechuans.demo.cloud.order.service.impl;

import org.hechuans.demo.cloud.order.model.vo.OrderVO;
import org.hechuans.demo.cloud.order.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:27
 * @since : version-1.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderVO getOne(Integer id) {
        return OrderVO.builder()
                .id(id)
                .createTime(new Date())
                .offerName("P30-pro")
                .build();
    }
}
