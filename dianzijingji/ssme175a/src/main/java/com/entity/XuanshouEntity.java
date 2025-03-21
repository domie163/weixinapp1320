package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 选手
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
@TableName("xuanshou")
public class XuanshouEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuanshouEntity() {
		
	}
	
	public XuanshouEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
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
