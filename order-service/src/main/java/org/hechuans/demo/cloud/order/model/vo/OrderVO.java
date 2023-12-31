package org.hechuans.demo.cloud.order.model.vo;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:25
 * @since : version-1.0
 */
@Data
@Builder
public class OrderVO {

    private Integer id;

    private Date createTime;

    private String offerName;

    private Integer userId;

    private UserVO userVO;

}
