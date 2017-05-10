package com.gs.base.service.impl;

import com.gs.base.dao.BaseDAO;
import com.gs.base.dao.BgRoleDAO;
import com.gs.base.model.BgRolePOJO;
import com.gs.base.service.BgRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GaoShan on 2017/4/1.
 * Description:
 */
@Service
public class BgRoleServiceImpl extends BaseServiceImpl<BgRolePOJO> implements BgRoleService {
    @Resource
    private BgRoleDAO bgRoleDAO;
    @Override
    public BaseDAO<BgRolePOJO> getBaseDAO() {
        return bgRoleDAO;
    }
}
