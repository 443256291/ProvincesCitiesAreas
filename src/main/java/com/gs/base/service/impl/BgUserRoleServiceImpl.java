package com.gs.base.service.impl;

import com.gs.base.dao.BaseDAO;
import com.gs.base.dao.BgUserRoleDAO;
import com.gs.base.model.BgUserRolePOJO;
import com.gs.base.service.BgUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GaoShan on 2017/4/1.
 * Description:
 */
@Service
public class BgUserRoleServiceImpl  extends BaseServiceImpl<BgUserRolePOJO> implements BgUserRoleService {
    @Resource
    private BgUserRoleDAO bgUserRoleDAO;
    @Override
    public BaseDAO<BgUserRolePOJO> getBaseDAO() {
        return bgUserRoleDAO;
    }
}
