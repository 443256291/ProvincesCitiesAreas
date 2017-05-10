package com.gs.base.controller;

import com.gs.base.model.PcaAreasPOJO;
import com.gs.base.model.PcaCitiesPOJO;
import com.gs.base.model.PcaProvincesPOJO;
import com.gs.base.service.PcaAreasService;
import com.gs.base.service.PcaCitiesService;
import com.gs.base.service.PcaProvincesService;
import com.gs.base.util.MyMapUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by GaoShan on 2017/5/10.
 */
@Controller
@RequestMapping("/pca")
public class PCAController extends MyBaseController {

    @Resource
    private PcaProvincesService provincesService;

    @Resource
    private PcaCitiesService citiesService;

    @Resource
    private PcaAreasService areasService;

    /**
     * 获取省
     * @return
     */
    @RequestMapping("/getProvinces")
    @ResponseBody
    public Map getProvinces() {
        return selectListPOJO( provincesService);
    }

    /**
     * 获取城市
     *
     * @param request
     * @return
     */
    @RequestMapping("/getCities")
    @ResponseBody
    public Map getCities(HttpServletRequest request) {
        PcaCitiesPOJO citiesPOJO = PcaCitiesPOJO.getInstanceByRequestForUpdate(request);
        List<PcaCitiesPOJO> pcaCitiesPOJOS = citiesService.selectPOJOList(citiesPOJO);
        return MyMapUtils.getMapForSelectOne(pcaCitiesPOJOS);
    }
    /**
     * 获取区
     *
     * @param request
     * @return
     */
    @RequestMapping("/getAreas")
    @ResponseBody
    public Map getAreas(HttpServletRequest request) {
        PcaAreasPOJO areasPOJO = PcaAreasPOJO.getInstanceByRequestForUpdate(request);
        List<PcaAreasPOJO> list = areasService.selectPOJOList(areasPOJO);
        return MyMapUtils.getMapForSelectOne(list);
    }



}
