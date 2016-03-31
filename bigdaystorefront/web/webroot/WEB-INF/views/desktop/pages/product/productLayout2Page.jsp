<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/desktop/cart" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>

<template:page pageTitle="${pageTitle}">
	

	<c:if test="${not empty message}">
		<spring:theme code="${message}"/>
	</c:if>
	
	<div id="globalMessages">
		<common:globalMessages/>
	</div>

	<cms:pageSlot position="Section1" var="comp" element="div" class="span-24 section1 cms_disp-img_slot">
		<cms:component component="${comp}"/>
	</cms:pageSlot>

	<product:productDetailsPanel product="${product}" galleryImages="${galleryImages}"/>
	<!-- Added by SINDHU -->
<head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css">
</head>
<style>

.btn-default.active, .open > .dropdown-toggle.btn-default,
.product-short-desc .btn-default:hover,
.product-short-desc .btn-default:active,
.product-short-desc .btn-default:focus
{
    background-color: #3c9f3a;
    color: #fff;
}
.Given-btn.active, .open > .dropdown-toggle.Given-btn,
.product-short-desc .Given-btn:hover,
.product-short-desc .Given-btn:active,
.product-short-desc .Given-btn:focus
{
    background-color: #3399ff;
    color: #fff;
}
.list-add-img .ad-img-overlay-btn {
    margin-right: -15px;
}
.ad-img-overlay-btn {
    color: #fff;
    font-family: 'Roboto-Regular';
    font-size: .9em;
    padding-top: 90px;
    text-align: center;
}
.ad-img-overlay-btn span {
    border: 1px solid #fff;
    padding: 5px 20px;
    background: #000;
    border-radius: 3px;
}
.ad-img-overlay-btn {
    color: #fff;
    font-family: 'Roboto-Regular';
    font-size: .9em;
    padding-top: 90px;
    text-align: center;
}
.ad-img-overlay-btn span {
    border: 1px solid #fff;
    padding: 5px 20px;
    background: #000;
    border-radius: 3px;
}
.list-group-mrg1 {
    padding: 0;
}
.list-grp-col1 {
    min-height: 120px;
    margin-right: -1px;
}
.list-group .product-info h3.name {
    font-size: 2em;
    line-height: 1em;
    margin: 20px;
    padding-right: 0;
}
.list-group .product-info h3.name a {
    color: #3c3c3c;
}
ul.prime-features {
    list-style-type: none;
    padding: 0;
    margin: 5px 0 7px 20px;
    min-height: 20px;
    overflow: hidden;

}

.Get-btn,.Given-btn{
    margin: 20px;
    width: 30%;
    border-color: #3399FF;
}

/*# sourceMappingURL=bootstrap.css.map */


</style>

<body>
<c:url  value='/store/getacall'  var="getacall"/>
<c:url  value='/store/giveacall'  var="giveacall"/>
<div class="container">

            
				<div class="col-xs-6 col-lg-8 col-md-9 col-sm-8">
					<div class="row list-group-mrg1">
						<div class="col-xs-12 col-lg-8 col-mod-8 list-grp-col1">
							<div class="product-info">
							 <div class="product-short-desc">
									<button type="button" id="getAcallButton" class="btn btn-default Get-btn"  data-complete-text="Get a call..." data-toggle="modal" data-target="#myModal" onclick="add()">Get a call</button><br>
									<button type="button"  class="btn btn-default Given-btn"  data-complete-text="Give a call..." autocomplete="off" data-toggle="modal" data-target="#Givenmodal"  onclick="add2()"> Give a call</button>
								</div>
							</div>
						</div>
					</div> 
				</div>

	
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-body">
					Merchant will contact you soon
				</div>

			</div>
		</div>
	</div>
	<div class="modal fade" id="Givenmodal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					<i class="fa fa-mobile"></i>
					9912345670
					<br/>
					<i class="fa fa-phone"></i>
					040-234567
				</div>

				
			</div>
		</div>
	</div>
</div>
	<div id="#div2"></div>
<script>

function add(){
	
	alert("inida");
	$.ajax({url:'${getacall}', success: function(data){
		alert(data);
        $("#myModal").html(data);
    }});
}

function add2(){
	
	alert("inida");
	$.ajax({url:'${giveacall}', success: function(data){
		alert(data);
        $("#Givenmodal").html(data);
    }});
}

/* function add(){
	alert("hii-----");
	$("#getAcallButton").click(Validate(){
		alert("sindhu-------");
	    $.ajax({url:'${getacall}'>, success: function(result){
	        $("#div2").html(result);
	    }});
	}); 
} */

</script> 

<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.4.js"></script>
<script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.js"></script>
</body>
<!--  end of sindhu code-->
		
	<cms:pageSlot position="CrossSelling" var="comp" element="div" class="span-24">
		<cms:component component="${comp}"/>
	</cms:pageSlot>
	<div>
	
</div>
	<cms:pageSlot position="Section3" var="feature" element="div" class="span-20 section3 cms_disp-img_slot">
		<cms:component component="${feature}"/>
	</cms:pageSlot>
	<cms:pageSlot position="UpSelling" var="comp" element="div" class="span-24">
		<cms:component component="${comp}"/>
	</cms:pageSlot>
	
	<product:productPageTabs />
	<cms:pageSlot position="Section4" var="feature" element="div" class="span-24 section4 cms_disp-img_slot">
		<cms:component component="${feature}"/>
	</cms:pageSlot>
</template:page>
