package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name="Registro", urlPatterns = {"/Registro"})
public class Registro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String telephone = request.getParameter("telephone");

        request.setAttribute("nome", nome);
        request.setAttribute("sobrenome", sobrenome);
        request.setAttribute("telephone", telephone);

        request.getRequestDispatcher("components/Pagina/pagina.jsp").forward(request, response);
    }
}
