<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

    <h1 style="color:blue;text-align:center">Student Registration Form</h1>
     <frm:form modelAttribute="stud">
    
  
      <table border="0" bgcolor="cyan" align="center">
        <tr>
          <td>student id::</td>
          <td><frm:input path="sno"/>
          </tr>
         <tr>
          <td>student name::</td>
          <td><frm:input path="sname"/>
          </tr>
           <tr>
          <td>student address::</td>
          <td><frm:input path="sadd"/>
          </tr>
          <tr>
          <td>student avg::</td>
          <td><frm:input path="avg"/>
          </tr>
          <tr>
          <td><input type="Submit" value="register"></td>
          <td><input type="reset" value="cancel"></td>
          </tr>     
      </table>
    </frm:form>