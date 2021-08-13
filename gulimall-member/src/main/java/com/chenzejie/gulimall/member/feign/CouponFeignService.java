package com.chenzejie.gulimall.member.feign;

import com.chenzejie.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: chenzejie
 * @Date: Created in 2021-08-12 13:30
 * @Modified By:
 */

/**
 * 这是一个声明式的远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @GetMapping("/coupon/coupon/member/list")
    R membercoupons();
}
