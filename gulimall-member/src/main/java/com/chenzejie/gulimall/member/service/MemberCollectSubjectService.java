package com.chenzejie.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenzejie.common.utils.PageUtils;
import com.chenzejie.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author chenzejie
 * @email 2752713798@qq.com
 * @date 2021-08-10 00:03:09
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

