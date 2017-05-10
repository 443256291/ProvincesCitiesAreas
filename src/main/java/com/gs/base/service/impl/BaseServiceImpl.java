package com.gs.base.service.impl;


import com.gs.base.dao.BaseDAO;
import com.gs.base.service.BaseService;

import java.util.List;

/**
 * Created by GaoShan on 2017/1/17.
 */
public abstract class BaseServiceImpl<POJO> implements BaseService<POJO> {

    public abstract BaseDAO<POJO> getBaseDAO();

    @Override
    public int insertPOJO(POJO t) {
        return getBaseDAO().insertPOJO(t);
    }

    @Override
    public int deletePOJO(POJO t) {
        return getBaseDAO().deletePOJO(t);
    }

    @Override
    public int updatePOJO(POJO t) {
        return getBaseDAO().updatePOJO(t);
    }

    @Override
    public POJO selectPOJO(POJO t) {
        return getBaseDAO().selectPOJO(t);
    }

    @Override
    public List<POJO> selectPOJOList(POJO t) {
        return getBaseDAO().selectPOJOList(t);
    }

    @Override
    public List<POJO> selectPOJOList() {
        return getBaseDAO().selectPOJOList();
    }
}
