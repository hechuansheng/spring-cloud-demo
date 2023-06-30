package org.hechuans.demo.cloud.user.service;

import org.hechuans.demo.cloud.user.model.vo.UserVO;
import org.springframework.stereotype.Service;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:04
 * @since : version-1.0
 */
public interface UserService {
    UserVO getOne(Integer userId);
}
