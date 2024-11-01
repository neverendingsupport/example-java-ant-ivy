# Spring 4.3 Ivy Demo

This simple demo shows how to add Spring 4.3 dependencies to an Ant/Ivy project. 

To get started, run the following:
```
→ ant -lib lib/ run
```

... and you should see the following:
```
Buildfile: /Users/demo/spring4-ivy/build.xml

init:

resolve:
[ivy:resolve] :: Apache Ivy 2.5.2 - 20230817170011 :: https://ant.apache.org/ivy/ ::
[ivy:resolve] :: loading settings :: file = /Users/demo/spring4-ivy/ivysettings.xml
[ivy:resolve] :: resolving dependencies :: com.example#my-spring4-app;working@Demo.Local
[ivy:resolve]   confs: [default]
[ivy:resolve]   found org.springframework#spring-core;4.3.30.RELEASE in central
[ivy:resolve]   found commons-logging#commons-logging;1.2 in chain
[ivy:resolve]   found commons-codec#commons-codec;1.10 in chain
[ivy:resolve]   found log4j#log4j;1.2.17 in chain
[ivy:resolve]   found net.sf.jopt-simple#jopt-simple;5.0.3 in chain
[ivy:resolve]   found org.aspectj#aspectjweaver;1.8.9 in chain
[ivy:resolve]   found org.springframework#spring-webmvc;4.3.30.RELEASE in central
[ivy:resolve]   found org.springframework#spring-aop;4.3.30.RELEASE in central
[ivy:resolve]   found org.springframework#spring-beans;4.3.30.RELEASE in central
[ivy:resolve]   found org.springframework#spring-context;4.3.30.RELEASE in central
[ivy:resolve]   found org.springframework#spring-expression;4.3.30.RELEASE in central
[ivy:resolve]   found org.springframework#spring-web;4.3.30.RELEASE in central
[ivy:resolve]   found com.fasterxml.jackson.core#jackson-databind;2.8.11.3 in chain
[ivy:resolve]   found com.fasterxml.jackson.core#jackson-annotations;2.8.0 in chain
[ivy:resolve]   found com.fasterxml.jackson.core#jackson-core;2.8.10 in chain
[ivy:resolve]   found com.fasterxml.jackson.dataformat#jackson-dataformat-xml;2.8.11 in chain
[ivy:resolve]   found com.fasterxml.jackson.core#jackson-core;2.8.11 in chain
[ivy:resolve]   found com.fasterxml.jackson.module#jackson-module-jaxb-annotations;2.8.11 in chain
[ivy:resolve]   found org.codehaus.woodstox#stax2-api;3.1.4 in chain
[ivy:resolve]   found com.fasterxml.woodstox#woodstox-core;5.0.3 in chain
[ivy:resolve]   found com.lowagie#itext;2.1.7 in chain
[ivy:resolve]   found bouncycastle#bcmail-jdk14;138 in chain
[ivy:resolve]   found bouncycastle#bcprov-jdk14;138 in chain
[ivy:resolve]   found bouncycastle#bctsp-jdk14;138 in chain
[ivy:resolve]   found org.bouncycastle#bctsp-jdk14;1.38 in chain
[ivy:resolve]   found org.bouncycastle#bcprov-jdk14;1.38 in chain
[ivy:resolve]   found org.bouncycastle#bcmail-jdk14;1.38 in chain
[ivy:resolve]   found com.rometools#rome;1.7.4 in chain
[ivy:resolve]   found com.rometools#rome-utils;1.7.4 in chain
[ivy:resolve]   found org.slf4j#slf4j-api;1.7.16 in chain
[ivy:resolve]   found org.jdom#jdom2;2.0.6 in chain
[ivy:resolve]   found javax.el#javax.el-api;2.2.5 in chain
[ivy:resolve]   found javax.servlet.jsp.jstl#javax.servlet.jsp.jstl-api;1.2.1 in chain
[ivy:resolve]   found javax.servlet.jsp#javax.servlet.jsp-api;2.2.1 in chain
[ivy:resolve]   found net.sf.jasperreports#jasperreports;6.2.1 in chain
[ivy:resolve]   found commons-beanutils#commons-beanutils;1.9.0 in chain
[ivy:resolve]   found commons-collections#commons-collections;3.2.2 in chain
[ivy:resolve]   found commons-digester#commons-digester;2.1 in chain
[ivy:resolve]   found org.jfree#jcommon;1.0.23 in chain
[ivy:resolve]   found org.jfree#jfreechart;1.0.19 in chain
[ivy:resolve]   found org.eclipse.jdt.core.compiler#ecj;4.3.1 in chain
[ivy:resolve]   found org.codehaus.castor#castor-xml;1.3.3 in chain
[ivy:resolve]   found org.codehaus.castor#castor-core;1.3.3 in chain
[ivy:resolve]   found commons-lang#commons-lang;2.6 in chain
[ivy:resolve]   found javax.inject#javax.inject;1 in chain
[ivy:resolve]   found stax#stax;1.2.0 in chain
[ivy:resolve]   found stax#stax-api;1.0.1 in chain
[ivy:resolve]   found javax.xml.stream#stax-api;1.0-2 in chain
[ivy:resolve]   found org.apache.lucene#lucene-core;4.5.1 in chain
[ivy:resolve]   found org.apache.lucene#lucene-analyzers-common;4.5.1 in chain
[ivy:resolve]   found org.apache.lucene#lucene-queryparser;4.5.1 in chain
[ivy:resolve]   found org.apache.lucene#lucene-queries;4.5.1 in chain
[ivy:resolve]   found org.apache.lucene#lucene-sandbox;4.5.1 in chain
[ivy:resolve]   found jakarta-regexp#jakarta-regexp;1.4 in chain
[ivy:resolve]   found com.google.zxing#core;2.3.0 in chain
[ivy:resolve]   found net.sourceforge.jexcelapi#jxl;2.6.12 in chain
[ivy:resolve]   found org.apache.poi#poi;3.17 in chain
[ivy:resolve]   found org.apache.commons#commons-collections4;4.1 in chain
[ivy:resolve]   found org.apache.poi#poi-ooxml;3.17 in chain
[ivy:resolve]   found org.apache.poi#poi-ooxml-schemas;3.17 in chain
[ivy:resolve]   found org.apache.xmlbeans#xmlbeans;2.6.0 in chain
[ivy:resolve]   found com.github.virtuald#curvesapi;1.04 in chain
[ivy:resolve]   found org.apache.tiles#tiles-api;2.2.2 in chain
[ivy:resolve]   found org.apache.tiles#tiles-core;2.2.2 in chain
[ivy:resolve]   found org.apache.tiles#tiles-el;2.2.2 in chain
[ivy:resolve]   found org.apache.tiles#tiles-extras;2.2.2 in chain
[ivy:resolve]   found org.apache.tiles#tiles-servlet-wildcard;2.2.2 in chain
[ivy:resolve]   found org.apache.tiles#tiles-servlet;2.2.2 in chain
[ivy:resolve]   found org.apache.tiles#tiles-jsp;2.2.2 in chain
[ivy:resolve]   found org.apache.tiles#tiles-template;2.2.2 in chain
[ivy:resolve]   found org.apache.tiles#tiles-freemarker;2.2.2 in chain
[ivy:resolve]   found org.apache.tiles#tiles-velocity;2.2.2 in chain
[ivy:resolve]   found org.apache.tiles#tiles-mvel;2.2.2 in chain
[ivy:resolve]   found org.mvel#mvel2;2.0.11 in chain
[ivy:resolve]   found org.apache.tiles#tiles-ognl;2.2.2 in chain
[ivy:resolve]   found ognl#ognl;2.7.3 in chain
[ivy:resolve]   found jboss#javassist;3.7.ga in chain
[ivy:resolve]   found org.apache.tiles#tiles-compat;2.2.2 in chain
[ivy:resolve]   found org.apache.velocity#velocity;1.7 in chain
[ivy:resolve]   found org.codehaus.groovy#groovy-all;2.4.17 in chain
[ivy:resolve]   found org.freemarker#freemarker;2.3.23 in chain
[ivy:resolve]   found org.springframework#spring-context-support;4.3.30.RELEASE in central
[ivy:resolve]   found org.springframework#spring-oxm;4.3.30.RELEASE in central
[ivy:resolve]   found org.webjars#webjars-locator;0.32-1 in chain
[ivy:resolve]   found org.webjars#webjars-locator-core;0.32 in chain
[ivy:resolve]   found org.apache.commons#commons-lang3;3.1 in chain
[ivy:resolve]   found org.apache.commons#commons-compress;1.9 in chain
[ivy:resolve]   found velocity-tools#velocity-tools-view;1.4 in chain
[ivy:resolve]   found org.springframework.security#spring-security-core;4.2.20.RELEASE in chain
[ivy:resolve]   found aopalliance#aopalliance;1.0 in chain
[ivy:resolve]   found ch.qos.logback#logback-classic;1.1.11 in chain
[ivy:resolve]   found ch.qos.logback#logback-core;1.1.11 in chain
[ivy:resolve]   found org.slf4j#slf4j-api;1.7.22 in chain
[ivy:resolve]   found junit#junit;4.12 in chain
[ivy:resolve]   found org.hamcrest#hamcrest-core;1.3 in chain
[ivy:resolve]   found org.assertj#assertj-core;2.2.0 in chain
[ivy:resolve]   found org.hsqldb#hsqldb;2.3.6 in chain
[ivy:resolve]   found org.mockito#mockito-core;1.10.19 in chain
[ivy:resolve]   found org.objenesis#objenesis;2.1 in chain
[ivy:resolve]   found org.powermock#powermock-api-mockito;1.6.5 in chain
[ivy:resolve]   found org.powermock#powermock-api-mockito-common;1.6.5 in chain
[ivy:resolve]   found org.powermock#powermock-api-support;1.6.5 in chain
[ivy:resolve]   found org.powermock#powermock-core;1.6.5 in chain
[ivy:resolve]   found org.powermock#powermock-reflect;1.6.5 in chain
[ivy:resolve]   found org.objenesis#objenesis;2.2 in chain
[ivy:resolve]   found org.javassist#javassist;3.20.0-GA in chain
[ivy:resolve]   found org.powermock#powermock-module-junit4;1.6.5 in chain
[ivy:resolve]   found org.powermock#powermock-module-junit4-common;1.6.5 in chain
[ivy:resolve]   found org.skyscreamer#jsonassert;1.4.0 in chain
[ivy:resolve]   found com.vaadin.external.google#android-json;0.0.20131108.vaadin1 in chain
[ivy:resolve]   found org.slf4j#jcl-over-slf4j;1.7.25 in chain
[ivy:resolve]   found org.slf4j#slf4j-api;1.7.25 in chain
[ivy:resolve]   found org.springframework#spring-test;4.3.30.RELEASE in central
[ivy:resolve]   found com.fasterxml.jackson.core#jackson-databind;2.8.11.6 in chain
[ivy:resolve]   found javax.annotation#jsr250-api;1.0 in chain
[ivy:resolve]   found net.sf.ehcache#ehcache;2.10.6 in chain
[ivy:resolve]   found org.aspectj#aspectjrt;1.8.14 in chain
[ivy:resolve]   found org.springframework#spring-jdbc;4.3.30.RELEASE in central
[ivy:resolve]   found org.springframework#spring-tx;4.3.30.RELEASE in central
[ivy:resolve]   found org.springframework.security#spring-security-web;4.2.20.RELEASE in chain
[ivy:resolve]   found javax.servlet#javax.servlet-api;3.1.0 in chain
[ivy:resolve]   found org.codehaus.groovy#groovy-all;2.4.19 in chain
[ivy:resolve]   found org.spockframework#spock-core;0.7-groovy-2.0 in chain
[ivy:resolve]   found org.spockframework#spock-spring;0.7-groovy-2.0 in chain
[ivy:resolve] :: resolution report :: resolve 665ms :: artifacts dl 24ms
[ivy:resolve]   :: evicted modules:
[ivy:resolve]   javax.servlet#javax.servlet-api;3.0.1 by [javax.servlet#javax.servlet-api;3.1.0] in [default]
[ivy:resolve]   com.fasterxml.jackson.core#jackson-databind;2.8.11.3 by [com.fasterxml.jackson.core#jackson-databind;2.8.11.6] in [default]
[ivy:resolve]   com.fasterxml.jackson.core#jackson-core;2.8.10 by [com.fasterxml.jackson.core#jackson-core;2.8.11] in [default]
[ivy:resolve]   com.fasterxml.jackson.core#jackson-databind;2.8.11 by [com.fasterxml.jackson.core#jackson-databind;2.8.11.3] in [default]
[ivy:resolve]   org.slf4j#slf4j-api;1.7.16 by [org.slf4j#slf4j-api;1.7.22] in [default]
[ivy:resolve]   commons-logging#commons-logging;1.1.1 by [commons-logging#commons-logging;1.2] in [default]
[ivy:resolve]   commons-collections#commons-collections;3.2.1 by [commons-collections#commons-collections;3.2.2] in [default]
[ivy:resolve]   commons-beanutils#commons-beanutils;1.8.3 by [commons-beanutils#commons-beanutils;1.9.0] in [default]
[ivy:resolve]   com.lowagie#itext;2.1.7.js5-SNAPSHOT by [com.lowagie#itext;2.1.7] in [default]
[ivy:resolve]   log4j#log4j;1.2.14 by [log4j#log4j;1.2.17] in [default]
[ivy:resolve]   commons-digester#commons-digester;2.0 by [commons-digester#commons-digester;2.1] in [default]
[ivy:resolve]   org.freemarker#freemarker;2.3.15 by [org.freemarker#freemarker;2.3.23] in [default]
[ivy:resolve]   commons-lang#commons-lang;2.4 by [commons-lang#commons-lang;2.6] in [default]
[ivy:resolve]   org.codehaus.groovy#groovy-all;2.4.17 by [org.codehaus.groovy#groovy-all;2.4.19] in [default]
[ivy:resolve]   org.slf4j#slf4j-api;1.7.7 by [org.slf4j#slf4j-api;1.7.16] in [default]
[ivy:resolve]   com.fasterxml.jackson.core#jackson-core;2.7.3 by [com.fasterxml.jackson.core#jackson-core;2.8.11] in [default]
[ivy:resolve]   com.fasterxml.jackson.core#jackson-databind;2.3.3 by [com.fasterxml.jackson.core#jackson-databind;2.8.11.3] in [default]
[ivy:resolve]   org.slf4j#slf4j-api;1.7.22 by [org.slf4j#slf4j-api;1.7.25] in [default]
[ivy:resolve]   org.hamcrest#hamcrest-core;1.1 by [org.hamcrest#hamcrest-core;1.3] in [default]
[ivy:resolve]   org.objenesis#objenesis;2.1 by [org.objenesis#objenesis;2.2] in [default]
[ivy:resolve]   commons-codec#commons-codec;1.3 by [commons-codec#commons-codec;1.10] in [default]
[ivy:resolve]   org.codehaus.groovy#groovy-all;2.0.5 by [org.codehaus.groovy#groovy-all;2.4.19] in [default]
        ---------------------------------------------------------------------
        |                  |            modules            ||   artifacts   |
        |       conf       | number| search|dwnlded|evicted|| number|dwnlded|
        ---------------------------------------------------------------------
        |      default     |  140  |   0   |   0   |   22  ||  127  |   0   |
        ---------------------------------------------------------------------
[ivy:retrieve] :: retrieving :: com.example#my-spring4-app
[ivy:retrieve]  confs: [default]
[ivy:retrieve]  0 artifacts copied, 127 already retrieved (0kB/9ms)

compile:

run:
     [java] Start it up!

BUILD SUCCESSFUL
Total time: 1 second
```


**Note:** The `[java] Start it up!` line is the actual main method of our example application. While it doesn't (_yet_) 
actually launch a Spring application, it will indeed fail if the dependencies are not resolved in your `lib/` directory.

## Next Steps

Check out the `nesification` branch to see how easy it is to start using HeroDevs' NES for Spring packages.
