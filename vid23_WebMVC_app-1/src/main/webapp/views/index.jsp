<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Insert title here</title>
</head>
<body>


<h2>Student Enquiry Form</h2>

<form:form action="save" modelAttribute="student" method="POST">

<table>
<tr>
<td>Name:</td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td>Email:</td>
<td><form:input path="email"/></td>
</tr>

<tr>
				<td>Gender:</td>
				<td><form:radiobutton path="gender" value="M" />Male 
					<form:radiobutton path="gender" value="F" />Fe-Male
			</td>
			</tr>


<tr>
<td>Course</td>
<td>
<form:select path="course">
<form:option value="">-Select-</form:option>
<form:option value="java">-Java-</form:option>
<form:option value="python">-Python-</form:option>
<form:option value="c++">-C++-</form:option>
</form:select>
</td>
</tr>

<tr>
<td>Timings</td>
<td>
<form:checkboxes items="${prefTimings}" path="timings"/>
</td>
</tr>

<tr>
<td>Email:</td>
<td><input type="submit" value="Save"/></td>
</tr>

</table>
</form:form>

</body>
</html>
