package by.home;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/reverse")
public class StringServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String word = req.getParameter("word").toLowerCase().trim();
        boolean wordIsWord = word.matches("\\p{Lower}*");
        if (!wordIsWord || word.isEmpty()) {
            resp.getWriter().print("Word should consist only letters and can't be empty!");
        } else {
            StringReverser reverser = new StringReverser();
            resp.getWriter().print(reverser.reverseWord(word));
        }
    }
}
