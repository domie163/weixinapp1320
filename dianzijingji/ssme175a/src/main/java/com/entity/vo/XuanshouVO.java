package com.entity.vo;

import com.entity.XuanshouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 选手
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
public class XuanshouVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所属战队
	 */
	
	private String suoshuzhandui;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 当前段位
	 */
	
	private String dangqianduanwei;
		
	/**
	 * 当前分数
	 */
	
	private Integer dangqianfenshu;
		
	/**
	 * 近期比赛记录
	 */
	
	private String jinqibisaijilu;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：所属战队
	 */
	 
	public void setSuoshuzhandui(String suoshuzhandui) {
		this.suoshuzhandui = suoshuzhandui;
	}
	
	/**
	 * 获取：所属战队
	 */
	public String getSuoshuzhandui() {
		return suoshuzhandui;
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
	 * 设置：当前段位
	 */
	 
	public void setDangqianduanwei(String dangqianduanwei) {
		this.dangqianduanwei = dangqianduanwei;
	}
	
	/**
	 * 获取：当前段位
	 */
	public String getDangqianduanwei() {
		return dangqianduanwei;
	}
				
	
	/**
	 * 设置：当前分数
	 */
	 
	public void setDangqianfenshu(Integer dangqianfenshu) {
		this.dangqianfenshu = dangqianfenshu;
	}
	
	/**
	 * 获取：当前分数
	 */
	public Integer getDangqianfenshu() {
		return dangqianfenshu;
	}
				
	
	/**
	 * 设置：近期比赛记录
	 */
	 
	public void setJinqibisaijilu(String jinqibisaijilu) {
		this.jinqibisaijilu = jinqibisaijilu;
	}
	
	/**
	 * 获取：近期比赛记录
	 */
	public String getJinqibisaijilu() {
		return jinqibisaijilu;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
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
