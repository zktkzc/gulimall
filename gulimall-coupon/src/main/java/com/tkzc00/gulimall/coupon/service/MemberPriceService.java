package com.tkzc00.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tkzc00.common.utils.PageUtils;
import com.tkzc00.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author tkzc00
 * @email 2238983030@qq.com
 * @date 2023-12-31 16:01:38
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

