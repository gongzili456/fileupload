package cn.gongzili.upload.factory;

import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cn.gongzili.upload.utils.PropertyUtils;

public class ServletFileUploadFactory {
	private static final String UPLOAD_SIZE_MAX = PropertyUtils.getValue("uploadSizeMax");
	private static ServletFileUpload servletFileUpload = null;

	public static synchronized ServletFileUpload getServletFileUpload() {
		if (servletFileUpload == null) {
			FileItemFactory factory = new DiskFileItemFactory();
			servletFileUpload = new ServletFileUpload(factory);
			servletFileUpload.setHeaderEncoding("UTF-8");
			servletFileUpload.setSizeMax(Long.parseLong(UPLOAD_SIZE_MAX));
		}
		return servletFileUpload;
	}

}
