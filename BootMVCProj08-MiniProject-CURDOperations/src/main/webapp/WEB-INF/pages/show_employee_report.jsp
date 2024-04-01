<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<c:choose>
  <c:when test="${!empty empList}">
   <h1 style="color:red;text-align:center">Employee Report</h1>
    <table border="1" align="center" bgcolor="cyan">
      <tr style="color:red"><th>empno</th><th>emp name</th><th>job</th><th>salary</th><th>deptno</th><th>Operations</th></tr>
      <c:forEach var="emp" items="${empList}">
        <tr style="color:blue">
       <td>${emp.empno}</td>
       <td>${emp.ename}</td>
       <td>${emp.job}</td>
       <td>${emp.sal}</td>
       <td>${emp.deptno}</td>
        <td><a href="edit?no=${emp.empno}"><img src="images/edit.png" width="30px" height="30px"></a>
            <a href="delete?no=${emp.empno}" onclick="return confirm('Do u Want to delete the Employee')"><img src="images/delete.png" width="30px" height="30px"></a></td>
       </tr>
    </c:forEach>
    </table>
  </c:when>
     <c:otherwise>
       <h1 style="color:red;text-align:center">Employee Not Found</h1>
     </c:otherwise>
</c:choose>
 
    <h2 style="color:green;text-align:center">${resultMsg}

 <center>
    <a href="add"><img src="images/add.png" width="40px" height="50px">Add Employee</a>&nbsp;&nbsp;&nbsp;
    <a href="./"><img src="images/home.png" width="40px" height="50px">Home</a>
    
  </center>
