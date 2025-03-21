package com.dao;

import com.entity.DiscussbisaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbisaiVO;
import com.entity.view.DiscussbisaiView;


/**
 * 比赛评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public interface DiscussbisaiDao extends BaseMapper<DiscussbisaiEntity> {
	
	List<DiscussbisaiVO> selectListVO(@Param("ew") Wrapper<DiscussbisaiEntity> wrapper);
	
	DiscussbisaiVO selectVO(@Param("ew") Wrapper<DiscussbisaiEntity> wrapper);
	
	List<DiscussbisaiView> selectListView(@Param("ew") Wrapper<DiscussbisaiEntity> wrapper);

	List<DiscussbisaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbisaiEntity> wrapper);
	
	DiscussbisaiView selectView(@Param("ew") Wrapper<DiscussbisaiEntity> wrapper);
	
}
