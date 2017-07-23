package test;

import java.util.List;
import java.util.UUID;

import org.junit.Test;

import bean.Comment;
import service.CommentService;
import util.DataBaseUtils;

public class TestCommentService {
	CommentService cs = new CommentService();
	@Test
	public void SaveComment()
	{
		Comment comment = new Comment();
		comment.setId(UUID.randomUUID().toString());
		comment.setContent("很不错的文章，赞一个！");
		comment.setArticleId("3d7ea4a75b6242a2827b5a4619955ab5");
		comment.setUserId("1cdead89d5ec452197523e642063294c");
		cs.saveComment(comment);
		System.out.println("保存成功！");
		System.out.println(DataBaseUtils.queryForList("select a.content from t_comment a left JOIN t_user b "
		        + "on a.user_id = b.id where a.article_id = '3d7ea4a75b6242a2827b5a4619955ab5'"));   
	}
	@Test
	public void getCommentsByArticleId()
	{
		String id="3d7ea4a75b6242a2827b5a4619955ab5";
		List list=cs.getCommentsByArticleId(id);
		System.out.println(list);
	}
}
