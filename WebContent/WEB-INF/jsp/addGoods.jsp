<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>
<!-- <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
$(function(){
	//alert(1);
	var params = '{ "goodsId":5,"goodsShelftime":"defult","goodsName":"azc","goodsInventory":"3","goodsAvatar":"defult","goodsPrice":"zxczc","belong":"defult"}';
	$.ajax({
		url : "${pageContext.request.contextPath }/goods/addGoods.action",
		data : params,
		contentType : "application/json;charset=UTF-8",//发送数据的格式
		type : "post",
		dataType : "json",//回调
		success : function(data){
			alert(data.name);
		}
		
	});
});
</script> -->
</head>
<body> 
	<!-- 上传图片是需要指定属性 enctype="multipart/form-data" -->
	<!-- <form id="itemForm" action="" method="post" enctype="multipart/form-data"> -->
	<form id="goodsForm"	action="${pageContext.request.contextPath }/goods/addGoods.action" method="post" enctype="multipart/form-data">
		 修改商品信息：
		<table width="100%" border=1>
			<tr>
				<td>goodsId</td>
				<td><input type="text" name="goodsId"/></td>
			</tr>
			<tr>
				<td>商品上架时间</td>
				<td><input type="text" name="goodsShelftime" value="2018-8-29 14:06:07" /></td>
			</tr>
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="goodsName" value="娃哈哈矿泉水" /></td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input type="text" name="goodsPrice" value="1" /></td>
			</tr>
			<tr>
				<td>商品所属店铺</td>
				<td><input type="text" name="belong" value="中超超市" /></td>
			</tr>
			<tr>
				<td>商品生产日期</td>
				<td><input type="text" name="goodsInventory" value="7" /></td>
			</tr>
			
			<tr>
				<td>商品图片</td>
				<td>
					<input type="file"  name="pictureFile"/> 
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>

	</form>
	<form id="goodsForm"	action="${pageContext.request.contextPath }/goods/addGoodsPic.action" method="post" enctype="multipart/form-data">
		<table width="100%" border=1>
			<tr>
				<td>goodsId</td>
				<td><input type="text" name="goodsId" value="666" /></td>
			</tr>
			<tr>
				<td>商品图片</td>
				<td>
					<input type="file"  name="pictureFile"/> 
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>

	</form>
</body>

</html>