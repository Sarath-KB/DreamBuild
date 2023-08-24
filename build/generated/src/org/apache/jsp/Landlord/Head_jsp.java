package org.apache.jsp.Landlord;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Head_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>DREAM BUILD</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Construction Company Website Template\" name=\"keywords\">\n");
      out.write("        <meta content=\"Construction Company Website Template\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"../Template/Main/img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- CSS Libraries -->\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/Template/Main/lib/flaticon/font/flaticon.css\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"../Template/Main/lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/slick/slick.css\" rel=\"stylesheet\">\n");
      out.write("          <link href=\"../Template/form.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/slick/slick-theme.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Template Stylesheet -->\n");
      out.write("        <link href=\"../Template/Main/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <!-- Top Bar Start -->\n");
      out.write("            <div class=\"top-bar\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row align-items-center\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-12\">\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <h1>DREAM BUILD</h1>\n");
      out.write("                                    <!-- <img src=\"../Template/Main/img/logo.jpg\" alt=\"Logo\"> -->\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-8 col-md-7 d-none d-lg-block\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-4\">\n");
      out.write("                                    <div class=\"top-bar-item\">\n");
      out.write("                                        <div class=\"top-bar-icon\">\n");
      out.write("                                            <i class=\"flaticon-calendar\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"top-bar-text\">\n");
      out.write("                                            <h3>Opening Hour</h3>\n");
      out.write("                                            <p>Mon - Fri, 8:00 - 9:00</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-4\">\n");
      out.write("                                    <div class=\"top-bar-item\">\n");
      out.write("                                        <div class=\"top-bar-icon\">\n");
      out.write("                                            <i class=\"flaticon-call\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"top-bar-text\">\n");
      out.write("                                            <h3>Call Us</h3>\n");
      out.write("                                            <p>9999999999</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-4\">\n");
      out.write("                                    <div class=\"top-bar-item\">\n");
      out.write("                                        <div class=\"top-bar-icon\">\n");
      out.write("                                            <i class=\"flaticon-send-mail\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"top-bar-text\">\n");
      out.write("                                            <h3>Email Us</h3>\n");
      out.write("                                            <p>thedreambuildgroup@gmail.com</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Top Bar End -->\n");
      out.write("\n");
      out.write("            <!-- Nav Bar Start -->\n");
      out.write("            <div class=\"nav-bar\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark\">\n");
      out.write("                        <a href=\"../Template/Main/#\" class=\"navbar-brand\">MENU</a>\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n");
      out.write("                           <div class=\"navbar-nav mr-auto\">\n");
      out.write("                                <a href=\"Homepage.jsp\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                                <div class=\"nav-item dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Profile</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a href=\"MyProfile.jsp\" class=\"dropdown-item\">My Profile</a>\n");
      out.write("                                        <a href=\"EditProfile.jsp\" class=\"dropdown-item\">Edit Profile</a>\n");
      out.write("                                        <a href=\"ChangePassword.jsp\" class=\"dropdown-item\">Change Password</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"Land.jsp\" class=\"nav-item nav-link\">Land Details</a>\n");
      out.write("<!--                                <a href=\"SearchLabour.jsp\" class=\"nav-item nav-link\">Labour</a>-->\n");
      out.write("<!--                                <a href=\"MyBooking.jsp\" class=\"nav-item nav-link\">Booking</a>\n");
      out.write("                                <a href=\"MyRequest.jsp\" class=\"nav-item nav-link\">Request</a>-->\n");
      out.write("                                <div class=\"nav-item dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">User Land Request</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a href=\"ViewUserLandBookings.jsp\" class=\"dropdown-item\">New Request</a>\n");
      out.write("                                        <a href=\"ViewAcceptedLandBookings.jsp\" class=\"dropdown-item\">Accepted Request</a>\n");
      out.write("                                        <a href=\"ViewRejectedLandBookings.jsp\" class=\"dropdown-item\">Rejected Request</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                    <a href=\"BookingReport.jsp\" class=\"nav-item nav-link\">Report</a>\n");
      out.write("                                <div class=\"nav-item dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Complaint & Feedback</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a href=\"Complaints.jsp\" class=\"dropdown-item\">Complaint</a>\n");
      out.write("                                        <a href=\"FeedBack.jsp\" class=\"dropdown-item\">Feedback</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                 <a href=\"../logout.jsp\" class=\"nav-item nav-link\">Logout</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ml-auto\">\n");
      out.write("                                <a class=\"btn\" href=\"#\">Get A Quote</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Nav Bar End -->\n");
      out.write("            \n");
      out.write("            <br><br><br><br><br>");
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
