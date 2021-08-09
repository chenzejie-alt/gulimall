package com.chenzejie.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenzejie.common.utils.PageUtils;
import com.chenzejie.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author chenzejie
 * @email 2752713798@qq.com
 * @date 2021-08-09 23:06:29
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

