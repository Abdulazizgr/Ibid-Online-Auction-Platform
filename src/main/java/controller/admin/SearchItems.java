package controller.admin;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SearchItems extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession currSession = request.getSession(false);
        String check =(String) currSession.getAttribute("AdminEmail");

        if(check != null && !check.equals("")){
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin/SearchItems.jsp");
            rd.forward(request, response);
        }else{
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/admin/notfound.jsp");
            rd.forward(request, response);
        }
    }
    
}
