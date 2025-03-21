package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbisaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbisaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbisaiView;


/**
 * 比赛评论表
 *
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public interface DiscussbisaiService extends IService<DiscussbisaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbisaiVO> selectListVO(Wrapper<DiscussbisaiEntity> wrapper);
   	
   	DiscussbisaiVO selectVO(@Param("ew") Wrapper<DiscussbisaiEntity> wrapper);
   	
   	List<DiscussbisaiView> selectListView(Wrapper<DiscussbisaiEntity> wrapper);
   	
   	DiscussbisaiView selectView(@Param("ew") Wrapper<DiscussbisaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbisaiEntity> wrapper);
   	
}

