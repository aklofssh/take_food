package xc.take.servlet.UI;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xc.take.domain.RoleVo;
import xc.take.service.IRoleVoService;
import xc.take.service.impl.RoleVoServiceImpl;

public class ShowRoleServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			IRoleVoService roleVoServiceImpl = new RoleVoServiceImpl();
			List<RoleVo> list = roleVoServiceImpl.findByAll();
	
			request.setAttribute("list", list);
			
			request.getRequestDispatcher("/WEB-INF/showRoleList.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			this.doGet(request, response);
	}

}
