package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Andy
 * @email andyarbem@gmail.com
 * @date 2022-09-05 00:21:54
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
