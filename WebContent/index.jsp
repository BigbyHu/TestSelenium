<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
	hi~testSelenium!2 first<br>
	first<input type="text" name="first" id="first" /> <br>
	last<input type="text" name="last" id="last" /> <br>
	all<input type="text" name="all" id="all" /><br>
	<input type="button" id="button" onclick="test()" />
	<input type="button" id="button2" onclick="test2()" />
</body>
</html>

<script type="text/javascript">
	function test() {
		var name = document.getElementById("first").value;
		var password = document.getElementById("last").value;
		var all = name + password;
		document.getElementById("all").value = all;
	}
	function test2() {
		var name1 = document.getElementById("all").value;
		alert(name1);
	}
</script>