package com.gs.base.service;

import java.util.List;

/**
 * Created by GaoShan on 2017/1/17.
 *
 */
public interface BaseService<POJO> {
    int insertPOJO(POJO t);

    int deletePOJO(POJO t);

    int updatePOJO(POJO t);

    POJO selectPOJO(POJO t);

    List<POJO> selectPOJOList(POJO t);

    List<POJO> selectPOJOList();

}
