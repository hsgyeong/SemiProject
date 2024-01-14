<%@page import="java.util.Optional"%>
<%@page import="data.dao.TourSpotReviewDao"%>
<%@page import="data.dto.TourReviewDto"%>
<%@page import="data.dto.GuestReviewDto"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="data.dao.GuestTourSpotReviewDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String num =request.getParameter("num");
    
    GuestTourSpotReviewDao dao=new GuestTourSpotReviewDao();
	TourSpotReviewDao tourspotreviewdao = new TourSpotReviewDao();
	
	dao.updateLikes(num);
	tourspotreviewdao.updatelikes(num);
	

	String stringLikes = Optional.ofNullable(tourspotreviewdao.getData(num).getLikes()).orElse("0");
	
	int likes = Integer.parseInt(stringLikes);
	
	JSONObject ob = new JSONObject();
	ob.put("likes",likes);

%>
<%=ob.toString() %>  