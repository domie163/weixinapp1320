package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingxiongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingxiongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingxiongView;


/**
 * 英雄
 *
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public interface YingxiongService extends IService<YingxiongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingxiongVO> selectListVO(Wrapper<YingxiongEntity> wrapper);
   	
   	YingxiongVO selectVO(@Param("ew") Wrapper<YingxiongEntity> wrapper);
   	
   	List<YingxiongView> selectListView(Wrapper<YingxiongEntity> wrapper);
   	
   	YingxiongView selectView(@Param("ew") Wrapper<YingxiongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingxiongEntity> wrapper);
   	
}

