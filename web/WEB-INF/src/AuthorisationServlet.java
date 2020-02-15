import javax.servlet.http.*;
import java.io.IOException;

public  class AuthorisationServlet extends HttpServlet {
    private final String log = "login";
    private final String pass = "password";

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
        String l=request.getParameter("login");
        String p=request.getParameter("password");
        if(l.equals(log)&&l.equals(pass))
        {
            response.setStatus(HttpServletResponse.SC_OK);
            response.getWriter().print("Hello, you have been authorized");
        }
        else
        {
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            response.getWriter().print("Authorization Error");
        }

    }
}
