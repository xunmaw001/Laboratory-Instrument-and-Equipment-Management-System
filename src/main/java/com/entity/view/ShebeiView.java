package com.entity.view;

import com.entity.ShebeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shebei")
public class ShebeiView extends ShebeiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 设备分类的值
		*/
		private String shebeiValue;
		/**
		* 设备状态的值
		*/
		private String shebeiZhuangtaiValue;



	public ShebeiView() {

	}

	public ShebeiView(ShebeiEntity shebeiEntity) {
		try {
			BeanUtils.copyProperties(this, shebeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 设备分类的值
			*/
			public String getShebeiValue() {
				return shebeiValue;
			}
			/**
			* 设置： 设备分类的值
			*/
			public void setShebeiValue(String shebeiValue) {
				this.shebeiValue = shebeiValue;
			}
			/**
			* 获取： 设备状态的值
			*/
			public String getShebeiZhuangtaiValue() {
				return shebeiZhuangtaiValue;
			}
			/**
			* 设置： 设备状态的值
			*/
			public void setShebeiZhuangtaiValue(String shebeiZhuangtaiValue) {
				this.shebeiZhuangtaiValue = shebeiZhuangtaiValue;
			}










}
