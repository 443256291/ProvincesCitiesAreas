package com.gs.base.service.impl;

import com.gs.base.dao.BaseDAO;
import com.gs.base.dao.BgUserDAO;
import com.gs.base.model.BgUserPOJO;
import com.gs.base.service.BgUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GaoShan on 2017/4/1.
 * Description:
 */
@Service
public class BgUserServiceImpl extends BaseServiceImpl<BgUserPOJO> implements BgUserService {
    @Resource
    private BgUserDAO bgUserDAO;

    @Override
    public BaseDAO<BgUserPOJO> getBaseDAO() {
        return bgUserDAO;
    }
}
