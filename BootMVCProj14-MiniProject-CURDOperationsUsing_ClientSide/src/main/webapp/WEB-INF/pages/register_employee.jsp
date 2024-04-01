<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@page isELIgnored="false"%>

<link rel="stylesheet" type="text/css" href="css/style.css">

<script language="JavaScript" src="js/validation.js">
</script>

<h1 style="color:red;text-align:center">Register Employee::</h1>
  <frm:form modelAttribute="emp" onsubmit="return doValidations(this)">

    <table align="center" bgcolor="cyan">
      <tr>
      <td>Employee Name::</td>
      <td><frm:input path="ename"/><frm:errors path="ename"><span id="enameErr"></span></frm:errors></td>
      </tr>
      
      <tr>
      <td>Employee job::</td>
      <td><frm:input path="job"/><frm:errors path="job"><span id="jobErr"></span></frm:errors></td>
      </tr>
      
      <tr>
      <td>Employee salary::</td>
      <td><frm:input path="sal"/><frm:errors path="sal"><span id="salErr"></span></frm:errors></td>
      </tr>
      
      <tr>
      <td>deptno::</td>
      <td><frm:input path="deptno"/>
          <frm:errors path="deptno">
          <span id="deptnoErr"></span></frm:errors></td>
      </tr>
      
      <tr>
      <td><input type="submit" value="submit"></td>
      <td><input type="reset" value="cancel"></td>
      </tr>
      
      </table>
      </frm:form>
     
      
