package com.itheima.activiti.gateway;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;

public class ExclusiveDeploy {
    public static void main(String[] args) {
        ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();

        RepositoryService repositoryService = defaultProcessEngine.getRepositoryService();

        Deployment deploy = repositoryService.createDeployment()
                .addClasspathResource("diagram/exclusiveGateway.bpmn")
                .addClasspathResource("diagram/exclusiveGateway.png")
                .name("排他网关案例")
                .deploy();
        // 4、输出部署的一些信息  ID的取值哪里来的？
        System.out.println(deploy.getId());
        System.out.println(deploy.getName());
    }
}
