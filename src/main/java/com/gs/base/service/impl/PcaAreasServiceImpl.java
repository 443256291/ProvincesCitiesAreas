package com.gs.base.service.impl;

import com.gs.base.dao.BaseDAO;
import com.gs.base.dao.PcaAreasDAO;
import com.gs.base.model.PcaAreasPOJO;
import com.gs.base.service.PcaAreasService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GaoShan on 2017/5/10.
 */
@Service
public class PcaAreasServiceImpl extends BaseServiceImpl<PcaAreasPOJO> implements PcaAreasService {
    @Resource
    private PcaAreasDAO dao;
    @Override
    public BaseDAO<PcaAreasPOJO> getBaseDAO() {
        return dao;
    }
}
