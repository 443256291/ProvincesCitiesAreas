package com.gs.base.service.impl;

import com.gs.base.dao.BaseDAO;
import com.gs.base.dao.PcaCitiesDAO;
import com.gs.base.model.PcaCitiesPOJO;
import com.gs.base.service.PcaCitiesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GaoShan on 2017/5/10.
 */
@Service
public class PcaCitiesServiceImpl extends BaseServiceImpl<PcaCitiesPOJO> implements PcaCitiesService {
    @Resource
    private PcaCitiesDAO dao;
    @Override
    public BaseDAO<PcaCitiesPOJO> getBaseDAO() {
        return dao;
    }
}
