package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Landlord_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Guest/Head.jsp");
    _jspx_dependants.add("/Guest/Foot.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Landlord</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"../Assets/JQ/jQuery.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function getPlace(did)\n");
      out.write("            {\n");
      out.write("                    //alert(did);\n");
      out.write("                    $.ajax({\n");
      out.write("                    url: \"../Assets/Ajaxpages/Ajaxplace.jsp?did=\"+did,\n");
      out.write("                      success: function(html){\n");
      out.write("                            $(\"#place\").html(html);\n");
      out.write("                      }\n");
      out.write("                    });\n");
      out.write("            }\n");
      out.write("            function chkpwd(txtrp, txtp)\n");
      out.write("{\n");
      out.write("\tif((txtrp.value)!=(txtp.value))\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"pass\").innerHTML = \"<span style='color: red;'>Passwords Mismatch</span>\";\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function checknum(elem)\n");
      out.write("{\n");
      out.write("\tvar numericExpression = /^[0-9]{8,10}$/;\n");
      out.write("\tif(elem.value.match(numericExpression))\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"contact\").innerHTML = \"\";\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"contact\").innerHTML = \"<span style='color: red;'>Numbers Only Allowed</span>\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function emailval(elem)\n");
      out.write("{\n");
      out.write("\tvar emailexp=/^([a-zA-Z0-9.\\_\\-])+\\@([a-zA-Z0-9.\\_\\-])+\\.([a-zA-Z]{2,4})$/;\n");
      out.write("\tif(elem.value.match(emailexp))\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"content\").innerHTML = \"\";\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\t\n");
      out.write("\t\tdocument.getElementById(\"content\").innerHTML =\"<span style='color: red;'>Check Email Address Entered</span>\";;\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function nameval(elem)\n");
      out.write("{\n");
      out.write("\tvar emailexp=/^([A-Za-z ]*)$/;\n");
      out.write("\tif(elem.value.match(emailexp))\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"name\").innerHTML = \"\";\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\t\n");
      out.write("\t\tdocument.getElementById(\"name\").innerHTML = \"<span style='color: red;'>Alphabets Are Allowed</span>\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("        function checkEmail(did)\n");
      out.write("            {\n");
      out.write("                    //alert(did);\n");
      out.write("                    $.ajax({\n");
      out.write("                    url: \"../Assets/Ajaxpages/AjaxEmail.jsp?did=\"+did,\n");
      out.write("                      success: function(html){\n");
      out.write("                            $(\"#content\").html(html);\n");
      out.write("                      }\n");
      out.write("                    });\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>DREAM BUILD - Template</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Construction Company Website Template\" name=\"keywords\">\n");
      out.write("        <meta content=\"Construction Company Website Template\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"Template/Main/img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- CSS Libraries -->\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Template/Main/Template/Main/lib/flaticon/font/flaticon.css\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"Template/Main/lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Template/Main/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Template/Main/lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Template/Main/lib/slick/slick.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Template/Main/lib/slick/slick-theme.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Template Stylesheet -->\n");
      out.write("        <link href=\"Template/Main/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\" style=\"background-color: #ffc107\">\n");
      out.write("            <!-- Top Bar Start -->\n");
      out.write("            <div class=\"top-bar\" >\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row align-items-center\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-12\">\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                <a href=\"Template/Main/index.html\">\n");
      out.write("                                    <h1>DREAM BUILD</h1>\n");
      out.write("                                    <!-- <img src=\"Template/Main/img/logo.jpg\" alt=\"Logo\"> -->\n");
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
      out.write("                                            <p>+012 345 6789</p>\n");
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
      out.write("                        <a href=\"Template/Main/#\" class=\"navbar-brand\">MENU</a>\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n");
      out.write("                           <div class=\"navbar-nav mr-auto\">\n");
      out.write("                                <a href=\"index.jsp\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                                <div class=\"nav-item dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Sign Up</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a href=\"Landlord.jsp\" class=\"dropdown-item\">Landlord</a>\n");
      out.write("                                        <a href=\"Shop.jsp\" class=\"dropdown-item\">Shop</a>\n");
      out.write("                                        <a href=\"User.jsp\" class=\"dropdown-item\">User</a>\n");
      out.write("                                        <a href=\"Worker.jsp\" class=\"dropdown-item\">Worker</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"../Login/Login.jsp\" class=\"nav-item nav-link\">Login</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Nav Bar End -->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br> <br> <br> <br>\n");
      out.write("        <h1>Landlord Registration</h1>\n");
      out.write("            <form name=\"frmlandlord\" method=\"post\" action=\"../Assets/Actionpages/LandlordUploadAction.jsp\" enctype=\"multipart/form-data\">\n");
      out.write("            <table border=\"1\" align=\"center\" cellpadding=\"10\" style=\"border-collapse: collapse\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtname\" value=\"\" required onchange=\"nameval(this)\">\n");
      out.write("                    <div id=\"name\"></div></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender</td> \n");
      out.write("                    <td><input type=\"radio\" name='gender' value='Male'>Male\n");
      out.write("                        <input type=\"radio\" name='gender' value='Female'>Female\n");
      out.write("                    </td>   \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                   <td>Contact</td>\n");
      out.write("                   <td><input type=\"text\" name=\"txtcontact\" value=\"\" pattern=\"[0-9]{10}\" required onchange=\"checknum(this)\">\n");
      out.write("                   <div id=\"contact\"></div></td>\n");
      out.write("                </tr> \n");
      out.write("                <tr>\n");
      out.write("                   <td>Email</td>\n");
      out.write("                    <td><input type=\"email\" name=\"email\" value=\"\" id=\"email\" required onkeyup=\"emailval(this),checkEmail(this.value)\">\n");
      out.write("                    <div id=\"content\"></div></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   <td>Date of Birth</td>\n");
      out.write("                    <td><input type=\"date\" name=\"dob\" value=\"\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td>District</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"district\" required onchange=\"getPlace(this.value)\">\n");
      out.write("                            <option value=\"\" selected>--Select--</option>\n");
      out.write("                            ");

                             String st="select * from tbl_district";
                             ResultSet rs=con.selectCommand(st);
           
                                while(rs.next())
                                {
                         
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(rs.getString("district_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("district_name") );
      out.write("</option>\n");
      out.write("                            ");

                             }
                            
      out.write("\n");
      out.write("                        </select>    \n");
      out.write("                    </td>\n");
      out.write("                </tr>    \n");
      out.write("                <tr>\n");
      out.write("                    <td>Place</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"place\" id=\"place\" required>\n");
      out.write("                            <option value=\"\" selected>--Select--</option>\n");
      out.write("                          \n");
      out.write("                        </select>    \n");
      out.write("                    </td>\n");
      out.write("                </tr> \n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td><textarea name=\"txtaddress\"required>\n");
      out.write("                        </textarea>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Photo</td>\n");
      out.write("                    <td><input type=\"file\" name=\"image\"  required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Proof</td>\n");
      out.write("                    <td><input type=\"file\" name=\"proof\"  required></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                   <td>Password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"txtpwd\" value=\"\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   <td>Confirm Password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"txtpwd1\" value=\"\" required onchange=\"chkpwd(this,txtpwd)\">\n");
      out.write("                    <div id=\"pass\"></div></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\n");
      out.write("                        <input type=\"submit\" name=\"btnsave\" value=\"SAVE\">\n");
      out.write("                        <input type=\"reset\" name=\"btncancel\" value=\"CANCEL\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>  \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("<br><br><br><br><br>\n");
      out.write("            <!-- Footer Start -->\n");
      out.write("            <div class=\"footer wow fadeIn\" data-wow-delay=\"0.3s\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                            <div class=\"footer-contact\">\n");
      out.write("                                <h2>Office Contact</h2>\n");
      out.write("                                <p><i class=\"fa fa-map-marker-alt\"></i>123 Street, New York, USA</p>\n");
      out.write("                                <p><i class=\"fa fa-phone-alt\"></i>+012 345 67890</p>\n");
      out.write("                                <p><i class=\"fa fa-envelope\"></i>info@example.com</p>\n");
      out.write("                                <div class=\"footer-social\">\n");
      out.write("                                    <a href=\"../Template/Main/\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                                    <a href=\"../Template/Main/\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                                    <a href=\"../Template/Main/\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                                    <a href=\"../Template/Main/\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                                    <a href=\"../Template/Main/\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                            <div class=\"footer-link\">\n");
      out.write("                                <h2>Services Areas</h2>\n");
      out.write("                                <a href=\"../Template/Main/\">Building Construction</a>\n");
      out.write("                                <a href=\"../Template/Main/\">House Renovation</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Architecture Design</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Interior Design</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Painting</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                            <div class=\"footer-link\">\n");
      out.write("                                <h2>Useful Pages</h2>\n");
      out.write("                                <a href=\"../Template/Main/\">About Us</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Contact Us</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Our Team</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Projects</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Testimonial</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                            <div class=\"newsletter\">\n");
      out.write("                                <h2>Newsletter</h2>\n");
      out.write("                                <p>\n");
      out.write("                                    Lorem ipsum dolor sit amet elit. Phasellus nec pretium mi. Curabitur facilisis ornare velit non vulpu\n");
      out.write("                                </p>\n");
      out.write("                                <div class=\"form\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Email here\">\n");
      out.write("                                    <button class=\"btn\">Submit</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container footer-menu\">\n");
      out.write("                    <div class=\"f-menu\">\n");
      out.write("                        <a href=\"../Template/Main/\">Terms of use</a>\n");
      out.write("                        <a href=\"../Template/Main/\">Privacy policy</a>\n");
      out.write("                        <a href=\"../Template/Main/\">Cookies</a>\n");
      out.write("                        <a href=\"../Template/Main/\">Help</a>\n");
      out.write("                        <a href=\"../Template/Main/\">FQAs</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container copyright\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <p>&copy; <a href=\"/#\">Your Site Name</a>, All Right Reserved.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <p>Designed By <a href=\"https://htmlcodex.com\">HTML Codex</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Footer End -->\n");
      out.write("\n");
      out.write("            <a href=\"#\" class=\"back-to-top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- JavaScript Libraries -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/wow/wow.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/isotope/isotope.pkgd.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/lightbox/js/lightbox.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/counterup/counterup.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/slick/slick.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Javascript -->\n");
      out.write("        <script src=\"../Template/Main/js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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