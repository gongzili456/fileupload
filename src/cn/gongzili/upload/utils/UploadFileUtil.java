package cn.gongzili.upload.utils;

public class UploadFileUtil {

	private static String save_path = null;

	public synchronized static String getSavePath() {
		if (save_path == null) {
			save_path = PropertyUtils
					.getValue(PropertyUtils.UPLOADIMAGE_SAVEPATH);
		}
		return save_path;
	}

	public static String getExtension(String orginalName) {
		String ext = orginalName.substring(orginalName.lastIndexOf(".") + 1);
		return ext;
	}
}
