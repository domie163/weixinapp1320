package com.dao;

import com.entity.YingxiongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingxiongVO;
import com.entity.view.YingxiongView;


/**
 * 英雄
 * 
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public interface YingxiongDao extends BaseMapper<YingxiongEntity> {
	
	List<YingxiongVO> selectListVO(@Param("ew") Wrapper<YingxiongEntity> wrapper);
	
	YingxiongVO selectVO(@Param("ew") Wrapper<YingxiongEntity> wrapper);
	
	List<YingxiongView> selectListView(@Param("ew") Wrapper<YingxiongEntity> wrapper);

	List<YingxiongView> selectListView(Pagination page,@Param("ew") Wrapper<YingxiongEntity> wrapper);
	
	YingxiongView selectView(@Param("ew") Wrapper<YingxiongEntity> wrapper);
	
}
