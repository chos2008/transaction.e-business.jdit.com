/*
 * @(#)FileStorage.java	1.0 2015-6-21 下午10:34:02
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
package org.chos.fs;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * 
 * 
 * @author ada
 * @version 1.0  2015-6-21 下午10:34:02
 * @since 1.0
 */
@Service
public class FileStorage {

	@Value("${fs.root}")
	private String root;
	
	@Value("${fs.base}")
	private String base;

	/**
	 * @param root the root to set
	 */
	public void setRoot(String root) {
		this.root = root;
	}
	
	/**
	 * @param base the base to set
	 */
	public void setBase(String base) {
		this.base = base;
	}
	
	public void write(String file) {
		File f = new File(file);
	}
	
	public void write(File file) {
		
	}
	
	public String write(MultipartFile file, String dest) {
		File f = new File(dest);
		return write(file, f);
	}
	
	public String write(MultipartFile file, String dest, String filename) {
		File f = new File(dest, filename);
		return write(file, f);
	}
	
	public String write(MultipartFile file, File dest, String filename) {
		File f = new File(dest, filename);
		return write(file, f);
	}
	
	public String write(MultipartFile file, File dest) {
		if (dest.exists()) {
			throw new IllegalArgumentException("The file to write is already exists");
		}
		try {
			file.transferTo(dest);
			return dest.getName();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String dwrite(MultipartFile file, String filename) {
		File f = new File(base);
		if (! f.exists()) {
			throw new IllegalArgumentException("FileStorage: base not exists");
		}
		f = new File(base, filename);
		return write(file, f);
	}
}
