<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<link href="resources/css/bootstrap.min.css">
<link href="resources/css/jquery.fileupload-ui.css">
</head>
<body>
	<!-- 	<form action="upload" method="post" enctype="multipart/form-data">
		<input type="file" name="image"><br> <input type="submit"
			value="submit">
	</form> -->
	<div class="container">

		<form action="upload" enctype="multipart/form-data" method="post">
			标题:<input name="title" type="text"><br> 正文:
			<textarea rows="5" cols="30" name="content"></textarea>
			<br>

			<span class="btn btn-success fileinput-button"> 
				<i class="icon-plus icon-white"></i> 
				<span>选择上传文件</span> 
				<input id="fileupload" type="file" name="files[]" multiple>
			</span> <br> <br>
			
			进度条
			<div id="progress" class="progress progress-success progress-striped">
				<div class="bar"></div>
			</div>
			
			已经上传的文件列表
			<div id="files"></div>

			<input type="file" name="image"> <br> <input
				type="submit" value="submit">
		</form>
	</div>


	<script src="resources/js/jquery-1.8.3.min.js"></script>
	<script src="resources/js/jquery.ui.widget.js"></script>
	<script src="resources/js/jquery.iframe-transport.js"></script>
	<script src="resources/js/jquery.fileupload.js"></script>
	<script type="text/javascript">
		$(function(){
			
			$('#fileupload').fileupload(
			{
				autoUpload : true,
				url : 'upload',
				dataType : 'json',
				done : function(even, data) {
					$.each(data.result.files, function(index, file) {
						$('<p/>').text(file.name).appendTo('#files');
					});
				},
				progressall : function(even, data) {
					var progress = parseInt(data.loaded / data.total
							* 100, 10);
					$('#progress .bar').css('width', progress + '%');
				}
			});
		});
	</script>
</body>
</html>