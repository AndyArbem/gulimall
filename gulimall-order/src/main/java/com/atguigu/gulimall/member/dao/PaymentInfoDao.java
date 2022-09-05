package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author Andy
 * @email andyarbem@gmail.com
 * @date 2022-09-05 00:14:30
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
