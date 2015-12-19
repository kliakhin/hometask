<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../../css/style.css" />
<title>Add new Merchant</title>
</head>
<body>
	<h1>New Merchant</h1>
	<form action="jsp/newMerchant.jsp" method="POST">
		<table>
			<tr>
				<td>Name:
				<td><input type="text" name="name" />
			<tr>
				<td>Bank:
				<td><input type="text" name="bank" />
			<tr>
				<td>Swift code:
				<td><input type="text" name="swift" />
			<tr>
				<td>Account:
				<td><input type="text" name="account" />
			<tr>
				<td>Charge:
				<td><input type="text" name="charge" />
			<tr>
				<td>Period:
				<td><select name="period">
						<option value="1">Weekly</option>
						<option value="2">Once a ten day</option>
						<option value="3">Monthly</option>
				</select>
			<tr>
				<td>Min sum:
				<td><input type="text" name="sum" />
		</table>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>