package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java112.utilities.MyColor;

/**
 * @author
 *
 */
@WebServlet(
    name = "mvcTeamChallenge",
    urlPatterns = { "/mvc-teamChallenge" }
)
public class MvcTeamChallenge extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                   the HttpServletResponse object
     *@exception  ServletException  if there is a Servlet failure
     *@exception  IOException       if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       MyColor color1 = new MyColor();
       String c1 = request.getParameter("color1");
       color1.setMyColor(c1);

       MyColor color2 = new MyColor();
       String c2 = request.getParameter("color2");
       color2.setMyColor(c2);

       if(c1 != null && c2 !=null)
       {
           if (color1.compare(color2.getMyColor()))
           {
               color1.setCompare(color1.compareChecker(1));
               request.setAttribute("colorCompare", color1);
           } else {
               color2.setCompare(color2.compareChecker(0));
               request.setAttribute("colorCompare", color2);
           }
       }


       String url = "/mvcTeamChallenge.jsp";

       RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
       dispatcher.forward(request, response);


    }
}
