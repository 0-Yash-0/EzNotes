package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveNoteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// title,content fetch
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			Note note = new Note(title, content, new Date());
//			System.out.println(note.getId() + " : " + note.getTitle());
			// hibernate:save()
			Session s = FactoryProvider.getFactory().openSession();
			Transaction tx = s.beginTransaction();
			s.save(note);
			tx.commit();
			s.close();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<head>\r\n" + "    <meta charset=\"UTF-8\" />\r\n" + "    <style>\r\n" + "        \r\n"
					+ "        a:link, a:visited {\r\n" + "  color: ghostwhite;\r\n" + "}\r\n" + "a:hover {\r\n"
					+ "  color: aqua;\r\n" + "}\r\n" + "a{\r\n" + "    text-decoration: none;\r\n" + "}\r\n" + "\r\n"
					+ "    </style>\r\n" + "</head>\r\n" + "<body style=\"background: url(img1.jpg) no-repeat;\">\r\n"
					+ "   <div style='position:absolute; left:50%; top:45%; transform: translate(-50%,-50%);'><h1 style="
					+ "'text-align:center;font-family: Brush Script MT, Brush Script Std, cursive;top: 40%; left: 50%; ;font-style:"
					+ " normal;color: ghostwhite;'>Note is added successfully</h1> \r\n"
					+ "    <h1 style='text-align:center;font-family: Brush Script MT, Brush Script Std, cursive;   font-style: normal;top: "
					+ "50%;'><a href='all_notes.jsp' style=\"text-decoration: none;  \">View all notes</a> </h1>\r\n"
					+ "    <h1 style='text-align:center;font-family: Brush Script MT, Brush Script Std, cursive;  font-style: normal;top: "
					+ "50%;'><a href='add_notes.jsp' style=\"text-decoration: none; \">Add new Notes</a> </h1>\r\n"
					+ "    <h1 style='text-align:center;font-family: Brush Script MT, Brush Script Std, cursive;  font-style: normal;top: "
					+ "50%;'><a href='index.jsp' style=\"text-decoration: none; \">Home</a> </h1></div>\r\n"
					+ "</body>");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}




