package com.chenzejie.gulimall.member.dao;

import com.chenzejie.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenzejie
 * @email 2752713798@qq.com
 * @date 2021-08-10 00:03:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
