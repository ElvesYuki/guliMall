package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author luohuan
 * @email 1026770043@qq.com
 * @date 2020-05-29 14:30:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
