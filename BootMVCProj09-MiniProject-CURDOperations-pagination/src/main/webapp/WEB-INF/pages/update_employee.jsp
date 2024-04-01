<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@page isELIgnored="false"%>

<h1 style="color:red;text-align:center">Update Employee::</h1>


<frm:form modelAttribute="emp">
    <table align="center" bgcolor="cyan">
      <tr>
      <td>Employee Number::</td>
      <td><frm:input path="empno" readonly="true"/></td>
      </tr>
      
      <tr>
      <td>Employee Name::</td>
      <td><frm:input path="ename"/></td>
      </tr>
      
      <tr>
      <td>Employee job::</td>
      <td><frm:input path="job"/></td>
      </tr>
      
      <tr>
      <td>Employee salary::</td>
      <td><frm:input path="sal"/></td>
      </tr>
      
      <tr>
      <td>deptno::</td>
      <td><frm:input type="number" min="1" max="99" path="deptno"/></td>
      </tr>
      
      <tr>
      <td><input type="submit" value="submit"></td>
      <td><input type="reset" value="cancel"></td>
      </tr>
      
      </table>
      </frm:form>
      
     
      
