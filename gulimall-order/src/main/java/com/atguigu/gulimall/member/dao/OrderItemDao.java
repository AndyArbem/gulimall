package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Andy
 * @email andyarbem@gmail.com
 * @date 2022-09-05 00:14:30
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
