<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Startup Details</title>
</head>
<body>

<form:form action="startupregistration.htm" method="post" name="startupregistration" modelAttribute="startup" commandName="startup">
<table>
		<tr>
		    <td>User Name* :</td>
		    <td><form:input type="text" path="userName" size="30" required="required" />
		    <font color="red"><form:errors path="userName" /></font></td>
		</tr>
		
		<tr>
		    <td>Email* :</td>
		    <td><form:input type="email" path="email" size="30" required="required"/>
		    <font color="red"><form:errors path="email" /></font></td>
		</tr>
		<tr>
		    <td>Contact Number* :</td>
		    <td><form:input type="Number" path="contactNumber" size="30" required="required"/>
		    <font color="red"><form:errors path="contactNumber" /></font></td>
		</tr>
		<tr>
		    <td>Password* :</td>
		    <td><form:input type="password" path="password" size="30" required="required"/>
		    <font color="red"><form:errors path="password" /></font></td>
		</tr>
<!-- 		<tr> -->
<!-- 		    <td>Confirm Password* :</td> -->
<!-- 		    <td><input type="password" name="confirmPassword" size="30" required="required"/> -->
<!-- 		    </td> -->
<!-- 		</tr> -->
		
		<tr>
		    <td>Startup Name* :</td>
		    <td><form:input type="text" path="startupName" size="30" required="required" />
		    <font color="red"><form:errors path="startupName" /></font></td>
		</tr>
		
		<tr>
		    <td>Description* :</td>
		    <td><form:input type="text" path="startupDescription" size="30" required="required"/>
		    <font color="red"><form:errors path="startupDescription" /></font></td>
		</tr>
		<tr>
		    <td>License Number* :</td>
		    <td><form:input type="text" path="startupLicenseNumber" size="30" required="required"/>
		    <font color="red"><form:errors path="startupLicenseNumber" /></font></td>
		</tr>
		<tr>
		    <td>Equity* :</td>
		    <td><form:input type="text" path="startupEquity" size="30" required="required"/>
		    <font color="red"><form:errors path="startupEquity" /></font></td>
		</tr>
		<tr>
		    <td>First Name* :</td>
		    <td><form:input type="text" path="startupFirstName" size="30" required="required" />
		    <font color="red"><form:errors path="startupFirstName" /></font></td>
		</tr>
		
		<tr>
		    <td>Last Name* :</td>
		    <td><form:input type="text" path="startupLastName" size="30" required="required"/>
		    <font color="red"><form:errors path="startupLastName" /></font></td>
		</tr>
		<tr>
		    <td>Street:</td>
		    <td><form:input type="text" path="startupStreet" size="30" />
		    <font color="red"><form:errors path="startupStreet" /></font></td>
		</tr>
		<tr>
		    <td>City:</td>
		    <td><form:input type="text" path="startupCity" size="30" />
		    <font color="red"><form:errors path="startupCity" /></font></td>
		</tr>
		<tr>
		    <td>State/Province:</td>
		    <td><form:input type="text" path="startupState" size="30"/>
		    <font color="red"><form:errors path="startupState" /></font></td>
		</tr>
		<tr>
		 <td>Country:</td>
		    <td><form:input type="text" path="startupCountry" size="30"/>
		    <font color="red"><form:errors path="startupCountry" /></font></td>  
		</tr>
		<tr>
		 <td>Zip Code:</td>
		    <td><form:input type="text" path="zip" size="30"/>
		    <font color="red"><form:errors path="zip" /></font></td>  
		
</tr>
		<tr>
		 <td></td>
		    <td><input type="hidden" name="type" value="startup"/>
		    </td>  
		</tr>
		<tr>
		 <td></td>
		    <td><input type="hidden" name="status" value="pending"/>
		    </td>  
		</tr>
		
		<tr>
		    <td colspan="2"><input type="submit" value="Submit" /></td>
		</tr>
				
		</table>

</form:form>


</body>
</html>