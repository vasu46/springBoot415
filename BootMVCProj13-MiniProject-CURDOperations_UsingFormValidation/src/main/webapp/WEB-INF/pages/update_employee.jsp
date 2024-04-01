<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@page isELIgnored="false"%>

<link rel="stylesheet" href="css/style.css"/>

<h1 style="color:red;text-align:center">Update Employee::</h1>


<frm:form modelAttribute="emp">
      <%--   <p style="color:red;text-align:center">
         <frm:errors path="*"/>
         </p> --%>
    <table align="center" bgcolor="cyan">
      <tr>
      <td>Employee Number::</td>
      <td><frm:input path="empno" readonly="true"/></td>
      </tr>
      
      <tr>
      <td>Employee Name::</td>
      <td><frm:input path="ename"/><frm:errors path="ename"></frm:errors></td>
      </tr>
      
      <tr>
      <td>Employee job::</td>
      <td><frm:input path="job"/><frm:errors path="job"></frm:errors></td>
      </tr>
      
      <tr>
      <td>Employee salary::</td>
      <td><frm:input path="sal"/><frm:errors path="sal"></frm:errors></td>
      </tr>
      
      <tr>
      <td>deptno::</td>
      <td><frm:input type="number" min="1" max="99" path="deptno"/><frm:errors path="deptno"></frm:errors></td>
      </tr>
      
      <tr>
      <td><input type="submit" value="submit"></td>
      <td><input type="reset" value="cancel"></td>
      </tr>
      
      </table>
      </frm:form>
      
     
      
