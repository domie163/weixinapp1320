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


import com.dao.BisaiDao;
import com.entity.BisaiEntity;
import com.service.BisaiService;
import com.entity.vo.BisaiVO;
import com.entity.view.BisaiView;

@Service("bisaiService")
public class BisaiServiceImpl extends ServiceImpl<BisaiDao, BisaiEntity> implements BisaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BisaiEntity> page = this.selectPage(
                new Query<BisaiEntity>(params).getPage(),
                new EntityWrapper<BisaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BisaiEntity> wrapper) {
		  Page<BisaiView> page =new Query<BisaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BisaiVO> selectListVO(Wrapper<BisaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BisaiVO selectVO(Wrapper<BisaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BisaiView> selectListView(Wrapper<BisaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BisaiView selectView(Wrapper<BisaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
