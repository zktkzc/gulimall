package com.tkzc00.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tkzc00.common.utils.PageUtils;
import com.tkzc00.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author tkzc00
 * @email 2238983030@qq.com
 * @date 2023-12-31 15:13:47
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

