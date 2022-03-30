package com.wizard_of_tomorrow.configuration;

import com.wizard_of_tomorrow.repository.user.RepositoryPackage;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.util.Optional;
import java.util.UUID;
import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.lang.NonNull;

@Configuration(DbConfiguration.BEAN_NAME)
@EnableJpaAuditing(auditorAwareRef = DbConfiguration.BEAN_NAME)
@ConfigurationProperties(prefix = "spring.datasource")
@EnableJpaRepositories(basePackageClasses = RepositoryPackage.class)
public class DbConfiguration extends HikariConfig implements AuditorAware<UUID> {

  public static final String BEAN_NAME = "auditorProvider";

  @Bean
  public DataSource dataSource() {
    return new HikariDataSource(this);
  }

  @NonNull
  @Override
  public Optional<UUID> getCurrentAuditor() {
    return Optional.empty();
  }

}
