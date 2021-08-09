package com.chenzejie.gulimall.product.dao;

import com.chenzejie.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenzejie
 * @email 2752713798@qq.com
 * @date 2021-08-09 23:06:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
