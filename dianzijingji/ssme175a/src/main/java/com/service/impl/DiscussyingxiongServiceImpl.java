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


import com.dao.DiscussyingxiongDao;
import com.entity.DiscussyingxiongEntity;
import com.service.DiscussyingxiongService;
import com.entity.vo.DiscussyingxiongVO;
import com.entity.view.DiscussyingxiongView;

@Service("discussyingxiongService")
public class DiscussyingxiongServiceImpl extends ServiceImpl<DiscussyingxiongDao, DiscussyingxiongEntity> implements DiscussyingxiongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyingxiongEntity> page = this.selectPage(
                new Query<DiscussyingxiongEntity>(params).getPage(),
                new EntityWrapper<DiscussyingxiongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyingxiongEntity> wrapper) {
		  Page<DiscussyingxiongView> page =new Query<DiscussyingxiongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyingxiongVO> selectListVO(Wrapper<DiscussyingxiongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyingxiongVO selectVO(Wrapper<DiscussyingxiongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyingxiongView> selectListView(Wrapper<DiscussyingxiongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyingxiongView selectView(Wrapper<DiscussyingxiongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
