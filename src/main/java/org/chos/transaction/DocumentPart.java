/*
 * @(#)Document.java	1.0 2015-4-18 下午03:52:02
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
 * @version 1.0  2015-4-18 下午03:52:02
 * @since 1.0
 */
public class DocumentPart {

	private long id;
	
	private long documentId;
	
	private int documentType;
	
	private String partContent;
	
	private int partType;
	
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
	 * @return the documentId
	 */
	public long getDocumentId() {
		return documentId;
	}

	/**
	 * @param documentId the documentId to set
	 */
	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}

	/**
	 * @return the documentType
	 */
	public int getDocumentType() {
		return documentType;
	}

	/**
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(int documentType) {
		this.documentType = documentType;
	}

	/**
	 * @return the partContent
	 */
	public String getPartContent() {
		return partContent;
	}

	/**
	 * @param partContent the partContent to set
	 */
	public void setPartContent(String partContent) {
		this.partContent = partContent;
	}

	/**
	 * @return the partType
	 */
	public int getPartType() {
		return partType;
	}

	/**
	 * @param partType the partType to set
	 */
	public void setPartType(int partType) {
		this.partType = partType;
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
