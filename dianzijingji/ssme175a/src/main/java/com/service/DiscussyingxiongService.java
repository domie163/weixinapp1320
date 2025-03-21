package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyingxiongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyingxiongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyingxiongView;


/**
 * 英雄评论表
 *
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public interface DiscussyingxiongService extends IService<DiscussyingxiongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyingxiongVO> selectListVO(Wrapper<DiscussyingxiongEntity> wrapper);
   	
   	DiscussyingxiongVO selectVO(@Param("ew") Wrapper<DiscussyingxiongEntity> wrapper);
   	
   	List<DiscussyingxiongView> selectListView(Wrapper<DiscussyingxiongEntity> wrapper);
   	
   	DiscussyingxiongView selectView(@Param("ew") Wrapper<DiscussyingxiongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyingxiongEntity> wrapper);
   	
}

