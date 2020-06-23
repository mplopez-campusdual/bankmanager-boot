package com.imatia.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Lazy
@Repository(value = "CustomerAccountDao")
@ConfigurationFile(configurationFile = "dao/CustomerAccountDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class CustomerAccountDao extends OntimizeJdbcDaoSupport {

   public static final String QUERY_VCUSTOMERACCOUNT = "CUSTOMERACCOUNT";
   public CustomerAccountDao() {
      super();
   }
}