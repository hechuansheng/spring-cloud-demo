package org.hechuans.demo.cloud.user.service.impl;

import org.hechuans.demo.cloud.user.model.vo.UserVO;
import org.hechuans.demo.cloud.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author : hechuansheng
 * @date : 2023/6/30 17:05
 * @since : version-1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserVO getOne(Integer userId) {
        return UserVO.builder().userId(userId).userName("张三").build();
    }
}
