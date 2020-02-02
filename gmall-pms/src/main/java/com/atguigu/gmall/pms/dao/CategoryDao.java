package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liuzhiyuan
 * @email 1935349070@qq.com
 * @date 2020-02-01 09:43:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
