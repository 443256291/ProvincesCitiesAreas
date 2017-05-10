package com.gs.base.service.impl;

import com.gs.base.dao.BaseDAO;
import com.gs.base.dao.PcaProvincesDAO;
import com.gs.base.model.PcaProvincesPOJO;
import com.gs.base.service.PcaProvincesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by GaoShan on 2017/5/10.
 */
@Service
public class PcaProvincesServiceImpl extends BaseServiceImpl<PcaProvincesPOJO>  implements PcaProvincesService{

    @Resource
    private PcaProvincesDAO dao;
    @Override
    public BaseDAO<PcaProvincesPOJO> getBaseDAO() {
        return dao;
    }
}
