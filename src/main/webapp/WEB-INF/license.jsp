<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>New License</h2>
	<form:form method="POST" action="/license" modelAttribute="newLicense">
	<form:hidden path="id"/>
	
	<form:select path="person">Person:
		<form:errors path="person"/>
		<form:options items="${ people }" itemLabel="firstName"/>
	</form:select><br>
		
     <form:label path="state">State:
     	<form:errors path="state"/>
     	<form:input path="state"/>
     </form:label><br>
     
     <form:label path="expirationDate">Expiration Date:
     	<form:errors path="expirationDate"/>
     	<form:input path="expirationDate" type="date"/>
     </form:label><br> 
     
      <input type="submit" value="Create License">
    </form:form> 
</body>
</html>