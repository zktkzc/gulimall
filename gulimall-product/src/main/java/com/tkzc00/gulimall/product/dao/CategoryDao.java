package com.tkzc00.gulimall.product.dao;

import com.tkzc00.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tkzc00
 * @email 2238983030@qq.com
 * @date 2023-12-31 15:13:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
