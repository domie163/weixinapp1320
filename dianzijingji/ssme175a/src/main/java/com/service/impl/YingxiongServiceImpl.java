package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YingxiongDao;
import com.entity.YingxiongEntity;
import com.service.YingxiongService;
import com.entity.vo.YingxiongVO;
import com.entity.view.YingxiongView;

@Service("yingxiongService")
public class YingxiongServiceImpl extends ServiceImpl<YingxiongDao, YingxiongEntity> implements YingxiongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingxiongEntity> page = this.selectPage(
                new Query<YingxiongEntity>(params).getPage(),
                new EntityWrapper<YingxiongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingxiongEntity> wrapper) {
		  Page<YingxiongView> page =new Query<YingxiongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingxiongVO> selectListVO(Wrapper<YingxiongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingxiongVO selectVO(Wrapper<YingxiongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingxiongView> selectListView(Wrapper<YingxiongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingxiongView selectView(Wrapper<YingxiongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
