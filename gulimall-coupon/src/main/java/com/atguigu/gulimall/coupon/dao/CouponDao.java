package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Andy
 * @email andyarbem@gmail.com
 * @date 2022-09-04 18:08:04
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
