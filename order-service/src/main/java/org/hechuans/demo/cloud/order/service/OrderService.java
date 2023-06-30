package org.hechuans.demo.cloud.order.service;

import org.hechuans.demo.cloud.order.model.vo.OrderVO;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:27
 * @since : version-1.0
 */
public interface OrderService {

    OrderVO getOne(Integer id);
}
