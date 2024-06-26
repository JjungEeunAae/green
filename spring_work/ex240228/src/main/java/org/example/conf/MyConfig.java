package org.example.conf;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.example.components")
public class MyConfig {
    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        BasicDataSource bds = new BasicDataSource();
        bds.setInitialSize(10);     // 커넥션 풀(연결개수) 생성
        bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        bds.setUrl("jdbc:mysql://192.168.0.38/eunae");
        bds.setUsername("root");
        bds.setPassword("1234");
        return bds;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:sql/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    // SQL 문장 사용하는 객체
    @Bean
    public SqlSession session() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory());
    }
}
