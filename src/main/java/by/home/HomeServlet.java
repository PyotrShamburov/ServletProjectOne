package by.home;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sign = req.getParameter("sign").toLowerCase().trim();
        String firstNumber = req.getParameter("num1");
        String secondNumber = req.getParameter("num2");

        boolean numOneIsNumber = firstNumber.matches("(\\-*)\\d*");
        boolean numTwoIsNumber = secondNumber.matches("(\\-*)\\d*");
        boolean signIsWord = sign.matches("\\p{Lower}*");

        if (!numOneIsNumber || !numTwoIsNumber || firstNumber.isEmpty() || secondNumber.isEmpty()){
            resp.getWriter().print("Wrong value of numbers,please relax and try again!");
        }else if (!signIsWord || sign.isEmpty()) {
            resp.getWriter().print("Sign of arithmetic operation should to consist only letters!");
        }else{
            int numOne = Integer.parseInt(firstNumber);
            int numTwo = Integer.parseInt(secondNumber);
            if( sign.equals("div") && numTwo == 0){
                resp.getWriter().print("Division by zero!");
            }else{
                Calculator calc = new Calculator();
                resp.getWriter().print(calc.doCalc(numOne,numTwo,sign));
            }
        }
    }
}
