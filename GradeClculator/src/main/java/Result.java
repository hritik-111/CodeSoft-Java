

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rollNumber = request.getParameter("rollno");
		String name = request.getParameter("s_name");
		double subject1Marks = Double.parseDouble(request.getParameter("sub1"));
		double subject2Marks = Double.parseDouble(request.getParameter("sub2"));
		double subject3Marks = Double.parseDouble(request.getParameter("sub3"));
		double subject4Marks = Double.parseDouble(request.getParameter("sub4"));
		double subject5Marks = Double.parseDouble(request.getParameter("sub5"));
		

		double totalMarks = subject1Marks + subject2Marks +subject3Marks+subject4Marks+subject5Marks; /* add marks of other subjects */;
		double averagePercentage = (totalMarks / 500) * 100; // Adjust totalNumSubjects
		String grade = calculateGrade(averagePercentage); // Implement calculateGrade method
		
		request.setAttribute("rollNumber", rollNumber);
		request.setAttribute("name", name);
		request.setAttribute("totalMarks", totalMarks);
		request.setAttribute("averagePercentage", averagePercentage);
		request.setAttribute("grade", grade);

		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
