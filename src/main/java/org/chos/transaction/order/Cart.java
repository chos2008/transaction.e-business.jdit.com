/*
 * @(#)Cart.java	1.0 2015-4-26 上午01:31:37
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
package org.chos.transaction.order;

import java.util.Date;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-4-26 上午01:31:37
 * @since 1.0
 */
public class Cart {

	private long id;
	
	private double amount;
	
	private String ut;
	
	private long merchandiseId;
	
	private int merchandiseType;
	
	private int quantity;
	
	private Date creation;
	
	private Date updation;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}


	/**
	 * @return the ut
	 */
	public String getUt() {
		return ut;
	}

	/**
	 * @param ut the ut to set
	 */
	public void setUt(String ut) {
		this.ut = ut;
	}

	/**
	 * @return the merchandiseId
	 */
	public long getMerchandiseId() {
		return merchandiseId;
	}

	/**
	 * @param merchandiseId the merchandiseId to set
	 */
	public void setMerchandiseId(long merchandiseId) {
		this.merchandiseId = merchandiseId;
	}

	/**
	 * @return the merchandiseType
	 */
	public int getMerchandiseType() {
		return merchandiseType;
	}

	/**
	 * @param merchandiseType the merchandiseType to set
	 */
	public void setMerchandiseType(int merchandiseType) {
		this.merchandiseType = merchandiseType;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
