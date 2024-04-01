<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <h1 style="color:red;text-align:center">Student Registration page</h1>
    
    <form action="register" method="POST">
      <table align="cenetr" bgcolor="cyan">
        <tr>
          <td>student number</td>
          <td><input type="text" name="sno"></td>
          </tr>
        <tr>
          <td>student name</td>
          <td><input type="text" name="sname"></td>
          </tr>
          <tr>
          <td>student addrs</td>
          <td><input type="text" name="sadd"></td>
          </tr>
          <tr>
          <td>student avg</td>
          <td><input type="text" name="avg"></td>
          </tr>
          <tr>
         
          <td><input type="Submit" value="register"></td>
          </tr>
          
          
      </table>
    </form>