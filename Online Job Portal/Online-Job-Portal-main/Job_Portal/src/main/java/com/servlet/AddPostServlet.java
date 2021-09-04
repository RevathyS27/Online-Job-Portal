package com.servlet;

import javax.servlet.http.*;

import com.DB.DBConnect;
import com.dao.JobDAO;
import com.entity.Jobs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/addjobs")
public class AddPostServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			String title=req.getParameter("title");
			String location=req.getParameter("location");
			String category=req.getParameter("category");
			String status=req.getParameter("status");
			String desc=req.getParameter("desc");
			
			Jobs j=new Jobs();
			j.setTitle(title);
			j.setDescription(desc);
			j.setLocation(location);
			j.setStatus(status);
			j.setCategory(category);
			
			HttpSession session=req.getSession();

			JobDAO  dao=new JobDAO(DBConnect.getConn());
			boolean f=dao.addJobs(j);
			if(f) {
				session.setAttribute("succMsg", "Job Post Successfully");
				resp.sendRedirect("add_jobs.jsp");
				
			}else {
				
				session.setAttribute("succMsg", "Something Went Wrong");
				resp.sendRedirect("add_jobs.jsp");
					
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	
}
