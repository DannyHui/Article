<%@page import="bean.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="bean.User"%>
<%@page import="bean.Comment"%>
<%@page import="service.CommentService"%>
<%
	//因为评论是需要登陆的,如果没有登陆我们就调整到登陆页面去 
	User user = (User)session.getAttribute("user");
	if(user==null){//代表用户没有登陆
		out.print("-1");
		return;
	}
	String content = request.getParameter("content").toString();

 	String articleId = request.getParameter("articleId").toString();
    CommentService commentService = new CommentService();
    Comment comment = new Comment();
    comment.setId(UUID.randomUUID().toString());
    comment.setUserId(user.getId());
    comment.setArticleId(articleId);
    comment.setContent(content);
    commentService.saveComment(comment);
%>