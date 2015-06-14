/*
 * @(#)Category.java	1.0 2015-5-3 上午11:56:01
 *
 * Copyright 2008 WWW.YHD.COM. All rights reserved.
 *      YIHAODIAN PROPRIETARY/CONFIDENTIAL. 
 *       Use is subject to license terms.
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the WWW.YHD.COM License is distributed on an "AS 
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either ex-
 * press or implied. See the License for the specific language govern-
 * ing permissions and limitations under the License.
 */
package org.chos.transaction;

import java.util.Date;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-5-3 上午11:56:01
 * @since 1.0
 */
public class Category {

	private int id;
	
	private int categoryId;
	
	private String name;
	
	private int proximity;
	
	private long userId;
	
	private int parentId;
	
	private int open;
	
	private String description;
	
	private Date creation;
	
	private Date updation;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the proximity
	 */
	public int getProximity() {
		return proximity;
	}

	/**
	 * @param proximity the proximity to set
	 */
	public void setProximity(int proximity) {
		this.proximity = proximity;
	}

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * @return the parentId
	 */
	public int getParentId() {
		return parentId;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the open
	 */
	public int getOpen() {
		return open;
	}

	/**
	 * @param open the open to set
	 */
	public void setOpen(int open) {
		this.open = open;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the creation
	 */
	public Date getCreation() {
		return creation;
	}

	/**
	 * @param creation the creation to set
	 */
	public void setCreation(Date creation) {
		this.creation = creation;
	}

	/**
	 * @return the updation
	 */
	public Date getUpdation() {
		return updation;
	}

	/**
	 * @param updation the updation to set
	 */
	public void setUpdation(Date updation) {
		this.updation = updation;
	}
}
