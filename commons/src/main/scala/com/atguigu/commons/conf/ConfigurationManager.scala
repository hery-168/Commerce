package com.atguigu.commons.conf

import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder
import org.apache.commons.configuration2.builder.fluent.Parameters
import org.apache.commons.configuration2.{FileBasedConfiguration, PropertiesConfiguration}

/**
  * @author JasonHuang
  * @version 2017-12-11
  *  可以用来解析json 和xml 文件
  */
object ConfigurationManager {

  private val params = new Parameters()
  private val builder = new FileBasedConfigurationBuilder[FileBasedConfiguration](classOf[PropertiesConfiguration])
    .configure(params.properties().setFileName("jdbc.properties"))
  //配置对象
  val config = builder.getConfiguration()
}
