<%@ page pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tagss for new branch -->
<meta charset="utf-8">
<%@ include file="/common/head.jsp"%>
<link rel="stylesheet"
	href="<c:url value ='/templates/user/css/landing.css'/>">
<link rel="stylesheet"
	href="<c:url value ='/templates/user/css/responsive.css'/>">
<link rel="stylesheet"
	href="<c:url value ='/templates/user/css/headerandfooter.css'/>">

</head>

<body>
	
	<div style="position: relative;">
		<%@ include file="/common/header.jsp"%>


		<!-- video -->
		<div class="">
			<section class="netflix-home-video">
				<div class="top"></div>
				<div class="bottom"></div>
				<video src="<c:url value ='/templates/user/video/video.mp4'/>"
					autoplay muted loop></video>
				<div class="content">
					<section class="left">
						<img src="<c:url value ='/templates/user/img/image2.webp'/>"
							alt="">

						<div class="d-flex mt-2">
							<div class="hover-buttons mr-3">
								<a href="https://www.youtube.com/embed/TcMBFSGVi1c"
									class="btn btn-hover iq-button d-flex align-items-center justify-content-between">
									<i class="fa fa-play mr-2 pr-0"></i>
									<p class="m-0">Play Now</p>
								</a>
							</div>

							<div class="hover-buttons-info">
								<span
									class="btn btn-hover iq-button d-flex align-items-center justify-content-between bg-secondary">
									<i class="fa fa-info-circle mr-2 pr-0 pl-2"></i>
									<p class="m-0">More Info</p>
								</span>
							</div>
						</div>
					</section>

				</div>
			</section>

		</div>
		<%-- 		<c:choose> --%>
		<%-- 					<c:when test="${flagFavoriteBtn == true}"> --%>
		<!-- 					<i class="fas fa-heart-broken"></i> Unfavorite -->
		<%-- 				</c:when> --%>
		<%-- 					<c:otherwise> --%>
		<!-- 					<i class="fas fa-heart"></i> Favorite -->
		<%-- 				</c:otherwise> --%>
		<%-- 				</c:choose> --%>
		<c:if test="${not empty fvrVideos}">
			<!-- FAVORITE -->
			<div class="container">
				<section class="d-flex justify-content-center mb-4 mt-5">
					<h4 class="text-white mt-5">
						<b>VIDEO YÊU THÍCH</b>
					</h4>
				</section>
				<div
					class="row d-flex justify-content-center justify-content-between">
					<c:forEach items="${fvrVideos}" var="video">
						<div class="card m-0 mb-5" style="">
							<a
								href="<c:url value ='/netflix/detail-video?action=detail&id=${video.href}'/>">
								<div id="thumnail">
									<img
										src="<c:url value ='/templates/user/img/trending/${video.poster}'/>"
										class="card-img-top img-fluid" alt="...">
									<div class="title-thumnail pl-2">
										<b>${video.title}</b>
									</div>
								</div>
							</a>
							<div class="card-body p-2 pb-3">
								<section class="d-flex justify-content-between">
									<div>
										<a href=""><i class="bi bi-play-circle-fill card-icon"></i></a>
										<a href=""><i class="bi bi-heart card-icon"></i></a>
									</div>
									<div>
										<a href=""> <i class="bi bi-share card-icon"></i></a>
									</div>
								</section>
								<section
									class="d-flex align-items-center justify-content-between">
									<div class="d-flex align-items-center justify-content-between">
										<p class="netflix-card-text m-0"
											style="color: rgb(0, 186, 0);">${video.views}</p>
										<i class="bi bi-eye p-0 pl-1" style="color: rgb(0, 186, 0);"></i>
									</div>
									<span class="m-2 netflix-card-text text-white">Limited
										Series</span> <span class="border netflix-card-text p-1 text-white">HD</span>

								</section>
								<span class="netflix-card-text text-white">Provocative •
									Psychological • Thriller</span>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
			<!-- END FAVORTIE -->

		</c:if>

		<!-- Video Entity -->
		<div class="container">
			<section class="d-flex justify-content-center mb-4 mt-5">
				<h4 class="text-white">
					<b>MỚI CẬP NHẬT</b>
				</h4>
			</section>
			<div
				class="row d-flex justify-content-center justify-content-between">
				<c:forEach items="${videos}" var="video">
					<div class="card m-0 mb-5" style="">
						<a
							href="<c:url value ='/netflix/detail-video?action=detail&id=${video.href}'/>">
							<div id="thumnail">
								<img
									src="<c:url value ='/templates/user/img/trending/${video.poster}'/>"
									class="card-img-top img-fluid" alt="...">
								<div class="title-thumnail pl-2">
									<b>${video.title}</b>
								</div>
							</div>
						</a>
						<div class="card-body p-2 pb-3">
							<section class="d-flex justify-content-between">
								<div>
									<a href=""><i class="bi bi-play-circle-fill card-icon"></i></a>
									<a href=""><i class="bi bi-heart card-icon"></i></a>
								</div>
								<div>
									<a href=""> <i class="bi bi-share card-icon"></i></a>
								</div>
							</section>
							<section
								class="d-flex align-items-center justify-content-between">
								<div class="d-flex align-items-center justify-content-between">
									<p class="netflix-card-text m-0" style="color: rgb(0, 186, 0);">${video.views}</p>
									<i class="bi bi-eye p-0 pl-1" style="color: rgb(0, 186, 0);"></i>
								</div>
								<span class="m-2 netflix-card-text text-white">Limited
									Series</span> <span class="border netflix-card-text p-1 text-white">HD</span>

							</section>
							<span class="netflix-card-text text-white">Provocative •
								Psychological • Thriller</span>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>


		<%@ include file="/common/footer.jsp"%>
	</div>
</body>

</html>