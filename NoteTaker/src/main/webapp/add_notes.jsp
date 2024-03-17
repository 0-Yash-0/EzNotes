-<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h1 class="addnotes1">Start your own EzNotes;)</h1>
		<br>
		<form action="SaveNoteServlet" method="post">
			<div class="addnotes1">
				<label for="title">Title</label> <input name="title" required
					type="text" class="form-control" id="title"
					aria-describedby="emailHelp" placeholder="Enter here"
					style="width: 1364.6px; height: 38.6px;" />
			</div>
			<div class="addnotes1">
				<label for="content">Notes</label>
				<textarea name="content" required id="content"
					placeholder="Enter your content here" class="form-control"
					style="height: 309px; width: 1364.6px;"></textarea>
			</div>
			<div class="addnotes1 text-center" style="width: 1400px;">
				<button type="submit" class="btn btn-primary">Add</button>
			</div>

		</form>
	</div>
</body>
</html>