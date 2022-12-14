<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS 초기화  -->
<%-- <script src="${root}/resources/css/reset.css"></script>
 --%>
 
 
 
 <!-- jQuery 라이브러리 호출 -->
 <script src="${rootPath}/resources/js/jquery-3.6.1.min.js"></script>
<!-- 부트스트랩 연결 -->
 <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
	
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=7cffb8c56abe7dd1e1df8469cd0acc35"></script>



<style type="text/css">
#multiple-container {
	display: grid;
	grid-template-columns: 1fr 1fr 1fr;
}

.image {
	display: inline;
	width: 300px;
	height: 300px;
	border: 1px solid;
}

.image-label {
	position: relative;
	bottom: 22px;
	left: 5px;
	color: white;
	text-shadow: 2px 2px 2px black;
	}
.material-symbols-outlined {
  font-variation-settings:
  'FILL' 0,
  'wght' 400,
  'GRAD' 0,
  'opsz' 48

}
</style>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/lkc.css">








<title>Tasty Way : 공지 폼</title>



</head>
<body onload="load()">


	<!-- ------------------------maincontainer-------------------------------->
	<div class="container" style="float: none; margin: 0 auto; height:810px;" id="maincontainer">
	
	
	
	
		<!-- ------------------------backbutton-------------------------------->
		<div >
			<div class="row" style=" margin: 0 auto; width:800px" >
				<button style="background-color:transparent; width:100px; border: none;" id="backbutton"><span class="material-symbols-outlined" style="font-size: 40px;">reply</span></button>
			</div>
			
			
			
			
			
			<!--------------------------detailheader-------------------------------->
			<div class="row" style="float: none; ">
				<span class="row" style="justify-content:center; margin:0  auto; background-color: orange; width:800px;height:150px;" id= "detailheader">Tasty way</span>
			</div>
			
			
			
			
			<!--------------------------storeinfo(container)-------------------------------->
			<!-- input -->
			<div class = "col" style="float: none; margin: 0 auto; width: 800px;" id="storeinfo">
				<div class="row" style="float: left; margin: 20px auto; width: 500px; height: 500px; border-bottom: 1px solid; ">
					<span id="title" style=" height: 30px;font-size: 20px; color: orange;" ><b>점포정보</b></span>
					<div class="row" style="float: left; width: 300px; height: 55px;  margin-top: 20px; margin-bottom: 20px;">
						<span  style=" height: 55px;line-height: 55px; font-size: 20px; border-bottom: 2px solid; border-top: 2px solid; border-color: orange; font-weight: bold;" id="storetitle" ></span>
					</div>
					<div class="row" style="float: left;  width: 100px; height: 55px;  margin-top: 20px; margin-bottom: 20px; border-bottom: 2px solid; border-top: 2px solid; border-color: orange;">
						<div class="star-rating space-x-4 mx-auto" style=" border-left: 2px solid; border-right: 2px solid; border-color: orange;">
							<input type="radio" id="5-stars" name="rating" value="5" v-model="ratings"/>
								<label for="5-stars" class="star pr-4" style="-webkit-text-fill-color: gold;">★</label>
						</div>
					</div>
					<div class="row" style="float: left;  width: 150px; height: 55px;   margin-top: 20px; margin-bottom: 20px;">
						<span  style="height: 55px;line-height: 55px; font-size: 20px; border-bottom: 2px solid; border-top: 2px solid;  border-color: orange;" id="storestar">
							<a  style="height: 50px;line-height: 50px; font-size: 23px; font-weight: bold; color: #ff3366; " id="storescore" >5.0</a>
						</span>
					</div>
					
					<div class="row" style="float: left; margin: 20px auto; width: 150px; height: 345px;">
						<div style="text-align: center; " >
							<span class="badge bg-primary"  style="text-align:center; width:110px; ">주소</span>
						</div>
						<div style="text-align: center;">
							<span class="badge bg-primary"  style="text-align:center;  width:110px;">전화번호</span>
						</div>
						<div style="text-align: center;">
							<span class="badge bg-primary"  style="text-align:center;  width:110px;">분류</span>
						</div>
						<div style="text-align: center;">
							<span class="badge bg-primary"  style="text-align:center;  width:110px;">대표 메뉴</span>
						</div>
						<div style="text-align: center;">
							<span class="badge bg-primary"  style="text-align:center;  width:110px;">영업시간</span>
						</div>
						<div style="text-align: center;">
							<span class="badge bg-primary"  style="text-align:center;  width:110px;">메뉴</span>
						</div>
						
					</div>
					<div class="row" style="float: left; margin: 20px auto; width: 350px; height: 345px;" id="storeinfodetail">
						<div>
							<input type="text"  style="background-color: white; height: 30px; font-weight: bold; font-size: 15px;"class="form-control" id="juso" aria-describedby=" basic-addon3" readonly>
						</div> 
						<div>
							<input type="text"  style="background-color: white; height: 30px; font-weight: bold; font-size: 15px;"class="form-control" id="tel" aria-describedby=" basic-addon3" readonly>
						</div> 
						<div>
							<input type="text"  style="background-color: white; height: 30px; font-weight: bold; font-size: 15px;"class="form-control" id="category" aria-describedby=" basic-addon3" readonly>
						</div> 
						<div class="row" style="float: left; margin: 0px auto; width: 350px; ">
							<input type="text"   style="background-color: white; height: 30px; width:120px; font-weight: bold; font-size: 15px;" class="form-control" id="representativemenu" aria-describedby=" basic-addon3" readonly>
							<input type="text"   style="background-color: white; height: 30px; width:182px; font-weight: bold; font-size: 15px;"class="form-control" id="representativeprice" aria-describedby=" basic-addon3" readonly>
						</div> 
						<div>
							<input type="text"  style="background-color: white; height: 30px; font-weight: bold; font-size: 15px;"class="form-control" id="Openinghours" aria-describedby=" basic-addon3" readonly>
						</div> 
						<div class="row" style="float: left; margin: 0px auto; width: 350px; ">
							<input type="text"   style="background-color: white; height: 30px; width:120px; font-weight: bold; font-size: 15px;" class="form-control" id="menu" aria-describedby=" basic-addon3" readonly>
							<input type="text"   style="background-color: white; height: 30px; width:182px; font-weight: bold; font-size: 15px;"class="form-control" id="menuprice" aria-describedby=" basic-addon3" readonly>
						</div> 
					
					</div>
					
				</div>
				
				<!-- --------------------------------------storeimg------------------------------------------- -->
				
				<div class="row" style="float: right; margin: 20px auto; width: 300px; height: 500px; border-bottom: 1px solid;" id="storeinfoimg">
					<span id="title" style=" height: 30px;width: 200px; font-size: 20px; font-size: 20px; color: orange;" ><b>관련 사진</b></span>
					
					
					<button class="material-symbols-outlined" style="height: 30px;width: 100px;background-color:transparent; font-size:30px; border: none;" data-bs-toggle="modal" data-bs-target="#modalimg" data-bs-whatever="@mdo" id="storeimgclick" >add_box</button>
	
					<div class="row" style="float: left; margin: 20px auto; width: 300px;height: 200px;">
						<img src ="../resources/img/testimg.jpg" width="270" height="180" alt ="야옹이">
					</div>
					
				<!-- --------------------------------------storeimgmodal------------------------------------------- -->
				
					
						<div class="modal modal-lg fade" id="modalimg" tabindex="-1" aria-labelledby="mdalLabelimg" aria-hidden="true" >
						  <div class="modal-dialog">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h5 class="modal-title" id="modalLabelimg">image</h5>
						        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
						      </div>
						      <div class="modal-body">
						      	<div class="container" style="float: none; margin: 0 auto; height:400px;width:800px;" >
						      		<div class = "col" style="float: none; margin: 0 auto; width: 800px; height: 400px;" >
										<div class="row" style="float: left; margin: 0 auto; width:50px" >					    
							        		 	<button class="material-symbols-outlined" style="font-size: 40px;background-color:transparent; border: none; line-height: 380px;">arrow_back_ios_new</button>
							         	</div>
							         	<div class="row" style="float: left; margin: 0 auto; width:650px" >					    
							        		 <img src ="../resources/img/testimg.jpg" width="550" height="400" alt ="야옹이">		
							         	</div>
							         	<div class="row" style="float: left; margin: 0 auto; width:50px" >					    
							        		<button class="material-symbols-outlined" style="font-size: 40px;background-color:transparent; border: none; line-height: 380px;">arrow_forward_ios</button>
							         	</div>
						         	</div>
						        </div>       
						      </div>
						      
						    </div>
						  </div>
						</div>
					
					
			<!-- ------------------------------------------------------------------------------------------------- -->
					
					
					
					
					
					<!-- --------------------------------------map------------------------------------------- -->
					
					<span id="title" style=" height: 30px; width: 200px; font-size: 20px; color: orange;"><b>지도</b></span>
					<button class="material-symbols-outlined" style=" height: 30px;width: 100px;background-color:transparent; font-size:30px; border: none;" data-bs-toggle="modal" data-bs-target="#modalmap" data-bs-whatever="@mdo" id="zoom" >zoom_in</button>
					
					
					<div class="row" style="float: left; margin: 20px auto; width: 300px;height: 200px;">
						<div id="map" style="width:270px;height:160px;" id="storeinfomap"></div>
					</div>
					
					
					<!-- -----------------------------------------------modal------------------------------------------------------ -->
					
					
					
					
					<div class="modal modal-lg fade" id="modalmap" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true" >
						  <div class="modal-dialog">
						    <div class="modal-content">
						      <div class="modal-header">
						        <h5 class="modal-title" id="exampleModalLabel">상세위치</h5>
						        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
						      </div>
						      <div class="modal-body" >					    
						          <div id="mapmodal" style="width:765px;height:400px;" ></div>			       
						      </div>
						      
						    </div>
						  </div>
						</div>
					
					
					<!-- ---------------------------------------------------------------------------------------------------------- -->
						
					
				</div>
			</div>
		</div>
		
		<!-- --------------------------------------review----------------------------------------------------------------------------------- -->
		
		<div>
			
			
			
			
			<div class="row" style=" margin: 0 auto; width:800px; margin-bottom: 30px;"  >
				<span style=" width:600px; border: none;  "><span  style="font-size: 20px; color: orange;" id="reviewtitle"><b>사용자 리뷰</b></span></span>
				<button style=" width:190px; border: none; color: white; background-color: orange; border-bottom-right-radius: 5px; border-bottom-left-radius: 5px; border-top-left-radius: 5px; border-top-right-radius: 5px;" id="reviewbtn" onclick="reviewwritebtn()"> 리뷰 작성</button>
			</div>
			
			
			
			<div class = "col" style="float: none; margin: 0 auto; width: 800px; height: 500px;"  id="reviewcontainer">
			
				
			</div>

		
			
	
		</div>
	
	</div>
	
			<div class="row" style=" margin: 0 auto; width:800px; margin-bottom: 20px;">
					<button id="reviewaddbtn" style=" margin: 0 auto; width:130px; background-color:transparent; border-bottom-right-radius: 5px; border-bottom-left-radius: 5px; border-color: orange; border-top-left-radius: 5px; border-top-right-radius: 5px; display:block;" onclick="review()">
						<span class="material-symbols-outlined" style="font-size: 30px; line-height: 40px;width:40px;">keyboard_double_arrow_down</span>	
					
					</button>	
			</div>
</body>














<!-- -------------------------------------functionscript--------------------------------------------------------- -->




<script>


var page = 1;
var idtemp = ${id};
var opttemp = "reviewRestaurant";


function load(){
	
	$.ajax({
		url : "${rootPath}/api/restaurant/"+${id},
		type : "get",
		dataType : "JSON",
		contentType : "applicaton/json; charset=utf-8",
		/* success: function(response) {
			$("#result-text").html(JSON.stringify(response));                    
		}, */

		success : function(response) {
		//	console.log(response)
			//var count = parseInt(response); //문자를 정수형 숫자로 변환해줌
			//console.log(count)
			
			$('#storetitle').text(response.restaurantName);
			$('#juso').val(response.restaurantAddress);
			$('#tel').val(response.restaurantPh);
			$('#category').val(response.restaurantCategory);
			$('#representativemenu').val('원하는 값');
			$('#representativeprice').val('원하는 값');
			$('#Openinghours').val('원하는 값');
			$('#menu').val('원하는 값');
			$('#menuprice').val('원하는 값');
			//
			 var Latitude = eval(response.restaurantLatitude);
			 var Longtitude = eval(response.restaurantLongtitude);
			//restaurantLatitude: 37.6576893
			//restaurantLongtitude: 126.7713555
			console.log(Latitude);
			console.log(Longtitude);
			map(Latitude,Longtitude,response.restaurantName);
		}
	});
	
	reviewavg();
	
	review();
}
function reviewavg(){
	var restuarantid =Number(${id});
	
	$.ajax({
		url : "${rootPath}/api/review/avg/"+restuarantid,
		type : "get",
		dataType : "JSON",
		contentType : "applicaton/json; ",
		
		success : function(response) {
			
			$("#storescore").text(response.toFixed(1));
			
		}
	});
	
	
}
function review(){
	$.ajax({
		url : "${rootPath}/api/review/count",
		type : "get",
		data: {
			opt: opttemp,
			key: idtemp
		},
		dataType : "JSON",
		contentType : "applicaton/json; charset=utf-8",

		success : function(response) {

			var count = Number(response);
			
			if(count<=(page-1)*3)
			{
				// 토글 할 버튼 선택 (btn1)
				const btn = document.getElementById("reviewaddbtn");
				console.log("여기까지")				  
				btn.style.display = 'none';

			}
		
		}
	});
	
	$.ajax({
		url : "${rootPath}/api/review/page/"+page,
		type : "get",
		data: {
			opt: opttemp,
			key: idtemp
		},
		dataType : "JSON",
		contentType : "applicaton/json; charset=utf-8",


		success : function(response) {
			
			for( idx in response)
			{
				var height_1; // 변수선언
				height_1 = document.getElementById("maincontainer").offsetHeight;
				console.log(height_1);
				height_1 = height_1 +144;
				height_1 = height_1 + 'px';
				document.getElementById("maincontainer").style.height = height_1;
				height_1 = document.getElementById("maincontainer").offsetHeight;
				console.log(height_1);
				
				
				var star= Number(response[idx].reviewStar);
				console.log(star);
				
				switch(star)
				{
					case 1:
						$("#reviewcontainer").append(
								 "<div class='row' style='width: 780px;height: 124px; margin: 20px 20px 20px 5px; border: 1px solid; border-bottom-right-radius: 5px; border-bottom-left-radius: 5px; border-color: orange; border-top-left-radius: 5px; border-top-right-radius: 5px; '>"+
									"<div class='row' style='float: left; margin: 0 auto; width:170px' >"+
									"<div style='text-align: center; '>"+
									"<span class='badge bg-primary' id='title' style='text-align:center; width:100px; height: 20px;'>"+response[idx].reviewWriter +"</span>"+
									"</div>"+
									"<span id='title' style=' height: 40px;line-height: 50px; font-size: 20px; ' >"+
									"<div class='star-rating space-x-4 mx-auto'>"+
									"<input type='radio' id='5-stars' name='rating' value='5' v-model='ratings'/>"+
									"<label for='5-stars' class='star pr-4'>★</label>"+
									"<input type='radio' id='4-stars' name='rating' value='4' v-model='ratings'/>"+
									"<label for='4-stars' class='star'>★</label>"+
									"<input type='radio' id='3-stars' name='rating' value='3' v-model='ratings'/>"+
									"<label for='3-stars' class='star'>★</label>"+
									"<input type='radio' id='2-stars' name='rating' value='2' v-model='ratings'/>"+
									"<label for='2-stars' class='star'>★</label>"+
									"<input type='radio' id='1-star' name='rating' value='1' v-model='ratings' />"+
									"<label for='1-star' class='star' style='-webkit-text-fill-color: gold;'>★</label>"+
									"</div>"+
									"</span>"+
									"<div class='row' style=' margin: 20px auto; width: 190px; height: 20px;'>"+
									"<a id='title' style=' height: 20px;line-height: 10px; font-size: 20px; text-align: center;'>"+response[idx].reviewStar +"</a>"+
									"</div>"+				
									"</div>"+
									"<div class='row' style='float: left; margin: 0 auto; width:360px;height: 120px;' >"+
												<!-- output -->
									" <div class='row' style='float: none; margin: 0 auto; width:360px;height: 120px;'>"+
									" <textarea class='form-control' id='content' style='margin-top: 10px; margin-bottom: 10px; background: transparent;' readonly>"+response[idx].reviewContent +"</textarea>"+           
									" </div>"+
									"</div>"+
									"<div class='row' style='float: left; margin: 0 auto; width:180px;height: 120px;' >"+
									"<img src ='../resources/img/testimg.jpg' width='160' height='110' alt ='야옹이' style='border: 1px solid; border-color: orange; margin-top: 5px;'>"+
									"</div>"+
									"</div>"
									

						);	
						break;
					case 2:
						$("#reviewcontainer").append(
								 "<div class='row' style='width: 780px;height: 124px; margin: 20px 20px 20px 5px; border: 1px solid; border-bottom-right-radius: 5px; border-bottom-left-radius: 5px; border-color: orange; border-top-left-radius: 5px; border-top-right-radius: 5px; '>"+
									"<div class='row' style='float: left; margin: 0 auto; width:170px' >"+
									"<div style='text-align: center; '>"+
									"<span class='badge bg-primary' id='title' style='text-align:center; width:100px; height: 20px;'>"+response[idx].reviewWriter +"</span>"+
									"</div>"+
									"<span id='title' style=' height: 40px;line-height: 50px; font-size: 20px; ' >"+
									"<div class='star-rating space-x-4 mx-auto'>"+
									"<input type='radio' id='5-stars' name='rating' value='5' v-model='ratings'/>"+
									"<label for='5-stars' class='star pr-4'>★</label>"+
									"<input type='radio' id='4-stars' name='rating' value='4' v-model='ratings'/>"+
									"<label for='4-stars' class='star'>★</label>"+
									"<input type='radio' id='3-stars' name='rating' value='3' v-model='ratings'/>"+
									"<label for='3-stars' class='star'>★</label>"+
									"<input type='radio' id='2-stars' name='rating' value='2' v-model='ratings'/>"+
									"<label for='2-stars' class='star'style='-webkit-text-fill-color: gold;'>★</label>"+
									"<input type='radio' id='1-star' name='rating' value='1' v-model='ratings' />"+
									"<label for='1-star' class='star' style='-webkit-text-fill-color: gold;'>★</label>"+
									"</div>"+
									"</span>"+
									"<div class='row' style=' margin: 20px auto; width: 190px; height: 20px;'>"+
									"<a id='title' style=' height: 20px;line-height: 10px; font-size: 20px; text-align: center;'>"+response[idx].reviewStar +"</a>"+
									"</div>"+				
									"</div>"+
									"<div class='row' style='float: left; margin: 0 auto; width:360px;height: 120px;' >"+
												<!-- output -->
									" <div class='row' style='float: none; margin: 0 auto; width:360px;height: 120px;'>"+
									" <textarea class='form-control' id='content' style='margin-top: 10px; margin-bottom: 10px;background: transparent;' readonly>"+response[idx].reviewContent +"</textarea>"+           
									" </div>"+
									"</div>"+
									"<div class='row' style='float: left; margin: 0 auto; width:180px;height: 120px;' >"+
									"<img src ='../resources/img/testimg.jpg' width='160' height='110' alt ='야옹이' style='border: 1px solid; border-color: orange; margin-top: 5px;'>"+
									"</div>"+
									"</div>"
									

						);	
						break;
					case 3:
						$("#reviewcontainer").append(
								 "<div class='row' style='width: 780px;height: 124px; margin: 20px 20px 20px 5px; border: 1px solid; border-bottom-right-radius: 5px; border-bottom-left-radius: 5px; border-color: orange; border-top-left-radius: 5px; border-top-right-radius: 5px; '>"+
									"<div class='row' style='float: left; margin: 0 auto; width:170px' >"+
									"<div style='text-align: center; '>"+
									"<span class='badge bg-primary' id='title' style='text-align:center; width:100px; height: 20px;'>"+response[idx].reviewWriter +"</span>"+
									"</div>"+
									"<span id='title' style=' height: 40px;line-height: 50px; font-size: 20px; ' >"+
									"<div class='star-rating space-x-4 mx-auto'>"+
									"<input type='radio' id='5-stars' name='rating' value='5' v-model='ratings'/>"+
									"<label for='5-stars' class='star pr-4'>★</label>"+
									"<input type='radio' id='4-stars' name='rating' value='4' v-model='ratings'/>"+
									"<label for='4-stars' class='star'>★</label>"+
									"<input type='radio' id='3-stars' name='rating' value='3' v-model='ratings'/>"+
									"<label for='3-stars' class='star'style='-webkit-text-fill-color: gold;'>★</label>"+
									"<input type='radio' id='2-stars' name='rating' value='2' v-model='ratings'/>"+
									"<label for='2-stars' class='star'style='-webkit-text-fill-color: gold;'>★</label>"+
									"<input type='radio' id='1-star' name='rating' value='1' v-model='ratings' />"+
									"<label for='1-star' class='star' style='-webkit-text-fill-color: gold;'>★</label>"+
									"</div>"+
									"</span>"+
									"<div class='row' style=' margin: 20px auto; width: 190px; height: 20px;'>"+
									"<a id='title' style=' height: 20px;line-height: 10px; font-size: 20px; text-align: center;'>"+response[idx].reviewStar +"</a>"+
									"</div>"+				
									"</div>"+
									"<div class='row' style='float: left; margin: 0 auto; width:360px;height: 120px;' >"+
												<!-- output -->
									" <div class='row' style='float: none; margin: 0 auto; width:360px;height: 120px;'>"+
									" <textarea class='form-control' id='content' style='margin-top: 10px; margin-bottom: 10px;background: transparent;' readonly>"+response[idx].reviewContent +"</textarea>"+           
									" </div>"+
									"</div>"+
									"<div class='row' style='float: left; margin: 0 auto; width:180px;height: 120px;' >"+
									"<img src ='../resources/img/testimg.jpg' width='160' height='110' alt ='야옹이' style='border: 1px solid; border-color: orange; margin-top: 5px;'>"+
									"</div>"+
									"</div>"
									

						);	
						break;
					case 4:
						$("#reviewcontainer").append(
								 "<div class='row' style='width: 780px;height: 124px; margin: 20px 20px 20px 5px; border: 1px solid; border-bottom-right-radius: 5px; border-bottom-left-radius: 5px; border-color: orange; border-top-left-radius: 5px; border-top-right-radius: 5px; '>"+
									"<div class='row' style='float: left; margin: 0 auto; width:170px' >"+
									"<div style='text-align: center; '>"+
									"<span class='badge bg-primary' id='title' style='text-align:center; width:100px; height: 20px;'>"+response[idx].reviewWriter +"</span>"+
									"</div>"+
									"<span id='title' style=' height: 40px;line-height: 50px; font-size: 20px; ' >"+
									"<div class='star-rating space-x-4 mx-auto'>"+
									"<input type='radio' id='5-stars' name='rating' value='5' v-model='ratings'/>"+
									"<label for='5-stars' class='star pr-4'>★</label>"+
									"<input type='radio' id='4-stars' name='rating' value='4' v-model='ratings'/>"+
									"<label for='4-stars' class='star'style='-webkit-text-fill-color: gold;'>★</label>"+
									"<input type='radio' id='3-stars' name='rating' value='3' v-model='ratings'/>"+
									"<label for='3-stars' class='star'style='-webkit-text-fill-color: gold;'>★</label>"+
									"<input type='radio' id='2-stars' name='rating' value='2' v-model='ratings'/>"+
									"<label for='2-stars' class='star'style='-webkit-text-fill-color: gold;'>★</label>"+
									"<input type='radio' id='1-star' name='rating' value='1' v-model='ratings' />"+
									"<label for='1-star' class='star' style='-webkit-text-fill-color: gold;'>★</label>"+
									"</div>"+
									"</span>"+
									"<div class='row' style=' margin: 20px auto; width: 190px; height: 20px;'>"+
									"<a id='title' style=' height: 20px;line-height: 10px; font-size: 20px; text-align: center;'>"+response[idx].reviewStar +"</a>"+
									"</div>"+				
									"</div>"+
									"<div class='row' style='float: left; margin: 0 auto; width:360px;height: 120px;' >"+
												<!-- output -->
									" <div class='row' style='float: none; margin: 0 auto; width:360px;height: 120px;'>"+
									" <textarea class='form-control' id='content' style='margin-top: 10px; margin-bottom: 10px;background: transparent;' readonly>"+response[idx].reviewContent +"</textarea>"+           
									" </div>"+
									"</div>"+
									"<div class='row' style='float: left; margin: 0 auto; width:180px;height: 120px;' >"+
									"<img src ='../resources/img/testimg.jpg' width='160' height='110' alt ='야옹이' style='border: 1px solid; border-color: orange; margin-top: 5px;'>"+
									"</div>"+
									"</div>"
									

						);	
						break;
					case 5:
						$("#reviewcontainer").append(
								 "<div class='row' style='width: 780px;height: 124px; margin: 20px 20px 20px 5px; border: 1px solid; border-bottom-right-radius: 5px; border-bottom-left-radius: 5px; border-color: orange; border-top-left-radius: 5px; border-top-right-radius: 5px; '>"+
									"<div class='row' style='float: left; margin: 0 auto; width:170px' >"+
									"<div style='text-align: center; '>"+
									"<span class='badge bg-primary' id='title' style='text-align:center; width:100px; height: 20px;'>"+response[idx].reviewWriter +"</span>"+
									"</div>"+
									"<span id='title' style=' height: 40px;line-height: 50px; font-size: 20px; ' >"+
									"<div class='star-rating space-x-4 mx-auto'>"+
									"<input type='radio' id='5-stars' name='rating' value='5' v-model='ratings'/>"+
									"<label for='5-stars' class='star pr-4' style='-webkit-text-fill-color: gold;'>★</label>"+
									"<input type='radio' id='4-stars' name='rating' value='4' v-model='ratings'/>"+
									"<label for='4-stars' class='star' style='-webkit-text-fill-color: gold;'>★</label>"+
									"<input type='radio' id='3-stars' name='rating' value='3' v-model='ratings'/>"+
									"<label for='3-stars' class='star' style='-webkit-text-fill-color: gold;'>★</label>"+
									"<input type='radio' id='2-stars' name='rating' value='2' v-model='ratings'/>"+
									"<label for='2-stars' class='star' style='-webkit-text-fill-color: gold;'>★</label>"+
									"<input type='radio' id='1-star' name='rating' value='1' v-model='ratings' />"+
									"<label for='1-star' class='star' style='-webkit-text-fill-color: gold;'>★</label>"+
									"</div>"+
									"</span>"+
									"<div class='row' style=' margin: 20px auto; width: 190px; height: 20px;'>"+
									"<a id='title' style=' height: 20px;line-height: 10px; font-size: 20px; text-align: center;'>"+response[idx].reviewStar +"</a>"+
									"</div>"+				
									"</div>"+
									"<div class='row' style='float: left; margin: 0 auto; width:360px;height: 120px;' >"+
												<!-- output -->
									" <div class='row' style='float: none; margin: 0 auto; width:360px;height: 120px;'>"+
									" <textarea class='form-control' id='content' style='margin-top: 10px; margin-bottom: 10px;background: transparent;' readonly>"+response[idx].reviewContent +"</textarea>"+           
									" </div>"+
									"</div>"+
									"<div class='row' style='float: left; margin: 0 auto; width:180px;height: 120px;' >"+
									"<img src ='../resources/img/testimg.jpg' width='160' height='110' alt ='야옹이' style='border: 1px solid; border-color: orange; margin-top: 5px;'>"+
									"</div>"+
									"</div>"
									
						);	
						break;
				}
						
			}
			
		}
	});
	
	page += 1;
	
}






<!-- -------------------------------------mapscript--------------------------------------------------------- -->

function map(latitude,longtitude,title){
var map;
var mapmodal;



$('#modalmap').on('show.bs.modal', function (e) {	
	mapmodal.relayout();
	console.log("show.bs.modal");
});
$('#modalmap').on('shown.bs.modal', function (e) {
console.log("shown.bs.modal");
mapmodal.relayout();
});
$('#modalmap').on('hide.bs.modal', function (e) {
console.log("hide.bs.modal");
});
$('#modalmap').on('hidden.bs.modal', function (e) {
console.log("hidden.bs.modal");
});


var container = document.getElementById('map');
var options = {
	center: new kakao.maps.LatLng(latitude, longtitude),
	level: 3
};

map = new kakao.maps.Map(container, options);

// 마커가 표시될 위치입니다 
var markerPosition  = new kakao.maps.LatLng(latitude, longtitude); 

// 마커를 생성합니다
var marker = new kakao.maps.Marker({
    position: markerPosition
});

// 마커가 지도 위에 표시되도록 설정합니다
marker.setMap(map);




var containermodal = document.getElementById('mapmodal');
var options1 = {
		center: new kakao.maps.LatLng(latitude, longtitude),
		level: 3
	};
mapmodal = new kakao.maps.Map(containermodal, options1);
//마커가 표시될 위치입니다 
var markerPositionmodal  = new kakao.maps.LatLng(latitude, longtitude); 

//마커를 생성합니다
var markermodal = new kakao.maps.Marker({
    position: markerPositionmodal
});

//마커가 지도 위에 표시되도록 설정합니다
markermodal.setMap(mapmodal);


containermodal.style.width = '765px';
containermodal.style.height = '400px'; 


}

</script>














<script>
function readMultipleImage(input) {

    const multipleContainer = document.getElementById("multiple-container")
    
    // 인풋 태그에 파일들이 있는 경우
    if(input.files) {
        // 이미지 파일 검사 (생략)

        console.log(input.files)

        // 유사배열을 배열로 변환 (forEach문으로 처리하기 위해)
        const fileArr = Array.from(input.files)

        const $colDiv1 = document.createElement("div")
        const $colDiv2 = document.createElement("div")
        $colDiv1.classList.add("column")
        $colDiv2.classList.add("column")

        fileArr.forEach((file, index) => {
            const reader = new FileReader()

            const $imgDiv = document.createElement("div")   
            const $img = document.createElement("img")
            $img.classList.add("image")

            const $label = document.createElement("label")
            $label.classList.add("image-label")
/*             $label.textContent = file.name
 */
            $imgDiv.appendChild($img)
            $imgDiv.appendChild($label)

            reader.onload = e => {
                $img.src = e.target.result
                
                $imgDiv.style.width = ($img.naturalWidth) * 0.2 + 'px'
                $imgDiv.style.height = ($img.naturalHeight) * 0.2 + 'px'
            }
            
            console.log(file.name)
            if(index % 2 == 0) {
                $colDiv1.appendChild($imgDiv)
            } else {
                $colDiv2.appendChild($imgDiv)
            }
            
            reader.readAsDataURL(file)
        })

        multipleContainer.appendChild($colDiv1)
        multipleContainer.appendChild($colDiv2)

    }
}

const inputMultipleImage = document.getElementById("input-multiple-image")
inputMultipleImage.addEventListener("change", e => {
    readMultipleImage(e.target)
})



</script>



<script>

var reviewcount = 1;
var testtoggle = 0;

function reviewwritebtn(){
	
	if(testtoggle == 1)
	{
		 $("#reviewtitle").show();	
		 testtoggle = 0;
	}
	else
	{
		 $("#reviewtitle").hide();
		 testtoggle= 1;
	}
	
	
}




</script>



</html>