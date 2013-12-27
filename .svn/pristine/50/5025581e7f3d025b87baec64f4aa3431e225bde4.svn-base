package cn.gongzili.upload.execute;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cn.gongzili.upload.doman.Image;
import cn.gongzili.upload.utils.UploadFileUtil;

public class DefaultSaveLocalExecute implements SaveLocalExecute {

	public String saveFile(HttpServletRequest request) {
		String info = null;
		ServletFileUpload servletFileUpload = new ServletFileUpload(
				new DiskFileItemFactory());
		FileOutputStream output = null;
		try {
			List<FileItem> fileItems = servletFileUpload.parseRequest(request);
			for (FileItem fi : fileItems) {

				if (!fi.isFormField()) {
					BufferedImage bufferedImage = ImageIO.read(fi
							.getInputStream());

					if (bufferedImage == null) {
						throw new Exception("this file is not image file!");
					}
					Image image = new Image();

					image.setExif(null);

					String uuidName = UUID.randomUUID().toString();

					image.setExtension(UploadFileUtil.getExtension(fi.getName()));
					image.setName(uuidName + "." + image.getExtension());
					image.setOrginalName(fi.getName());
					image.setSizeInBytes(fi.getSize());
					image.setUploadDate(System.currentTimeMillis());
					image.setWidth(bufferedImage.getWidth());
					image.setHeight(bufferedImage.getHeight());
					double width = bufferedImage.getWidth();
					double hight = bufferedImage.getHeight();
					image.setRatio(width / hight);
					image.setPath(UploadFileUtil.getSavePath()
							+ image.getName());
					image.setUrl("/d/" + image.getName());

					output = new FileOutputStream(image.getPath());
					ImageIO.write(bufferedImage, image.getExtension(), output);
					info = JSONObject.fromObject(image).toString();
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return info;
	}
}
