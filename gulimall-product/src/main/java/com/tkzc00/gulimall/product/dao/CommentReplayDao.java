package com.tkzc00.gulimall.product.dao;

import com.tkzc00.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author tkzc00
 * @email 2238983030@qq.com
 * @date 2023-12-31 15:13:47
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
