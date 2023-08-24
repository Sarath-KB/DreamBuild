package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Complaints_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
//@include file="SessionValidator.jsp" 
      out.write('\n');
      out.write('\n');
      DB.ConnectionClass connect = null;
      synchronized (_jspx_page_context) {
        connect = (DB.ConnectionClass) _jspx_page_context.getAttribute("connect", PageContext.PAGE_SCOPE);
        if (connect == null){
          connect = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("connect", connect, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Complaint</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        String complaint = "", title = "", date="";
        
        if(request.getParameter("btnsave")!=null)
        {
            String Complaint = request.getParameter("txtcontent");
            title = request.getParameter("title");
            
                
                
            String insQry = "insert into tbl_complaint(complaint_title,complaint_description,complaint_date,user_id)values('"+title+"','"+Complaint+"',curdate(),'"+session.getAttribute("userid")+"')";
            if(connect.executeCommand(insQry))
            {
                out.println("<script>alert('Inserted')</script>");
            }
            else
            {
                out.println("<script>alert('Failed')</script>");
                out.println(insQry);
            }
        }
        if(request.getParameter("did")!=null){
            String del="delete from tbl_complaint where complaint_id='"+request.getParameter("did")+"'";
            connect.executeCommand(del);
            response.sendRedirect("Complaints.jsp");
        }
    
        
        
      out.write("\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("        <form name=\"frmComplaints\" method=\"post\">\n");
      out.write("            <table border=\"1\" align=\"center\" cellpadding=\"10\" style=\"border-collapse: collapse\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Title</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"title\" placeholder=\"Enter Title\" required=\"required\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Description</td>\n");
      out.write("                    <td><textarea  name=\"txtcontent\" placeholder=\"Enter Content\" required=\"required\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\n");
      out.write("                        <input type=\"submit\" name=\"btnsave\" value=\"submit\">\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("                        <br><br>\n");
      out.write("        <table border=\"1\" align=\"center\" cellpadding=\"10\" style=\"border-collapse: collapse\">\n");
      out.write("            <tr>\n");
      out.write("                <th>SI.No</th>\n");
      out.write("                <th>Complaints</th>\n");
      out.write("                <th>Content</th>\n");
      out.write("                <th>Complaint Reply</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
