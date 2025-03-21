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
 * 比赛
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-14 11:54:29
 */
@TableName("bisai")
public class BisaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BisaiEntity() {
		
	}
	
	public BisaiEntity(T t) {
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
	 * 战队名称
	 */
					
	private String zhanduimingcheng;
	
	/**
	 * 赛区
	 */
					
	private String saiqu;
	
	/**
	 * 战队介绍
	 */
					
	private String zhanduijieshao;
	
	/**
	 * 队标照片
	 */
					
	private String duibiaozhaopian;
	
	/**
	 * 战队成员
	 */
					
	private String zhanduichengyuan;
	
	/**
	 * 战队数据
	 */
					
	private String zhanduishuju;
	
	/**
	 * 近期比赛
	 */
					
	private String jinqibisai;
	
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
	 * 设置：战队名称
	 */
	public void setZhanduimingcheng(String zhanduimingcheng) {
		this.zhanduimingcheng = zhanduimingcheng;
	}
	/**
	 * 获取：战队名称
	 */
	public String getZhanduimingcheng() {
		return zhanduimingcheng;
	}
	/**
	 * 设置：赛区
	 */
	public void setSaiqu(String saiqu) {
		this.saiqu = saiqu;
	}
	/**
	 * 获取：赛区
	 */
	public String getSaiqu() {
		return saiqu;
	}
	/**
	 * 设置：战队介绍
	 */
	public void setZhanduijieshao(String zhanduijieshao) {
		this.zhanduijieshao = zhanduijieshao;
	}
	/**
	 * 获取：战队介绍
	 */
	public String getZhanduijieshao() {
		return zhanduijieshao;
	}
	/**
	 * 设置：队标照片
	 */
	public void setDuibiaozhaopian(String duibiaozhaopian) {
		this.duibiaozhaopian = duibiaozhaopian;
	}
	/**
	 * 获取：队标照片
	 */
	public String getDuibiaozhaopian() {
		return duibiaozhaopian;
	}
	/**
	 * 设置：战队成员
	 */
	public void setZhanduichengyuan(String zhanduichengyuan) {
		this.zhanduichengyuan = zhanduichengyuan;
	}
	/**
	 * 获取：战队成员
	 */
	public String getZhanduichengyuan() {
		return zhanduichengyuan;
	}
	/**
	 * 设置：战队数据
	 */
	public void setZhanduishuju(String zhanduishuju) {
		this.zhanduishuju = zhanduishuju;
	}
	/**
	 * 获取：战队数据
	 */
	public String getZhanduishuju() {
		return zhanduishuju;
	}
	/**
	 * 设置：近期比赛
	 */
	public void setJinqibisai(String jinqibisai) {
		this.jinqibisai = jinqibisai;
	}
	/**
	 * 获取：近期比赛
	 */
	public String getJinqibisai() {
		return jinqibisai;
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
