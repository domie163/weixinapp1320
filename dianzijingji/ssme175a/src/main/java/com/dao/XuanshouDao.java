package com.dao;

import com.entity.XuanshouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuanshouVO;
import com.entity.view.XuanshouView;


/**
 * 选手
 * 
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public interface XuanshouDao extends BaseMapper<XuanshouEntity> {
	
	List<XuanshouVO> selectListVO(@Param("ew") Wrapper<XuanshouEntity> wrapper);
	
	XuanshouVO selectVO(@Param("ew") Wrapper<XuanshouEntity> wrapper);
	
	List<XuanshouView> selectListView(@Param("ew") Wrapper<XuanshouEntity> wrapper);

	List<XuanshouView> selectListView(Pagination page,@Param("ew") Wrapper<XuanshouEntity> wrapper);
	
	XuanshouView selectView(@Param("ew") Wrapper<XuanshouEntity> wrapper);
	
}
