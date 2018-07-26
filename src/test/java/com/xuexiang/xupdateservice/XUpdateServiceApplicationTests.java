package com.xuexiang.xupdateservice;

import com.xuexiang.xupdateservice.mapper.AppVersionInfoMapper;
import com.xuexiang.xupdateservice.model.AppVersionInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XUpdateServiceApplicationTests {

	@Autowired
	private AppVersionInfoMapper appVersionInfoMapper;//这里会报错，但是并不会影响

	@Test
	public void contextLoads() {

	}

	@Test
	public void SelectByConditionMapper(){
		Condition condition = new Condition(AppVersionInfo.class);
		condition.createCriteria().andEqualTo("appKey", "test");
		condition.setOrderByClause("version_code desc");
		List<AppVersionInfo> list = appVersionInfoMapper.selectByExample(condition);
		System.out.println(list.size());
	}

}
