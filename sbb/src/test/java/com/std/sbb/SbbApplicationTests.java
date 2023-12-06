package com.std.sbb;

import com.std.sbb.article.service.ArticleService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private ArticleService articleService;
	@Test
	@DisplayName("데이터 넣음")
	void contextLoads() {
		IntStream.rangeClosed(2, 300)
				.forEach(no -> articleService.create("데이터제목 %d용".formatted(no), "데이터내용 %d용".formatted(no), null));
	}

}
