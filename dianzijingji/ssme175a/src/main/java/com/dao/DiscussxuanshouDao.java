package com.dao;

import com.entity.DiscussxuanshouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuanshouVO;
import com.entity.view.DiscussxuanshouView;


/**
 * 选手评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public interface DiscussxuanshouDao extends BaseMapper<DiscussxuanshouEntity> {
	
	List<DiscussxuanshouVO> selectListVO(@Param("ew") Wrapper<DiscussxuanshouEntity> wrapper);
	
	DiscussxuanshouVO selectVO(@Param("ew") Wrapper<DiscussxuanshouEntity> wrapper);
	
	List<DiscussxuanshouView> selectListView(@Param("ew") Wrapper<DiscussxuanshouEntity> wrapper);

	List<DiscussxuanshouView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuanshouEntity> wrapper);
	
	DiscussxuanshouView selectView(@Param("ew") Wrapper<DiscussxuanshouEntity> wrapper);
	
}
