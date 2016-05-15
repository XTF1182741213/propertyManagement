/**
 * 
 */
package com.ilovecl.myproperty.struts.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.ilovecl.myproperty.model.RepairOrder;
import com.ilovecl.myproperty.service.IPostRepairOrderService;
import com.ilovecl.myproperty.util.MD5;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 邱永臣
 * 
 */
@SuppressWarnings("serial")
public class PostRepairOrderAction extends ActionSupport {
	private String problemDescription; // 故障物业的具体描述
	private String place; // 故障物业的地点
	private Date launchDate; // 保修单的上报时间

	private String message;

	private List<File> file; // 传到服务器里来的文件
	private List<String> fileFileName; // 文件名
	private List<String> fileContentType; // 文件类型
	private List<String> dataUrl;

	private IPostRepairOrderService postRepairOrderService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		this.message = "";

		if (problemDescription.equals("")) {
			this.message += "问题描述为空";
			return INPUT;
		} else if (place.equals("")) {
			this.message += "物业故障地点为空";
			return INPUT;
		} else if (file == null || file.size() != 1) {
			this.message += "现场图片为空为空";
			return INPUT;
		}

		String md5 = saveImage();

		java.util.Date date = new java.util.Date();
		if (postRepairOrderService.postRepairOrder(new RepairOrder(
				problemDescription, place, md5, new Date(date.getTime())))) {
			return SUCCESS;
		}

		this.message += "提交失败";
		return INPUT;
	}

	// 将学生上传的现场图片保存下来
	private String saveImage() throws IOException {
		String md5String = "";

		dataUrl = new ArrayList<String>();

		String imgpath = "upload/";

		// 将文件存储在服务器中
		for (int i = 0; i < file.size(); ++i) {
			InputStream inputStream = new FileInputStream(file.get(i));

			// 获取网站根目录的绝对路径（如C:\Users\DELL\Workspaces\MyEclipse Professional
			// 2014\.metadata\.me_tcat\webapps\MyProperty\）
			String rootPath = ServletActionContext.getServletContext()
					.getRealPath("/");

			dataUrl.add(imgpath + fileFileName.get(i));

			File dest = new File(rootPath + imgpath, fileFileName.get(i));

			// 得到经MD5编码后的文件名
			md5String = MD5.getMD5(fileFileName.get(i));

			OutputStream outputStream = new FileOutputStream(dest);

			byte[] buffer = new byte[2048];

			int len = 0;

			while ((len = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, len);
			}

			inputStream.close();
			outputStream.close();
		}

		return md5String;
	}

	/**
	 * @return the problemDescription
	 */
	public String getProblemDescription() {
		return problemDescription;
	}

	/**
	 * @param problemDescription
	 *            the problemDescription to set
	 */
	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place
	 *            the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	/**
	 * @return the launchDate
	 */
	public Date getLaunchDate() {
		return launchDate;
	}

	/**
	 * @param launchDate
	 *            the launchDate to set
	 */
	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the file
	 */
	public List<File> getFile() {
		return file;
	}

	/**
	 * @param file
	 *            the file to set
	 */
	public void setFile(List<File> file) {
		this.file = file;
	}

	/**
	 * @return the fileFileName
	 */
	public List<String> getFileFileName() {
		return fileFileName;
	}

	/**
	 * @param fileFileName
	 *            the fileFileName to set
	 */
	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}

	/**
	 * @return the fileContentType
	 */
	public List<String> getFileContentType() {
		return fileContentType;
	}

	/**
	 * @param fileContentType
	 *            the fileContentType to set
	 */
	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}

	/**
	 * @return the dataUrl
	 */
	public List<String> getDataUrl() {
		return dataUrl;
	}

	/**
	 * @param dataUrl
	 *            the dataUrl to set
	 */
	public void setDataUrl(List<String> dataUrl) {
		this.dataUrl = dataUrl;
	}

	/**
	 * @return the postRepairOrderService
	 */
	public IPostRepairOrderService getPostRepairOrderService() {
		return postRepairOrderService;
	}

	/**
	 * @param postRepairOrderService
	 *            the postRepairOrderService to set
	 */
	public void setPostRepairOrderService(
			IPostRepairOrderService postRepairOrderService) {
		this.postRepairOrderService = postRepairOrderService;
	}

}
