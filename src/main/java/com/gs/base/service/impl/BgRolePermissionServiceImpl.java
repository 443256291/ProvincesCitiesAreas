package com.gs.base.service.impl;

import com.gs.base.dao.BaseDAO;
import com.gs.base.dao.BgRolePermissionDAO;
import com.gs.base.model.BgRolePermissionPOJO;
import com.gs.base.service.BgRolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GaoShan on 2017/4/1.
 * Description:
 */
@Service
public class BgRolePermissionServiceImpl extends BaseServiceImpl<BgRolePermissionPOJO> implements BgRolePermissionService {
    @Resource
    private BgRolePermissionDAO bgRolePermissionDAO;
    @Override
    public BaseDAO<BgRolePermissionPOJO> getBaseDAO() {
        return bgRolePermissionDAO;
    }
}
