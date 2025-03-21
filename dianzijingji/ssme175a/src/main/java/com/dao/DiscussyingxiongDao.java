package com.dao;

import com.entity.DiscussyingxiongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyingxiongVO;
import com.entity.view.DiscussyingxiongView;


/**
 * 英雄评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public interface DiscussyingxiongDao extends BaseMapper<DiscussyingxiongEntity> {
	
	List<DiscussyingxiongVO> selectListVO(@Param("ew") Wrapper<DiscussyingxiongEntity> wrapper);
	
	DiscussyingxiongVO selectVO(@Param("ew") Wrapper<DiscussyingxiongEntity> wrapper);
	
	List<DiscussyingxiongView> selectListView(@Param("ew") Wrapper<DiscussyingxiongEntity> wrapper);

	List<DiscussyingxiongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyingxiongEntity> wrapper);
	
	DiscussyingxiongView selectView(@Param("ew") Wrapper<DiscussyingxiongEntity> wrapper);
	
}
