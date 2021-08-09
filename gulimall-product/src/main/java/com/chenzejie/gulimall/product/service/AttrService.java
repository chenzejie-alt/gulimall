package com.chenzejie.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenzejie.common.utils.PageUtils;
import com.chenzejie.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chenzejie
 * @email 2752713798@qq.com
 * @date 2021-08-09 23:06:29
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

