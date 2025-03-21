package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YingxiongEntity;
import com.entity.view.YingxiongView;

import com.service.YingxiongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 英雄
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
@RestController
@RequestMapping("/yingxiong")
public class YingxiongController {
    @Autowired
    private YingxiongService yingxiongService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YingxiongEntity yingxiong, 
		HttpServletRequest request){

        EntityWrapper<YingxiongEntity> ew = new EntityWrapper<YingxiongEntity>();
		PageUtils page = yingxiongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingxiong), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YingxiongEntity yingxiong, HttpServletRequest request){
        EntityWrapper<YingxiongEntity> ew = new EntityWrapper<YingxiongEntity>();
		PageUtils page = yingxiongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yingxiong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YingxiongEntity yingxiong){
       	EntityWrapper<YingxiongEntity> ew = new EntityWrapper<YingxiongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yingxiong, "yingxiong")); 
        return R.ok().put("data", yingxiongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YingxiongEntity yingxiong){
        EntityWrapper< YingxiongEntity> ew = new EntityWrapper< YingxiongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yingxiong, "yingxiong")); 
		YingxiongView yingxiongView =  yingxiongService.selectView(ew);
		return R.ok("查询英雄成功").put("data", yingxiongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YingxiongEntity yingxiong = yingxiongService.selectById(id);
        return R.ok().put("data", yingxiong);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YingxiongEntity yingxiong = yingxiongService.selectById(id);
        return R.ok().put("data", yingxiong);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        YingxiongEntity yingxiong = yingxiongService.selectById(id);
        if(type.equals("1")) {
        	yingxiong.setThumbsupnum(yingxiong.getThumbsupnum()+1);
        } else {
        	yingxiong.setCrazilynum(yingxiong.getCrazilynum()+1);
        }
        yingxiongService.updateById(yingxiong);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YingxiongEntity yingxiong, HttpServletRequest request){
    	yingxiong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yingxiong);

        yingxiongService.insert(yingxiong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YingxiongEntity yingxiong, HttpServletRequest request){
    	yingxiong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yingxiong);

        yingxiongService.insert(yingxiong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YingxiongEntity yingxiong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yingxiong);
        yingxiongService.updateById(yingxiong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yingxiongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YingxiongEntity> wrapper = new EntityWrapper<YingxiongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yingxiongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
