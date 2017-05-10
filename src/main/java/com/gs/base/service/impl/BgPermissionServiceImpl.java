package com.gs.base.service.impl;

import com.gs.base.dao.BaseDAO;
import com.gs.base.dao.BgPermissionDAO;
import com.gs.base.model.BgPermissionPOJO;
import com.gs.base.service.BgPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GaoShan on 2017/4/1.
 * Description:
 */
@Service
public class BgPermissionServiceImpl extends BaseServiceImpl<BgPermissionPOJO> implements BgPermissionService {

    @Resource
    private BgPermissionDAO bgPermissionDAO;

    @Override
    public BaseDAO<BgPermissionPOJO> getBaseDAO() {
        return bgPermissionDAO;
    }
}
