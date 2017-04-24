<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Investor Details</title>
</head>
<body>
<form:form action="investorregistration.htm" commandName="investor"
		method="post">

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
		    <td>First Name* :</td>
		    <td><form:input type="text" path="investorFirstName" size="30" required="required" />
		    <font color="red"><form:errors path="investorFirstName" /></font></td>
		</tr>
		
		<tr>
		    <td>Last Name* :</td>
		    <td><form:input type="text" path="investorLastName" size="30" required="required"/>
		    <font color="red"><form:errors path="investorLastName" /></font></td>
		</tr>
		<tr>
		    <td>Street:</td>
		    <td><form:input type="text" path="investorStreet" size="30" />
		    <font color="red"><form:errors path="investorStreet" /></font></td>
		</tr>
		<tr>
		    <td>City:</td>
		    <td><form:input type="text" path="investorCity" size="30" />
		    <font color="red"><form:errors path="investorCity" /></font></td>
		</tr>
		<tr>
		    <td>State/Province:</td>
		    <td><form:input type="text" path="investorState" size="30"/>
		    <font color="red"><form:errors path="investorState" /></font></td>
		</tr>
		<tr>
		 <td>Country:</td>
		    <td><form:input type="text" path="investorCountry" size="30"/>
		    <font color="red"><form:errors path="investorCountry" /></font></td>  
		</tr>
		<tr>
		 <td>Zip Code:</td>
		    <td><form:input type="text" path="zip" size="30"/>
		    <font color="red"><form:errors path="zip" /></font></td>  
		
</tr>
		<tr>
		 <td></td>
		    <td><input type="hidden" name="type" value="investor"/>
		    </td>  
		</tr>
		<tr>
		 <td></td>
		    <td><input type="hidden" name="status" value="active"/>
		    </td>  
		</tr>
		
		<tr>
		    <td colspan="2"><input type="submit" value="Submit" /></td>
		</tr>
				
		</table>

</form:form>

</body>
</html>