package cn.hiczy.auth.service.impl;

import cn.hiczy.pojo.authtication.TRole;
import cn.hiczy.auth.mapper.TRoleMapper;
import cn.hiczy.auth.service.ITRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author czy77
 * @since 2020-08-09
 */
@Service
public class TRoleServiceImpl extends ServiceImpl<TRoleMapper, TRole> implements ITRoleService {

}
