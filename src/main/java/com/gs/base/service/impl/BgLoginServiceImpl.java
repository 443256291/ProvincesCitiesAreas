package com.gs.base.service.impl;


import com.gs.base.dao.BaseDAO;
import com.gs.base.dao.BgLoginDAO;
import com.gs.base.model.BgLoginPOJO;
import com.gs.base.service.BgLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GaoShan on 2017/3/9.
 */
@Service
public class BgLoginServiceImpl extends BaseServiceImpl<BgLoginPOJO> implements BgLoginService {

    @Resource
    private BgLoginDAO bgLoginDAO;

    @Override
    public BaseDAO<BgLoginPOJO> getBaseDAO() {
        return bgLoginDAO;
    }
}
