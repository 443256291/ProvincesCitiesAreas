package com.gs.base.dao;

import java.util.List;

public interface BaseDAO<POJO> {
    int insertPOJO(POJO t);

    int deletePOJO(POJO t);

    int updatePOJO(POJO t);

    POJO selectPOJO(POJO t);

    List<POJO> selectPOJOList(POJO t);

    List<POJO> selectPOJOList();

}
