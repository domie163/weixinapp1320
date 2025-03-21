package com.entity.model;

import com.entity.YingxiongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 英雄
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public class YingxiongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 真名
	 */
	
	private String zhenming;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 技能介绍
	 */
	
	private String jinengjieshao;
		
	/**
	 * 背景介绍
	 */
	
	private String beijingjieshao;
		
	/**
	 * 英雄技巧
	 */
	
	private String yingxiongjiqiao;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：真名
	 */
	 
	public void setZhenming(String zhenming) {
		this.zhenming = zhenming;
	}
	
	/**
	 * 获取：真名
	 */
	public String getZhenming() {
		return zhenming;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：技能介绍
	 */
	 
	public void setJinengjieshao(String jinengjieshao) {
		this.jinengjieshao = jinengjieshao;
	}
	
	/**
	 * 获取：技能介绍
	 */
	public String getJinengjieshao() {
		return jinengjieshao;
	}
				
	
	/**
	 * 设置：背景介绍
	 */
	 
	public void setBeijingjieshao(String beijingjieshao) {
		this.beijingjieshao = beijingjieshao;
	}
	
	/**
	 * 获取：背景介绍
	 */
	public String getBeijingjieshao() {
		return beijingjieshao;
	}
				
	
	/**
	 * 设置：英雄技巧
	 */
	 
	public void setYingxiongjiqiao(String yingxiongjiqiao) {
		this.yingxiongjiqiao = yingxiongjiqiao;
	}
	
	/**
	 * 获取：英雄技巧
	 */
	public String getYingxiongjiqiao() {
		return yingxiongjiqiao;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
