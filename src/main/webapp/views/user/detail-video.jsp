<%@ page pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<%@ include file="/common/head.jsp"%>


<link rel="stylesheet"
	href="<c:url value ='/templates/user/css-detail-video/slick.css'/>">
<link rel="stylesheet"
	href="<c:url value ='/templates/user/css-detail-video/animate.min.css'/>">

<link rel="stylesheet"
	href="<c:url value ='/templates/user/css-detail-video/comment.css'/>">
<link rel="stylesheet"
	href="<c:url value ='/templates/user/css-detail-video/style.css'/>">
<link rel="stylesheet"
	href="<c:url value ='/templates/user/css/headerandfooter.css'/>">

</head>

<body>

	<%@ include file="/common/header.jsp"%>
	<!-- slider starts  -->
	<section id="home" class="iq-main-slider p-0 mb-5">
		<div id="home-slider" class="slider m-0 p-0">
			<div class="slide slick-bg s-bg-1"
				style="background-image: url(<c:url value ='/templates/user/img/slider/${video.poster}'/>);">
				<div class="container-fluid position-relative h-100">
					<div class="slider-inner h-100">
						<div class="row align-items-center h--100">
							<div class="col-xl-6 col-lg-12 col-md-12">
								<div class="channel-logo fadeInLeft animated"
									data-animation-in="fadeInLeft" data-delay-in="0.5">
									<img src="<c:url value ='/templates/user/img/logo.png'/>"
										class="c-logo" alt="" />
								</div>
								<p
									class="slider-text title-main title text-uppercase fadeInLeft animated display-4"
									data-animation-in="fadeInLeft" data-delay-in="0.6"
									id="main-title">${video.title}</p>
								<div
									class="d-flex flex-wrap align-items-center fadeInLeft animated"
									data-animation-in="fadeInLeft" style="opacity: 1">
									<div
										class="slider-ratting d-flex align-items-center mr-4 mt-2 mt-md-3">
										<span class="text-white ml-2">${video.views}<i
											class="bi bi-eye p-0 pl-1" style="color: rgb(0, 186, 0);"></i></span>
									</div>
									<div class="d-flex align-items-center mt-2 mt-md-3">
										<span class="badge badge-secondary p-2">16+</span> <span
											class="ml-3">2h 22min</span>
									</div>
								</div>
								<p data-animation-in="fadeInDown" class="fadeInDown animated">${video.description}</p>

								<div class="trending-list fadeInUp animated"
									data-animation-in="fadeInUp" data-delay-in="1.2">
									<div class="text-primary title starring">
										Starring : <span class="text-body">Robert Downey Jr.,
											Chris Evans, Mark Ruffalo</span>
									</div>
									<div class="text-primary title genres">
										Genres : <span class="text-body">Action</span>
									</div>
									<div class="text-primary title tag">
										Tags : <span class="text-body">Action, Adventure,
											Horror</span>
									</div>
								</div>

							</div>
						</div>

						<div class="col-xl-5 col-lg-12 col-md-12 trailor-video ">
							<a href="#movie"
								class="btn btn-hover iq-button fadeInUp animated"><i
								class="fa fa-play mr-3"></i>Play Now</a> <a href="#"
								class="btn btn-link fadeInUp animated">More Details</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- slider ends -->
	<section class="d-flex justify-content-center mt-5" id="movie">
		<h5 class="text-white mt-5 pt-2">
			<b class="">${video.title}</b>
		</h5>
	</section>
	<div class="container">
		<iframe src="https://www.youtube.com/embed/${video.href}" height="530"
			title="YouTube video player" frameborder="0" class="w-100"
			allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
			allowfullscreen></iframe>
	</div>
	<div id="media-bar" class="w-100 d-flex justify-content-center">
		<div>
			<button class="btn btn-hover" id="favoriteOrUnfavorite"
				style="background-color: #ffac44;">
				<c:choose>
					<c:when test="${flagFavoriteBtn == true}">
					<i class="fas fa-heart-broken"></i> Unfavorite
				</c:when>
					<c:otherwise>
					<i class="fas fa-heart"></i> Favorite
				</c:otherwise>
				</c:choose>
			</button>
		</div>
		<div class="ml-5">
			<a class="btn btn-hover" style="background-color: #dd4b39;" href="#!"
				role="button"><i class="fab fa-google me-2"></i> Gmail</a>
		</div>

	</div>
	<section class="d-flex justify-content-center mb-2 mt-5">
		<h4 class="text-white">
			<b>ĐÁNH GIÁ PHIM</b>
		</h4>
	</section>
	<!-- Comment BOX -->
	<div id="comment" class="container mt-0">
		<div class="d-flex justify-content-center row">
			<div class="col-md-8 w-100">
				<div class="d-flex flex-column comment-section w-100">
					<div class="bg-dark p-2">
						<div class="d-flex flex-row user-info">
							<img class="rounded-circle" src="https://i.imgur.com/RpzrMR2.jpg"
								width="40">
							<div class="d-flex flex-column justify-content-start ml-2">
								<span class="d-block font-weight-bold name">Marry Andrews</span><span
									class="date text-w-50">Shared publicly - Jan 2020</span>
							</div>
						</div>
						<div class="mt-2">
							<p class="comment-text">Lorem ipsum dolor sit amet,
								consectetur adipiscing elit, sed do eiusmod tempor incididunt ut
								labore et dolore magna aliqua. Ut enim ad minim veniam, quis
								nostrud exercitation ullamco laboris nisi ut aliquip ex ea
								commodo consequat.</p>
						</div>
					</div>
					<div class="bg-dark">
						<div class="d-flex flex-row fs-12">
							<div class="like p-2 cursor">
								<i class="fa fa-thumbs-o-up"></i><span class="ml-1">Like</span>
							</div>
							<div class="like p-2 cursor">
								<i class="fa fa-commenting-o"></i><span class="ml-1">Comment</span>
							</div>
							<div class="like p-2 cursor">
								<i class="fa fa-share"></i><span class="ml-1">Share</span>
							</div>
						</div>
					</div>
					<div class="bg-dark p-2">
						<div class="d-flex flex-row align-items-start">
							<img class="rounded-circle" src="https://i.imgur.com/RpzrMR2.jpg"
								width="40">
							<textarea class="form-control ml-1 shadow-none textarea"></textarea>
						</div>
						<div class="mt-2 text-right">
							<button class="btn btn-outline-dark btn-sm shadow-none"
								type="button">
								<b>Post comment</b>
							</button>
							<button class="btn btn-outline-dark btn-sm ml-1 shadow-none"
								type="button">
								<b>Cancel</b>
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<input type="hidden" id="video-href" value="${video.href}">

	<!-- js files  -->
	<%@ include file="/common/footer.jsp"%>
	<script>
	$('#favoriteOrUnfavorite').click(function(){
	    var videoId = $('#video-href').val();
	    var isFavorite = false; // Khởi tạo biến địa phương để lưu trữ trạng thái yêu thích
	    $.ajax({
	        url: "/PhamGiaHaoASM/netflix/detail-video?action=like&id=" + videoId
	    }).then(function(data) {
	        var text = $('#favoriteOrUnfavorite').text();
	        if(text.indexOf('Favorite') != -1){
	        	 $('#favoriteOrUnfavorite').html('<i class="fas fa-heart-broken"></i> Unfavorite');
	           
	            isFavorite = true; // Nếu chưa được yêu thích thì chuyển sang đã yêu thích
	        }else{
	        	$('#favoriteOrUnfavorite').html('<i class="fas fa-heart"></i> Favorite');
	           
	            isFavorite = false; // Nếu đã được yêu thích thì chuyển sang chưa yêu thích
	        }
	    }).fail(function(error) {
	        alert('Sai roi ne');
	    });
	});
	</script>

	<script
		src="<c:url value ='/templates/user/js-detail-video/slick.min.js'/>"></script>
	<script
		src="<c:url value ='/templates/user/js-detail-video/slick-animation.min.js'/>"></script>
	<script src="<c:url value ='/templates/user/js-detail-video/main.js'/>"></script>
</body>

</html>