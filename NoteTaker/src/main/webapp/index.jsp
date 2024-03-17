<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<title>Note Taker : Home page</title>
<%@include file="all_js_css.jsp"%>

</head>
<body>

	<div class="container">
		<%@include file="navbar.jsp"%>
		<br> <br>



		<div class="card  shadow bg-white py-5"
			style="padding-bottom: 0px; padding-top: 0px; width: 1521.6px; height: 550.6px; bottom: 50px; border-bottom-width: 0px;">
			<img alt="" class="img-fluid mx-auto"
				style="max-width: 400px; background: transparent;" src="img2.png">
			<h1 class="StartNotes">Start Taking your notes</h1>

			<div class="container text-center" style="margin-left: 200px;">
				<a href="add_notes.jsp" class="btn btn-outline-primary text-center">Start Here!!</a>
			</div>

		</div>

	</div>

	<div class="container-fluid back-img"></div>
	<%@include file="footer.jsp"%>


</body>
</html>



