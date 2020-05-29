package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author luohuan
 * @email 1026770043@qq.com
 * @date 2020-05-29 23:00:07
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
