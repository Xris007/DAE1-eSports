package pe.isil.LoginController;

import pe.isil.dao.DaoContext;
import pe.isil.dao.TeamDAO;
import pe.isil.model.Team;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/home", loadOnStartup = 2, name = "home")

public class HomeController extends HttpServlet {

    @Override
    public void init() throws ServletException {
        DaoContext.init(this.getServletContext());
    }



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        List<Team> teams = TeamDAO.findAllTeams();
        request.setAttribute("teams", teams);
        request.getRequestDispatcher("/home").forward(request,resp);
    }


}
