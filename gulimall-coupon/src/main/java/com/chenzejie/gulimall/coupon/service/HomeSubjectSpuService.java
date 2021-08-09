package com.chenzejie.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenzejie.common.utils.PageUtils;
import com.chenzejie.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author chenzejie
 * @email 2752713798@qq.com
 * @date 2021-08-09 23:54:58
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

