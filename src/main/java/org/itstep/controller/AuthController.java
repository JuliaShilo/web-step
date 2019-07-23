package org.itstep.controller;

import org.itstep.model.User;
import org.itstep.service.UserService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");

        String login = (String) req.getAttribute("login");
        String password = (String) req.getAttribute("password");

        User user = UserService.findUserByLoginAndPassword(login, password);

        if (user != null){
           resp.sendRedirect("/jsp/good.jsp");
        }
        else {
            resp.sendRedirect("/jsp/wrong.jsp");
        }
    }
}