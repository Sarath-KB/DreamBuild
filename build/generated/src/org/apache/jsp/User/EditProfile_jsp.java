package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/User/SessionValidator.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");

        response.setHeader("Cache-Control", "no-cache, no-store");
        if(session.getAttribute("userid") == null)
        {
            response.sendRedirect("../");
        }
    
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>EditProfile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <h1>Edit Profile</h1>\n");
      out.write("        <br>\n");
      out.write("        <a href=\"Homepage.jsp\">Home</a> \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <form name=\"frmeditprofile\" method=\"post\" action=\"../Assets/Actionpages/UserProfileEditAction.jsp\" enctype=\"multipart/form-data\">\n");
      out.write("            <table border=\"1\" align=\"center\" cellpadding=\"10\" style=\"border-collapse: collapse\">\n");
      out.write("               ");

                  String sel="select * from tbl_user where user_id='"+session.getAttribute("userid")+"'";
                  ResultSet rs=con.selectCommand(sel);
                  if(rs.next())
                {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtfname\" value=\"");
      out.print(rs.getString("user_name") );
      out.write("\"></td>\n");
      out.write("                                   \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                   <td>Contact</td>\n");
      out.write("                   <td><input type=\"text\" name=\"txtcontact\" value=\"");
      out.print(rs.getString("user_contact") );
      out.write("\" pattern=\"[0-9]{10}\"></td>\n");
      out.write("                </tr> \n");
      out.write("                <tr>\n");
      out.write("                   <td>Date of Birth</td>\n");
      out.write("                    <td><input type=\"date\" name=\"dob\" value=\"");
      out.print(rs.getString("user_dob") );
      out.write("\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td><textarea name=\"txtaddress\">");
      out.print(rs.getString("user_address") );
      out.write("\n");
      out.write("                        </textarea>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Photo</td>\n");
      out.write("                    <td>\n");
      out.write("                       <img src=\"../Assets/User/");
      out.print(rs.getString("user_photo") );
      out.write("\"name=\"txtlogo\" id=\"profile-image\" height=\"120\" width=\"120\" align=\"center\" >\n");
      out.write("                        <input type=\"file\" name=\"image\" id=\"profile-image-upload\" accept='image/*'  onchange=\"readURL(this)\" style=\"display: none\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");
}
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\n");
      out.write("                        <input type=\"submit\" name=\"btnedit\" value=\"EDIT PROFILE\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>  \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<script src=\"../Assets/JQ/jQuery.js\"></script>\n");
      out.write("<script>\n");
      out.write("$('#profile-image').on('click', function(callback) {\n");
      out.write("    $('#profile-image-upload').click();\n");
      out.write("});\n");
      out.write(" function readURL(input) {\n");
      out.write("    if (input.files && input.files[0]) {\n");
      out.write("    \n");
      out.write("      var reader = new FileReader();\n");
      out.write("      reader.onload = function (e) { \n");
      out.write("        document.querySelector(\"#profile-image\").setAttribute(\"src\",e.target.result);\n");
      out.write("      };\n");
      out.write("\n");
      out.write("      reader.readAsDataURL(input.files[0]); \n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("\n");
      out.write("\t</script>");
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
