package org.hechuans.demo.cloud.order.model.vo;

import lombok.Builder;
import lombok.Data;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:05
 * @since : version-1.0
 */
@Data
@Builder
public class UserVO {

    private Integer userId;

    private String userName;

}
