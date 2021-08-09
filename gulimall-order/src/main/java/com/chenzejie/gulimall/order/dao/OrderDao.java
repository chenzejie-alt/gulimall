package com.chenzejie.gulimall.order.dao;

import com.chenzejie.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenzejie
 * @email 2752713798@qq.com
 * @date 2021-08-10 00:12:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
