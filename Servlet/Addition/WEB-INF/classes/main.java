import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class main extends HttpServlet {
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
res.setContentType("text/html");
PrintWriter pw = res.getWriter();

int x=Integer.parseInt(req.getParameter("t1"));
int y=Integer.parseInt(req.getParameter("t2"));
pw.println("Addition is"+(x+y));
pw.close();
}
}
