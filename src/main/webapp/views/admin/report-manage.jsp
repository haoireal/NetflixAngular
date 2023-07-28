<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<%@ include file="/common/head.jsp"%>
<!-- Link Jquery -->
<script src="https://code.jquery.com/jquery-latest.js"></script>
<!-- Link Bootstrap -->


<!-- Link icons -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
<!--  JSTL -->
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<link rel="stylesheet"
	href="<c:url value ='/templates/user/css/headerandfooter.css'/>">
<link rel="stylesheet"
	href="<c:url value ='/templates/admin/css/responsive.css'/>">
<!-- My css -->
<link rel="stylesheet"
	href="/PhamGiaHaoASM/templates/admin/myCss/manage.css" />
</head>
<body>
	<div id="main" class="bg-dark">
		<!-- Header -->
		<%@ include file="/common/admin/header.jsp"%>
		<!-- End Header -->
		<section class="bg-dark">
			<div class="container mt-5">
				<div class="tabs">
					<div class="tab">
						<input type="radio" name="css-tabs" id="tab-1" checked
							class="tab-switch" /> <label for="tab-1" class="tab-label">Favorites</label>
						<div class="tab-content w-100">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Video ID</th>
										<th>Video Title</th>
										<th>Video Href</th>
										<th>Total Like</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${videos}" var="video">
										<tr>
											<td>${video.videoID}</td>
											<td>${video.title}</td>
											<td><a
												href="https://www.youtube.com/embed/${video.href}">${video.href}</a></td>
											<td>${video.totalLike}</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
					<div class="tab">
						<input type="radio" name="css-tabs" id="tab-2" class="tab-switch" />
						<label for="tab-2" class="tab-label">Favorite User</label>
						<div class="tab-content w-100">
							<div class="box mb-3">
								<div class="form-group col-md-4 w-100">
									<label for="inputState">State</label> <select id="inputState"
										class="form-control">
										<option selected>Choose...</option>
										<option>...</option>
									</select>
								</div>
							</div>
							<table class="table table-hover">
								<thead>
									<tr>
										<th>ID (Username)</th>
										<th>Password</th>
										<th>Fullname</th>
										<th>Email</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${videos}" var="video">
										<tr>
											<td>${video.videoID}</td>
											<td>${video.title}</td>
											<td>${video.href}</td>
											<td>${video.totalLike}</td>
										</tr>
									</c:forEach>


								</tbody>
							</table>
						</div>
					</div>
					<div class="tab">
						<input type="radio" name="css-tabs" id="tab-3" class="tab-switch" />
						<label for="tab-3" class="tab-label">Shared Friends</label>
						<div class="tab-content w-100">
							<div class="box mb-3">
								<div class="container-4">
									<input type="search" id="search-shared" class="search-custom"
										placeholder="Search Video Title..." />
									<button class="icon">
										<i class="fa fa-search"></i>
									</button>
								</div>
							</div>
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Sender Name</th>
										<th>Sender Email</th>
										<th>Receive Email</th>
										<th>Date</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="share" items="${sharedVD}">
										<tr>
											<td>${share.group}</td>
											<td>${share.emailSender}</td>
											<td>${share.emailReceive}</td>
											<td><fmt:formatDate value="${share.dataShare}"
													pattern="dd/MM/yyyy" /></td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</section>

		<!-- JS -->
		<%@ include file="/common/admin/footer.jsp"%>
	</div>
	<script>
		// Add the following code if you want the name of the file appear on select
		$(".custom-file-input").on(
				"change",
				function() {
					var fileName = $(this).val().split("\\").pop();
					$(this).siblings(".custom-file-label").addClass("selected")
							.html(fileName);
				});
	</script>
</body>
</html>
