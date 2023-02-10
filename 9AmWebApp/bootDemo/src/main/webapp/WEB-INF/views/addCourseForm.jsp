<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add Course Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<style type="text/css">
.courseForm {
	width: 600px;
	margin: auto;
}
</style>
</head>
<body>
	<div class="container">
		<h1 class="display-1 text-center bg-warning text-white">Course
			Form</h1>
		<form class="courseForm" action="addCourse" method="post">
			<div class="mb-3">
				<label class="form-label">Course Name:</label> <input type="text"
					class="form-control" name="courseName">
			</div>
			<div class="mb-3">
				<label class="form-label">Course Description:</label> <input
					type="text" class="form-control" name="courseName">
			</div>
			<div class="mb-3">
				<label class="form-label">Course Price:</label> <input type="text"
					class="form-control" name="price">
			</div>
			<div class="mb-3">
				<label class="form-label">Course Duration:</label> <input
					type="text" class="form-control" name="duration"
					placeholder="in hours">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>
</body>
</html>