package com.tkzc00.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tkzc00.common.utils.PageUtils;
import com.tkzc00.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author tkzc00
 * @email 2238983030@qq.com
 * @date 2023-12-31 15:13:47
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

