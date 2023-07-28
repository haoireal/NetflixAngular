<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Netflix Việt Nam – Xem chương trình truyền hình trực
	tuyến, Xem phim trực tuyến</title>
<link rel="shortcut icon"
	href="https://assets.nflxext.com/us/ffe/siteui/common/icons/nficon2016.ico">
<link rel="canonical"
	href="https://getbootstrap.com/docs/4.5/examples/floating-labels/">
<link href="../assets/dist/css/bootstrap.css" rel="stylesheet">
<link href="floating-labels.css" rel="stylesheet">

<!-- BootStrap4 Import -->
<!-- JQWERY -->
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
<!-- Angular -->
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
<!-- CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
	crossorigin="anonymous"></script>
<!-- ICON -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous">

<link href="/PhamGiaHaoASM/views/css/style.css" rel="stylesheet" />
</head>



<body>
	<main class="container-fluid">
		<!---->

		<section id="backGround">
			<div class="container-fluid relative">
				<header>
					<img src="/PhamGiaHaoASM/views/img/logo-Netflix.png" alt="Responsive image LOGO"
						class="img-fluid" />
					<a href="/PhamGiaHaoASM/netflix/login" type="button" class="btn btn-danger">Đăng nhập</a>
				</header>
			</div>
			<div class="jumbotron jumbotron-fluid relative mt-5">
				<p class="font-weight-bold display-4">Chương trình truyền hình,
					phim không giới hạn và nhiều nội dung khác.</p>
				<p class="lead font-weight-bold">Xem ở mọi nơi. Hủy bất kỳ lúc
					nào.</p>
				<form method="POST" action="/PhamGiaHaoASM/netflix/indexwtlogin"
					class="form-signin needs-validation" novalidate>
					<div class="row no-gutters justify-content-center">
						<div class="col-12 first font-weight-bold">
							<p>Bạn đã sẵn sàng xem chưa? Nhập email để tạo hoặc kích hoạt
								lại tư cách thành viên của bạn.</p>
						</div>
						<div class="col-12 col-lg-9 second form-label-group my-4">
							<input type="email" id="inputEmail" class="form-control"
								placeholder="Địa chỉ email" name="email"
								pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" maxlength="50"
								minlength="5" required>
							<div class="valid-feedback">Tốt! bạn đã thành công</div>
							<div class="invalid-feedback">Bạn cần nhập email!</div>
							<label for="inputEmail">Địa chỉ email</label>
						</div>
						<div class="col-12 col-lg-3 third my-4">
							<button class="suscribe" type="submit">
								Bắt đầu<i class="arrow right"></i>
							</button>
						</div>
					</div>
				</form>
			</div>
		</section>
		<!--------------03 equal section-->
		<section>
			<div class="container my-5">
				<div class="row">
					<div class="col-12 col-lg-6 text-lg-left">
						<h2>Thưởng thức trên TV của bạn.</h2>
						<p>Xem trên TV thông minh, Playstation, Xbox, Chromecast,
							Apple TV, đầu phát Blu-ray và nhiều thiết bị khác.</p>
					</div>
					<div class="col-12 col-lg-6">
						<img src="/PhamGiaHaoASM/views/img/television.png" alt="Responsive image television"
							class="img-fluid" />
					</div>
				</div>
			</div>
		</section>
		<!---->
		<section>
			<div class="container revers my-5">
				<div class="row">
					<div
						class="col-12 col-lg-6 ml-6 order-first order-lg-last text-lg-left">
						<h2>Tải xuống nội dung để xem ngoại tuyến.</h2>
						<p>Lưu lại những nội dung yêu thích một cách dễ dàng và luôn
							có thứ để xem.</p>
					</div>
					<div class="col-12 col-lg-6">
						<img src="/PhamGiaHaoASM/views/img/mobile.png" alt="Responsive image mobile"
							class="img-fluid" />
					</div>
				</div>
			</div>
		</section>
		<!---->
		<section>
			<div class="container my-5">
				<div class="row">
					<div class="col-12 col-lg-6 text-lg-left">
						<h2>Xem ở mọi nơi.</h2>
						<p>Phát trực tuyến không giới hạn phim và chương trình truyền
							hình trên điện thoại, máy tính bảng, máy tính xách tay và TV.</p>
					</div>
					<div class="col-12 col-lg-6">
						<img src="/PhamGiaHaoASM/views/img/devices.png" alt="Responsive image device"
							class="img-fluid" />
					</div>
				</div>
			</div>
		</section>
		<!----------------------accordion-->
		<section>
			<div class="container">
				<h3>Câu hỏi thường gặp</h3>
				<div id="accordion" class="mb-5">
					<div class="card">
						<div class="card-header" id="headingOne">
							<button class="btn btn-link" data-toggle="collapse"
								data-target="#collapseOne" aria-expanded="false"
								aria-controls="collapseOne">
								Netflix là gì?
								<svg viewBox="0 0 26 26" class="svg-icon svg-closed rotated"
									focusable="true">
                  <path
										d="M10.5 9.3L1.8 0.5 0.5 1.8 9.3 10.5 0.5 19.3 1.8 20.5 10.5 11.8 19.3 20.5 20.5 19.3 11.8 10.5 20.5 1.8 19.3 0.5 10.5 9.3Z">
                  </path>
                </svg>
							</button>
						</div>
						<div id="collapseOne" class="collapse show"
							aria-labelledby="headingOne" data-parent="#accordion">
							<div class="card-body">Netflix là dịch vụ phát trực tuyến
								mang đến đa dạng các loại chương trình truyền hình, phim, anime,
								phim tài liệu đoạt giải thưởng và nhiều nội dung khác trên hàng
								nghìn thiết bị có kết nối Internet.</div>
							<div class="card-body">Bạn có thể xem bao nhiêu tùy thích,
								bất cứ lúc nào bạn muốn mà không gặp phải một quảng cáo nào –
								tất cả chỉ với một mức giá thấp hàng tháng. Luôn có những nội
								dung mới để bạn khám phá và những chương trình truyền hình, phim
								mới được bổ sung mỗi tuần!</div>
						</div>
					</div>
					<div class="card">
						<div class="card-header" id="headingTwo">
							<button class="btn btn-link" data-toggle="collapse"
								data-target="#collapseTwo" aria-expanded="false"
								aria-controls="collapseTwo">
								Tôi phải trả bao nhiêu tiền để xem Netflix?
								<svg viewBox="0 0 26 26" class="svg-icon svg-closed rotated"
									focusable="true">
                  <path
										d="M10.5 9.3L1.8 0.5 0.5 1.8 9.3 10.5 0.5 19.3 1.8 20.5 10.5 11.8 19.3 20.5 20.5 19.3 11.8 10.5 20.5 1.8 19.3 0.5 10.5 9.3Z">
                  </path>
                </svg>
							</button>
						</div>
						<div id="collapseTwo" class="collapse show"
							aria-labelledby="headingTwo" data-parent="#accordion">
							<div class="card-body">Xem Netflix trên điện thoại thông
								minh, máy tính bảng, TV thông minh, máy tính xách tay hoặc thiết
								bị phát trực tuyến, chỉ với một khoản phí cố định hàng tháng.
								Các gói dịch vụ với mức giá từ 70.000 ₫ đến 260.000 ₫ mỗi tháng.
								Không phụ phí, không hợp đồng.</div>
						</div>
					</div>

					<div class="card">
						<div class="card-header" id="headingThree">
							<button class="btn btn-link" data-toggle="collapse"
								data-target="#collapseThree" aria-expanded="false"
								aria-controls="collapseThree">
								Tôi có thể xem ở đâu?
								<svg viewBox="0 0 26 26" class="svg-icon svg-closed rotated"
									focusable="true">
                  <path
										d="M10.5 9.3L1.8 0.5 0.5 1.8 9.3 10.5 0.5 19.3 1.8 20.5 10.5 11.8 19.3 20.5 20.5 19.3 11.8 10.5 20.5 1.8 19.3 0.5 10.5 9.3Z">
                  </path>
                </svg>
							</button>
						</div>
						<div id="collapseThree" class="collapse show"
							aria-labelledby="headingThree" data-parent="#accordion">
							<div class="card-body">Xem mọi lúc, mọi nơi. Đăng nhập bằng
								tài khoản Netflix của bạn để xem ngay trên trang web netflix.com
								từ máy tính cá nhân, hoặc trên bất kỳ thiết bị nào có kết nối
								Internet và có cài đặt ứng dụng Netflix, bao gồm TV thông minh,
								điện thoại thông minh, máy tính bảng, thiết bị phát đa phương
								tiện trực tuyến và máy chơi game.</div>
							<div class="card-body">Bạn cũng có thể tải xuống các chương
								trình yêu thích bằng ứng dụng trên iOS, Android hoặc Windows 10.
								Vào phần nội dung đã tải xuống để xem trong khi di chuyển và khi
								không có kết nối Internet. Mang Netflix theo bạn đến mọi nơi.</div>
						</div>
					</div>
					<div class="card">
						<div class="card-header" id="headingFour">
							<button class="btn btn-link" data-toggle="collapse"
								data-target="#collapseFour" aria-expanded="true"
								aria-controls="collapseFour">
								Làm thế nào để huỷ?
								<svg viewBox="0 0 26 26" class="svg-icon svg-closed rotated"
									focusable="true">
                  <path
										d="M10.5 9.3L1.8 0.5 0.5 1.8 9.3 10.5 0.5 19.3 1.8 20.5 10.5 11.8 19.3 20.5 20.5 19.3 11.8 10.5 20.5 1.8 19.3 0.5 10.5 9.3Z">
                  </path>
                </svg>
							</button>
						</div>
						<div id="collapseFour" class="collapse show"
							aria-labelledby="headingFour" data-parent="#accordion">
							<div class="card-body">Netflix rất linh hoạt. Không có hợp
								đồng phiền toái, không ràng buộc. Bạn có thể dễ dàng hủy tài
								khoản trực tuyến chỉ trong hai cú nhấp chuột. Không mất phí hủy
								– bạn có thể bắt đầu hoặc ngừng tài khoản bất cứ lúc nào.</div>
						</div>
					</div>
					<div class="card">
						<div class="card-header" id="headingFive">
							<button class="btn btn-link" data-toggle="collapse"
								data-target="#collapseFive" aria-expanded="true"
								aria-controls="collapseFive">
								Tôi có thể xem gì trên Netflix?
								<svg viewBox="0 0 26 26" class="svg-icon svg-closed rotated"
									focusable="true">
                  <path
										d="M10.5 9.3L1.8 0.5 0.5 1.8 9.3 10.5 0.5 19.3 1.8 20.5 10.5 11.8 19.3 20.5 20.5 19.3 11.8 10.5 20.5 1.8 19.3 0.5 10.5 9.3Z">
                  </path>
                </svg>
							</button>
						</div>
						<div id="collapseFive" class="collapse show"
							aria-labelledby="headingFive" data-parent="#accordion">
							<div class="card-body">Netflix có một thư viện phong phú
								gồm các phim truyện, phim tài liệu, chương trình truyền hình,
								anime, tác phẩm giành giải thưởng của Netflix và nhiều nội dung
								khác. Xem không giới hạn bất cứ lúc nào bạn muốn.</div>
						</div>
					</div>
				</div>
				<form method="POST" action="/action_page.php"
					class="form-signin needs-validation" novalidate>
					<div class="row no-gutters justify-content-center">
						<div class="col-12 first">
							<p>Bạn đã sẵn sàng xem chưa? Nhập email để tạo hoặc kích hoạt
								lại tư cách thành viên của bạn.</p>
						</div>
						<div class="col-12 col-lg-9 second form-label-group my-4">
							<input type="email" id="inEmail" class="form-control"
								placeholder="Địa chỉ email"
								pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" maxlength="50"
								minlength="5" required>
							<div class="valid-feedback">Tốt! bạn đã thành công</div>
							<div class="invalid-feedback">Bạn cần nhập email!</div>
							<label for="inEmail">Địa chỉ email</label>
						</div>
						<div class="col-12 col-lg-3 third my-4">
							<button class="suscribe" type="submit">
								Bắt đầu<i class="arrow right"></i>
							</button>
						</div>
					</div>
				</form>
			</div>
		</section>
	</main>
	<!---footer---------->
	<footer class="page-footer font-small blue text-muted">
		<div class="container text-left">
			<div class="row justify-content-space-between">
				<div class="col-12 mt-5 mb-2">
					<p class="h5 text-capitalize">Bạn có câu hỏi? Liên hệ với chúng
						tôi.</p>
				</div>
				<hr class="clearfix w-100 d-md-none pb-3" />
				<div class="col-6 col-sm-4 col-md-4">
					<ul class="list-unstyled articles mb-4">
						<li><a href="#">Câu hỏi thường gặp</a></li>
						<li><a href="#">Tài khoản</a></li>
						<li><a href="#">Việc làm</a></li>
						<li><a href="#">Quyền riêng tư</a></li>
						<li><a href="#">Liên hệ với chúng tôi</a></li>
						<li><a href="#">Chỉ có trên Netflix</a></li>
					</ul>
				</div>
				<div class="col-6 col-sm-4 col-md-4">
					<ul class="list-unstyled articles mb-4">
						<li><a href="#">Điều khoản về Thẻ quà tặng</a></li>
						<li><a href="#">Trung tâm đa phương tiện</a></li>
						<li><a href="#">Các cách xem</a></li>
						<li><a href="#">Tùy chọn cookie</a></li>
						<li><a href="#">Kiểm tra tốc độ</a></li>
					</ul>
				</div>
				<div class="col-6 col-sm-4 col-md-4">
					<ul class="list-unstyled articles mb-4">
						<li><a href="#">Trung tâm trợ giúp </a></li>
						<li><a href="#">Quan hệ với nhà đầu tư</a></li>
						<li><a href="#">Điều khoản sử dụng</a></li>
						<li><a href="#">Thông tin doanh nghiệp</a></li>
						<li><a href="#">Thông báo pháp lý</a></li>
					</ul>
				</div>

			</div>

			<div class="dropdown">
				<button class="btn language dropdown-toggle text-left" type="button"
					id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">
					<span class="globe"> &#127770;</span> Tiếng việt
				</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					<a class="dropdown-item" href="#">Tiếng việt</a> <a
						class="dropdown-item" href="#">English</a>
				</div>
			</div>
			<p class="footer-copyright pt-5 pb-2 font-weight-lighter text-muted">
				Trang Web hiện đang làm ASM JAVA4 của PS20626 Phạm Gia Hào</p>
		</div>
	</footer>
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
		crossorigin="anonymous"></script>
	<script src="views/js/main.js"></script>
</body>
</html>