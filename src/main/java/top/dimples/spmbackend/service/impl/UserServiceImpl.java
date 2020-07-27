package top.dimples.spmbackend.service.impl;

import top.dimples.spmbackend.entity.User;
import top.dimples.spmbackend.mapper.UserMapper;
import top.dimples.spmbackend.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dimples_YJ
 * @since 2020-07-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
