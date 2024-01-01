package com.tkzc00.gulimall.order.dao;

import com.tkzc00.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author tkzc00
 * @email 2238983030@qq.com
 * @date 2023-12-31 16:19:55
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
