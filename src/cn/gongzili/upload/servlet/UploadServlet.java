package cn.gongzili.upload.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.gongzili.upload.execute.DefaultSaveLocalExecute;

/**
 * Servlet implementation class upload
 */
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DefaultSaveLocalExecute saveLocalExecute = new DefaultSaveLocalExecute();

	/**
	 * Default constructor.
	 */
	public UploadServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		pw.println(saveLocalExecute.saveFile(request));
	}
}
