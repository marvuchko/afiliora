package com.wizard_of_tomorrow.configuration;

import com.wizard_of_tomorrow.repository.user.RepositoryPackage;
import java.util.Optional;
import java.util.UUID;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.lang.NonNull;

@Configuration(DbConfiguration.BEAN_NAME)
@EnableJpaAuditing(auditorAwareRef = DbConfiguration.BEAN_NAME)
@EnableJpaRepositories(basePackageClasses = RepositoryPackage.class)
public class DbConfiguration implements AuditorAware<UUID> {

  public static final String BEAN_NAME = "auditorProvider";

  @NonNull
  @Override
  public Optional<UUID> getCurrentAuditor() {
    return Optional.empty();
  }

}
