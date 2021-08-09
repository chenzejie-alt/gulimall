package com.chenzejie.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenzejie.common.utils.PageUtils;
import com.chenzejie.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author chenzejie
 * @email 2752713798@qq.com
 * @date 2021-08-09 23:54:58
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

