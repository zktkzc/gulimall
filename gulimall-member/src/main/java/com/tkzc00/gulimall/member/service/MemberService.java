package com.tkzc00.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tkzc00.common.utils.PageUtils;
import com.tkzc00.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author tkzc00
 * @email 2238983030@qq.com
 * @date 2023-12-31 16:07:49
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

