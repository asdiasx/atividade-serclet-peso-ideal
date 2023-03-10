package com.example.atividadeservletpesoideal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "pesoIdealServlet", value = "/calculo")
public class PesoIdealServlet extends HttpServlet {
    private Double idealMaleWeight(Double height) {
        return (72.7 * height) - 58;
    }

    private Double idealFemaleWeight(Double height) {
        return (62.1 * height) - 44.7;
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String gender = req.getParameter("gender");
        Double height = Double.parseDouble(req.getParameter("height"));

        Double idealWeight = gender.equals("M") ? idealMaleWeight(height) : idealFemaleWeight(height);

        req.setAttribute("idealWeight", String.format("%.2f %%", idealWeight));
        resp.setHeader("idealWeight", String.format("%.2f", idealWeight));
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
