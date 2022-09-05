package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Andy
 * @email andyarbem@gmail.com
 * @date 2022-09-05 00:14:30
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
