package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@WebServlet(value = "/time")
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String timezone = request.getParameter("timezone");

        if (timezone == null){
            timezone = "UTC";
        } else {
            timezone = timezone.replace(" ", "+");
        }
        String dateTime = LocalDateTime.now(ZoneId.of(timezone))
                .atZone(ZoneId.of(timezone))
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"));

        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.write(dateTime);
        out.close();
    }
}
